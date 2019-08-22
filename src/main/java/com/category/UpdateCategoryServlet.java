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


@WebServlet("/UpdateCategoryServlet")
public class UpdateCategoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		    String catname=request.getParameter("cat-name");
			String catdesc=request.getParameter("cat-description");
			try{
				String sql="update  category set categoryDescritpion=? where categoryname=?";
				Connection conn=ConnectDB.DbConnector();
				PreparedStatement prs=conn.prepareStatement(sql);
				prs.setString(1, catdesc);
				prs.setString(2, catname);
				prs.executeUpdate();
				System.out.print("category updated");
			}
			catch(Exception e){
				System.out.print(e);
			}
			response.sendRedirect("/RetrieveCategory");
	}

}
