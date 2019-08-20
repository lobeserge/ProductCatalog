package com.category;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.connectdb.ConnectDB;

@WebServlet("/RetrieveCategory")
public class RetrieveCategory extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		 RequestDispatcher rd=request.getRequestDispatcher("/CategoryHomeServlet");
		    rd.forward(request,response);
		try{
			
			String sql="select * from category";
			Connection conn=ConnectDB.DbConnector();
			PreparedStatement prs=conn.prepareStatement(sql);
			ResultSet rs=prs.executeQuery();
			while(rs.next()){
				CategoryService service=new CategoryService();
				service.addcategroy(new Category(rs.getString("categoryName"),rs.getString("categoryDescritpion")));
			}
			
		}
		catch(Exception e){
			System.out.print(e);
		}
		
	}

}
