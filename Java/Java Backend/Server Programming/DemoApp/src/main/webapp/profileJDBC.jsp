<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String url = "jdbc:mysql://localhost:3306/aliens";
		String username = "root";
		String password = "***";
		String sqlQuery = "SELECT * FROM Student";
		
		Class.forName("com.mysql.cj.jdbc.Driver");		
		Connection con = DriverManager.getConnection(url, username, password);
		Statement st = con.createStatement();
		
		ResultSet rs = st.executeQuery(sqlQuery);
		String userData = null;
		String colon = " : ";
		/* rs.next(); */
		while (rs.next()) {
            userData = rs.getInt(1) + " : " + rs.getString(2);
            out.println(userData);
            out.println("\n");
        }
		st.close();
		con.close();
	%>
	
	<%-- <%= rs.getInt(1) %>
	<%= colon %>
	<%= rs.getString(2) %> <br>
	<%  rs.next(); %>
	
	<%= rs.getInt(1) %>
	<%= colon %>
	<%= rs.getString(2) %> <br>
	<%  rs.next(); %>
	
	<%= rs.getInt(1) %>
	<%= colon %>
	<%= rs.getString(2) %> <br>
	<%  rs.next(); %>
	
	<%= rs.getInt(1) %>
	<%= colon %>
	<%= rs.getString(2) %> <br>
	<%  rs.next(); %>
	
	<%= rs.getInt(1) %>
	<%= colon %>
	<%= rs.getString(2) %> <br>
	<%  rs.next(); %>
	
	<%= rs.getInt(1) %>
	<%= colon %>
	<%= rs.getString(2) %> <br>
	<%  rs.next(); %> --%>
</body>
</html>