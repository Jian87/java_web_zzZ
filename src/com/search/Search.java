package com.search;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.search.dao.SearchDao;
import com.video.Video;

/**
 * Servlet implementation class Search
 */
@WebServlet("/Search")
public class Search extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String content = request.getParameter("search");
		
		SearchDao sd = new SearchDao();
		
		List<Video> res = sd.search(content);
		
		String searchResult = "";
		
		for(Video v: res) {
			searchResult += v.toString() + "#";
		}
		
		HttpSession session = request.getSession();
		
		session.setAttribute("search-result", searchResult);

		
		response.sendRedirect("welcome.jsp");
	}
}
