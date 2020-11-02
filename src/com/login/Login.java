package com.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("email");
		String pass = request.getParameter("pass");
		
		// get data from our db
		HttpSession session = request.getSession();
		
		session.setAttribute("username", name);
		
		if(name.equals("admin@123") && pass.equals("1234")) {
			response.sendRedirect("welcome.jsp");
		} else {
			response.sendRedirect("index.jsp");
		}
	}
}
