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


@WebServlet("/AddCategoryServlet")
public class AddCategoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/views/welcome.jsp");
		rd.forward(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
    
    String catname=request.getParameter("catname");
	String catdesc=request.getParameter("catdescription");
	try{
		String sql="insert into category values(?,?)";
		Connection conn=ConnectDB.DbConnector();
		PreparedStatement prs=conn.prepareStatement(sql);
		prs.setString(1, catname);
		prs.setString(2, catdesc);
		prs.executeUpdate();
		System.out.print("category added");
	}
	catch(Exception e){
		System.out.print(e);
	}
	response.sendRedirect("/RetrieveCategory");
}
}