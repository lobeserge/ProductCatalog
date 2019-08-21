package com.products;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.connectdb.ConnectDB;

@WebServlet("/AddProductServlet")
public class AddProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher rd=request.getRequestDispatcher("WEB-INF/views/addproduct.jsp");
		rd.forward(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	String id=request.getParameter("id");
	String name=request.getParameter("name");
	String price=request.getParameter("price");
	String pcat=request.getParameter("pcat");
	String myloc=request.getParameter("image");
	
		System.out.print(id);
		System.out.print(name);
		System.out.print(price);
		System.out.print(pcat);
		/*InputStream fis=null;
		Part imagedir=request.getPart("imgprd");
		String  idprd=	request.getParameter("idprd");
		String  nameprd=request.getParameter("nameprd");
		String priceprd=request.getParameter("priceprd");
		String catprd=request.getParameter("catprd");
		*/
		FileInputStream fis=null;
		
		try{
			File image= new File(myloc);
			fis=new FileInputStream(image);
	String sql="insert into products values(?,?,?,?,?)";
	Connection conn=ConnectDB.DbConnector();
	PreparedStatement prs=conn.prepareStatement(sql);
	prs.setString(1,id );
	prs.setString(2,name );
	prs.setString(3, price);
	prs.setString(4, pcat);
	prs.setBinaryStream(5, (InputStream) fis, (int) (image.length()));
	/*fis=imagedir.getInputStream();*/
	prs.executeUpdate();
		}
	
	catch(Exception e){
		System.out.print(e);
	}
		
		RequestDispatcher rd=request.getRequestDispatcher("WEB-INF/views/addproduct.jsp");
		rd.forward(request,response);
	
}
}