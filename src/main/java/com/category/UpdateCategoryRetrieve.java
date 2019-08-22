package com.category;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/UpdateCategoryRetrieve")
public class UpdateCategoryRetrieve extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name=request.getParameter("catname");
		String desc=request.getParameter("catdesc");
		request.setAttribute("cat-name", name);
		request.setAttribute("cat-desc", desc);
		request.getRequestDispatcher("/WEB-INF/views/editcat.jsp").forward(request, response);
		
	}

}
