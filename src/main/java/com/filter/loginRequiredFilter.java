package com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter(urlPatterns={"/ProductHomeServlet","/RetrieveProductServlet","/AddProductServlet","/DeleteProductServlet","/RetrieveCategory",
		"/UpdateCategoryServlet","/CategoryHomeServlet"}) 

public class loginRequiredFilter  implements Filter {

	@Override
	public void destroy() {
		
		
	}

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,
			FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest request=(HttpServletRequest)servletRequest;
		System.out.println(request.getRequestURI());
		
		if(request.getSession().getAttribute("name")!=null){
			
			chain.doFilter(servletRequest, servletResponse);
		}
		else{
			request.setAttribute("errrorlogin", "please login is required");
			RequestDispatcher rd=request.getRequestDispatcher("/LoginServlet");
			rd.forward(servletRequest, servletResponse);
		}
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	
	
}
