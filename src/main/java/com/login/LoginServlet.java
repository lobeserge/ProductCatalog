package com.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/views/login.jsp");
		rd.forward(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		if(ValidateLogin.validate(username, password)){
			HttpSession session =request.getSession();
			session.setAttribute("name", username);
			RequestDispatcher rd=request.getRequestDispatcher("/CatalogHome");
			rd.forward(request,response);
		}
		else{
			
			request.setAttribute("warning", "please enter valid credentials");
			RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/views/login.jsp");
			rd.forward(request,response);
		}
		
		
	}


}
