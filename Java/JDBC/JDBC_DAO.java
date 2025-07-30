package JDBC;

import java.sql.*;

public class JDBC_DAO {
    public static void main(String a[]) {
        StudentDAO dao = new StudentDAO();

        Student s1 = new Student();
        s1.userId = 6;
        s1.userName = "Nandy";

        // dao.connect();
        // dao.addStudent(s1);

        dao.connect();
        Student s2 = dao.getStudent(6);

        System.out.println(s2.userName);
    }
}

class StudentDAO {
    Connection con = null;

    public void connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aliens", "root", "jithu2580");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public Student getStudent(int userId) {
        Student s = new Student();
        String query = "SELECT userName FROM Student WHERE userId = " + userId;
        s.userId = userId;

        Statement st;
        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            rs.next();
            String name = rs.getString(1);
            s.userName = name;
            st.close();
            con.close();
            return s;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public void addStudent(Student s) {
        String query = "INSERT INTO Student VALUES (?,?)";
        PreparedStatement pst;
        try {
            pst = con.prepareStatement(query);
            pst.setInt(1, s.userId);
            pst.setString(2, s.userName);
            pst.executeUpdate();
            pst.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class Student {
    int userId;
    String userName;
}
