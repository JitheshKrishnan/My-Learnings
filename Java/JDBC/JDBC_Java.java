package JDBC;

import java.sql.*;

public class JDBC_Java {
    public static void main(String a[]) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/aliens";
        String uname = "root";
        String pass = "jithu2580";
        String query1 = "SELECT * FROM Student";
        String query2 = "INSERT INTO Student VALUES (4, 'VP')";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        Statement st = con.createStatement();

        // update(query2, st);
        get(query1, st);

        // set(5, "Varsh", con);
        st.close();
        con.close();
    }

    public static void update(String query, Statement st) throws SQLException {
        int count = st.executeUpdate(query);
        System.out.println(count + " row/s affected");
    }

    public static void get(String query, Statement st) throws SQLException {
        ResultSet rs = st.executeQuery(query);
        String userData = null;
        while (rs.next()) {
            userData = rs.getInt(1) + " : " + rs.getString(2);
            System.out.println(userData);
        }
    }

    public static void set(int a, String s, Connection con) throws SQLException {
        String query = "INSERT INTO Student VALUES (?,?)";
        PreparedStatement st = con.prepareStatement(query);
        st.setInt(1, a);
        st.setString(2, s);
        int count = st.executeUpdate();
        System.out.println(count + " row/s affected");
    }
}
