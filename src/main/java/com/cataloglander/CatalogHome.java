package com.cataloglander;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/CatalogHome")
public class CatalogHome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/views/login.jsp");
		rd.forward(request,response);
	}
   
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if(request.getSession().getAttribute("name")!=null){
			RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/views/welcome.jsp");
			rd.forward(request,response);
		}
		else{
			request.setAttribute("notlogin", "please you are currently logout");
			request.getSession().invalidate();
			request.getRequestDispatcher("/LoginServlet").forward(request, response);
		}
	}

}
