package com.google.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calcPercServlet")
public class calcPercServlet extends HttpServlet{
	

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String name = request.getParameter("name");
		String mathsStr = request.getParameter("maths");
		String scienceStr = request.getParameter("science");
		String englishStr = request.getParameter("english");
		
		String AlphaRegEx = "[a-zA-Z]+";
		
		String DigitRegEx = "[0-9]{1,3}";
		
		
		boolean isError = false;
		String error = "";
		if(name == null || name.trim().length() == 0) {
			isError = true;
			error = "Enter Name";
		}
		else {
			if(name.matches(AlphaRegEx) == false) {
				System.out.println("Enter Valid Name");
			}
		}
		
		if(mathsStr == null || mathsStr.trim().length() == 0) {
			isError = true;
			error += "<br>Enter Maths Marks";
		}
		else {
			if(name.matches(DigitRegEx) == false) {
				System.out.println("Enter Valid Marks of Maths ");
			}
		}
		
		if(scienceStr == null || scienceStr.trim().length() == 0) {
			isError = true;
			error += "<br>Enter Science Marks";
		}
		else {
			if(name.matches(DigitRegEx) == false) {
				System.out.println("Enter Valid Marks of Science ");
			}
		}
		
		if(englishStr == null || englishStr.trim().length() == 0) {
			isError = true;
			error += "<br>Enter English Marks";
		}
		else {
			if(name.matches(DigitRegEx) == false) {
				System.out.println("Enter Valid Marks of english ");
			}
		}
		
		if(isError == true)
		{
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();		
			out.print("<html><body>");
			out.print("Please Correct below entites <br>");
			out.print(error);
			out.print("</body></html>");
		}
		else {
			Integer maths = Integer.parseInt(mathsStr);
			Integer science = Integer.parseInt(scienceStr);
			Integer english = Integer.parseInt(englishStr);
			
			Float perc = (maths + science + english) / 3.0f;
			
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.print("<html><body>");
			out.print("Hey "+ name + "<br>");
			out.print("Your Percentage: "+perc);
			out.print("<body><html>");
			
		}
		
		
		
		
		
	}
}
