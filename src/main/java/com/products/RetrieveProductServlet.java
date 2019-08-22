package com.products;

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

import com.category.Category;
import com.category.CategoryService;
import com.connectdb.ConnectDB;


@WebServlet("/RetrieveProductServlet")
public class RetrieveProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProductService serviceclear=new ProductService();
		serviceclear.clearlist();
try{
			
			String sql="select productid,productname,productprice,productcategory from products";
			Connection conn=ConnectDB.DbConnector();
			PreparedStatement prs=conn.prepareStatement(sql);
			ResultSet rs=prs.executeQuery();
			while(rs.next()){
				ProductService service=new ProductService();
				service.addProducts((new Products(rs.getString("productid"),rs.getString("productname"),rs.getString("productprice"),rs.getString("productcategory"))));
			}
			
		}
		catch(Exception e){
			System.out.print(e);
		}
	    response.sendRedirect("/ProductHomeServlet");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd=request.getRequestDispatcher("/RetrieveProductServlet");
		rd.forward(request,response);
	}

}
