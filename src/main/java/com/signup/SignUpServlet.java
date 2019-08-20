package com.signup;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.connectdb.ConnectDB;


@WebServlet("/SignUpServlet")
public class SignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/signup.jsp").forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String realname=request.getParameter("signname");
		String username=request.getParameter("signuser");
		String password=request.getParameter("signpass");
		int status=0;
		try{
			String sql="insert into users values(?,?,?)";
			Connection conn= ConnectDB.DbConnector();
			PreparedStatement prs=conn.prepareStatement(sql);
			prs.setString(1, realname);
			prs.setString(2, username);
			prs.setString(3, password);
			status=prs.executeUpdate();
			if(status>0){
				System.out.print("succesully added");
			}
			else{
				System.out.print("failed  to add user");
			}
			
		}
		catch(Exception e){
			System.out.print(e);
		}
		request.getRequestDispatcher("/WEB-INF/views/signup.jsp").forward(request, response);
	}

}
