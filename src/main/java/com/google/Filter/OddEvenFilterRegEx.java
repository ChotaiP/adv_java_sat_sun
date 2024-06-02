package com.google.Filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/OddEvenServlet")
public class OddEvenFilterRegEx implements Filter
{
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		String numString = request.getParameter("num");
		
		boolean isError = false;
		
		if(numString.matches("[0-9]+") == false)
		{
			isError = true;
			request.setAttribute("numError", "Please Enter Number Properly ");
		}
		
		if(isError == true)
		{
			System.out.println("Error");
			RequestDispatcher rd = request.getRequestDispatcher("OddEvenInput.jsp");
			rd.forward(request, response);
		}
		else
		{
			System.out.println("Success");
			chain.doFilter(request, response);
		}
	}
		
	
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}
	public void destroy() {
		// TODO Auto-generated method stub
		
	}
}
