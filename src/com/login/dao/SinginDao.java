package com.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SinginDao {
	String url="jdbc:mysql://localhost:3306/demo";
	String username ="";
	String password ="";
	
	String statement = "insert into login(uname, pass)" +  " values(?, ?)";
	
	public void insert(String name, String pass, String email) throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url, username, password);
			
			PreparedStatement ps = conn.prepareStatement(statement);
			
			ps.setString(1, email);
			ps.setString(2,  pass);
			
			ps.execute();
			
			conn.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
}
