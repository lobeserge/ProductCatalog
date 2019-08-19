package com.login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.connectdb.ConnectDB;

public class ValidateLogin {
	private static Connection conn ;

	public static boolean validate(String name,String pass){
		boolean currentstate=false;
		try{
			 checkconn();
			 PreparedStatement ps=conn.prepareStatement(
					 "select * from users where username=? and password=?");
					 ps.setString(1,name);
					 ps.setString(2,pass);
					 ResultSet rs=ps.executeQuery();
					 currentstate=rs.next();
				
		}
		catch(Exception e){System.out.println(e);}
		return currentstate;
		}
	
	public static void checkconn()
	   {
	    conn=ConnectDB.DbConnector();
	    if(conn==null)
	    {
	       System.out.print("connecton failed");
	      
	        
	    }
	    else
	    {
	       
	        System.out.print("Connection success");
	         
	         
	    }
	       
	}
	
}
