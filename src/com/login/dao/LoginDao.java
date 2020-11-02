package com.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {
	String url = "jdbc:mysql://localhost:3306/demo";
	String username="jian";
	String password="jian1987";
	String query = "select * from login where uname= ? and pass = ?";
	
	public boolean check(String name, String pass) {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url, username, password);
			PreparedStatement st = conn.prepareStatement(query);
			
			st.setString(1, name);
			st.setString(2, pass);
			
			ResultSet rs = st.executeQuery();
			
			if(rs.next()) {
				return true;
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}
}
