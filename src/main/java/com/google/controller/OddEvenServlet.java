package com.google.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/OddEvenServlet")
public class OddEvenServlet extends HttpServlet
{
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String numString = request.getParameter("num");
		
		int num = Integer.parseInt(numString);
		
		if(num%2==0)
		{
			request.setAttribute("msg", "The number is Even");
		}
		else
		{
			request.setAttribute("msg", "The number is Odd");
		}
		
		request.setAttribute("num", num);
		
		RequestDispatcher rd = request.getRequestDispatcher("OddEvenOutput.jsp");
		rd.forward(request, response);
	}
	
}
