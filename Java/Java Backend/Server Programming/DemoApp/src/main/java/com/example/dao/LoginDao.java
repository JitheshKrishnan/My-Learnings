package com.example.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {
	
	String query = "SELECT * FROM Login WHERE uname=? AND pass=?";
	String url = "jdbc:mysql://localhost:3306/aliens";
	String username = "root";
	String password = "***";
	
	public boolean checkCredentials(String uname, String pass) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);
			PreparedStatement st = con.prepareStatement(query);
			st.setString(1, uname);
			st.setString(2,  pass);
			ResultSet rs = st.executeQuery();
			if(rs.next()) {
				st.close();
				con.close();
				return true;
			}
		}
		catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}
}
