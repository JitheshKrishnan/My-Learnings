package com.example.web;

import java.sql.*;
import com.example.web.model.Alien;

public class AlienDao {
	
	public Alien getAlien(int aid) {
		Alien alien = new Alien();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aliens", "root", "***");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM Student WHERE userId=" + aid);
			if(rs.next()) {
				alien.setAid(rs.getInt("userId"));
				alien.setAname(rs.getString("userName"));
			}
			rs.close();
			st.close();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return alien;
	}
}
