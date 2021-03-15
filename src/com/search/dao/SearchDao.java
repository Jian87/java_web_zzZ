package com.search.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.video.Video;

public class SearchDao {
	String url = "jdbc:mysql://localhost:3306/demo";
	String username = "";
	String password = "";
	String query = "select * from videos";
	
	public List<Video> search(String content) {
		List<Video> ans = new ArrayList<>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url, username, password);
			PreparedStatement st = conn.prepareStatement(query);
			
			ResultSet rs = st.executeQuery();
			
			while(rs.next()) {
				String ename = rs.getString("ename");
				String cname = rs.getString("cname");
				String title = rs.getString("vtitle");
				String link = rs.getString("link");
				String s = (ename + " " + cname + " " + title + " ").toLowerCase();

				if(s.indexOf(content) != -1)
					ans.add(new Video(ename, cname, title, link));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return ans;
	}
}
