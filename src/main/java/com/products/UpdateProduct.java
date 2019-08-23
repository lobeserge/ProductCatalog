package com.products;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.connectdb.ConnectDB;


@WebServlet("/UpdateProduct")
public class UpdateProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
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
	        
	        FileItem  pid = (FileItem) items.get(0);
	        String prdid =  pid.getString();
	        out.println(prdid);
	        
	        
	        FileItem pname = (FileItem) items.get(1);
	        String   prdname =  pname.getString();
	        out.println(prdname);
	        
	        
	        FileItem pprice = (FileItem) items.get(2);
	        String   prdprice =  pprice.getString();
	        out.println(prdprice);
	        
	        
	        FileItem ppcat = (FileItem) items.get(3);
	        String   pdpcat =  ppcat.getString();
	        out.println(pdpcat);
	        
	     
	        
	        
	        // get uploaded file
	        FileItem file = (FileItem) items.get(4);
	        String sql="update  products set productname=? ,productprice=?, productcategory=? ,productimage=? where productid=?";
	        Connection con=ConnectDB.DbConnector();

	        PreparedStatement prs = con.prepareStatement(sql);
	        
	        prs.setString(1, prdname);
	        prs.setString(2, prdprice);
	        prs.setString(3, pdpcat);
	        prs.setBinaryStream(4, file.getInputStream(), (int) file.getSize());
	        prs.setString(5, prdid);
	        prs.executeUpdate();
	        
	       
	       System.out.print("succesfully updated");
	       con.close();
	    }
	    catch(Exception ex) {
	        out.println( "Error --> " + ex.getMessage());
	    }
	  
	    response.sendRedirect("/RetrieveProductServlet");
}
	}


