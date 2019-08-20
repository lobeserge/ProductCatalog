package com.category;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/CategoryHomeServlet")
public class CategoryHomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   CategoryService catr=new CategoryService();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("categories",catr.retrieveCategory());
		RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/views/managecategory.jsp");
		    rd.forward(request,response);
	}

}
