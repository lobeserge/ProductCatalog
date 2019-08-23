package com.products;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UpdateProductRetrieve")
public class UpdateProductRetrieve extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String gprdid=request.getParameter("mprdtid");
		String gprdname=request.getParameter("mprdname");
		String gprdprice=request.getParameter("mprdprice");
		String gprdcat=request.getParameter("mprdcat");
		
		request.setAttribute("prd-id", gprdid);
		request.setAttribute("prd-name", gprdname);
		request.setAttribute("prd-price", gprdprice);
		request.setAttribute("prd-cat", gprdcat);
		
		request.getRequestDispatcher("/WEB-INF/views/editproduct.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
