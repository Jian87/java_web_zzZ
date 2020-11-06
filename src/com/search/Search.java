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
		HttpSession session = request.getSession();
		String content = "";
		if(session.getAttribute("search-content") != null && request.getParameter("search").isEmpty()) {
			content = String.valueOf(session.getAttribute("search-content"));
		} else {
			content = request.getParameter("search");
		}
				
		session.setAttribute("search-content", content);
		request.setAttribute("search", content);
		
		if(!content.isEmpty()) {
			response.sendRedirect("display.jsp?search=" + content);
		}
	}
}
