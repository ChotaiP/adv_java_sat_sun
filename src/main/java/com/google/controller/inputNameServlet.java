package com.google.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/inputNameServlet")
public class inputNameServlet extends HttpServlet
{
	public void service(HttpServletRequest request, HttpServletResponse response ) throws IOException
		{
			String FirstName = request.getParameter("FirstName");
			FirstName = FirstName.toUpperCase();
			System.out.println(FirstName);
			
			PrintWriter out = response.getWriter();
			
			out.print(FirstName);
		}
	
}
