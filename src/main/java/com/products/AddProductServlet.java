package com.products;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.connectdb.ConnectDB;

@WebServlet("/AddProductServlet")
public class AddProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher rd=request.getRequestDispatcher("WEB-INF/views/addproduct.jsp");
		rd.forward(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out = response.getWriter();
	    try {
	        // Apache Commons-Fileupload library classes
	        DiskFileItemFactory factory = new DiskFileItemFactory();
	        ServletFileUpload sfu  = new ServletFileUpload(factory);

	        if (! ServletFileUpload.isMultipartContent(request)) {
	            System.out.println("Sorry. No file uploaded");
	            return;
	        }

	        // parse request
	        List<FileItem> items = sfu.parseRequest(request);
	        out.print(items);
	        
	        FileItem  id = (FileItem) items.get(0);
	        String prdid =  id.getString();
	        out.println(prdid);
	        
	        FileItem name = (FileItem) items.get(1);
	        String   prdname =  name.getString();
	        out.println(prdname);
	        
	        
	        FileItem price = (FileItem) items.get(2);
	        String   prdprice =  price.getString();
	        out.println(prdprice);
	        
	        
	        FileItem pcat = (FileItem) items.get(3);
	        String   pdpcat =  pcat.getString();
	        out.println(pdpcat);
	        
	     
	        
	        
	        // get uploaded file
	        FileItem file = (FileItem) items.get(4);
	        String sql="insert into products values(?,?,?,?,?)";
	        Connection con=ConnectDB.DbConnector();

	        PreparedStatement prs = con.prepareStatement(sql);
	        prs.setString(1, prdid);
	        prs.setString(2, prdname);
	        prs.setString(3, prdprice);
	        prs.setString(4, pdpcat);
	        prs.setBinaryStream(5, file.getInputStream(), (int) file.getSize());
	        prs.executeUpdate();
	        
	       
	       System.out.print("succesfully added");
	       con.close();
	    }
	    catch(Exception ex) {
	        out.println( "Error --> " + ex.getMessage());
	    }
	  
	    response.sendRedirect("/RetrieveProductServlet");
}
}