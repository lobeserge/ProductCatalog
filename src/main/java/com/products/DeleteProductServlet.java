package com.products;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.connectdb.ConnectDB;


@WebServlet("/DeleteProductServlet")
public class DeleteProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		try{
			String sql="delete from  products where productid=?";
			Connection conn=ConnectDB.DbConnector();
			PreparedStatement prs=conn.prepareStatement(sql);
			prs.setString(1, request.getParameter("prdtdel"));
			prs.executeUpdate();
			System.out.print("deleted product");
		}
		catch(Exception e){
			System.out.print(e);
		}
		response.sendRedirect("/RetrieveProductServlet");
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
