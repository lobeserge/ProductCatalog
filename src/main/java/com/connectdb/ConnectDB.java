package com.connectdb;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDB {
	 public static Connection DbConnector()
	    {
	        
	      Connection con;
	        try{
	            Class.forName("com.mysql.jdbc.Driver");
	            con=DriverManager.getConnection("jdbc:mysql://localhost/productcatalog" , "root", "lobe");
	           System.out.print("\nDatabase connected\n");
	            return con;
	            
	        }catch(Exception ex){
	            return null;
	        }
	           
	    }
}
