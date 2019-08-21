package com.category;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.connectdb.ConnectDB;


@WebServlet("/DeleteCategoryServlet")
public class DeleteCategoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
			try{
				String sql="delete from  category where categoryName=? and categoryDescritpion=?";
				Connection conn=ConnectDB.DbConnector();
				PreparedStatement prs=conn.prepareStatement(sql);
				prs.setString(1, request.getParameter("catname"));
				prs.setString(2, request.getParameter("catdesc"));
				prs.executeUpdate();
				System.out.print("deleted category");
			}
			catch(Exception e){
				System.out.print(e);
			}
			response.sendRedirect("/RetrieveCategory");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
