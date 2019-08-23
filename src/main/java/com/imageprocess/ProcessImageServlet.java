package com.imageprocess;

import java.io.IOException;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.connectdb.ConnectDB;


@WebServlet("/ProcessImageServlet")
public class ProcessImageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		byte[ ] imgData = null ;
		 PreparedStatement prs=null;
		try {
		String sql="select productimage from products where productid='"+request.getParameter("prdtdel")+"'";
		Connection con=ConnectDB.DbConnector();
		prs = con.prepareStatement(sql);
		ResultSet rs=prs.executeQuery();
		if (rs.next()) {
		Blob image = rs.getBlob(1);
		imgData = image.getBytes(1,(int)image.length());
		}
		else {
		System.out.println("Display Blob Example");
		System.out.println("image not found for given id>");
		return;
		}
		// display the image
		response.setContentType("image/jpg");
		OutputStream o = response.getOutputStream();
		o.write(imgData);
		o.flush();
		o.close();
		} catch (Exception e) {
		System.out.println("Unable To Display image");
		System.out.println("Image Display Error=" + e.getMessage());
		return;
		} 
			
	}

	

}
