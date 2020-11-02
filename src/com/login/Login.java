package com.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.login.dao.LoginDao;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("email");
		String pass = request.getParameter("pass");
		String cook = request.getParameter("cook");
		
		//System.out.println(cook);
		// if cook is remember, should put the name and pass into cookie
		
		// get data from our db
		LoginDao dao = new LoginDao();
		
		if(dao.check(name, pass)) {
			HttpSession session = request.getSession();
			session.setAttribute("username", name);
			response.sendRedirect("welcome.jsp");
		} else {
			response.sendRedirect("index.jsp");
		}
	}
}
