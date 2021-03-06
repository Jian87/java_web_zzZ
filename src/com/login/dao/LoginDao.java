package com.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {
	String url = "jdbc:mysql://localhost:3306/demo";
	String username="";
	String password="";
	String query = "select * from login where uname= ? and pass = ?";
	
	public boolean check(String name, String pass) {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url, username, password);
			PreparedStatement st = conn.prepareStatement(query);
			
			st.setString(1, name);
			st.setString(2, pass);
			
			ResultSet rs = st.executeQuery();
			boolean res = false;
			
			if(rs.next()) {
				res = true;
			}
			
			conn.close();
			
			return res;
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}
}
