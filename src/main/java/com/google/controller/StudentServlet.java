package com.google.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String studentName = request.getParameter("fullName");
		String gender = request.getParameter("gender");
//		String hobbies = request.getParameterValues("");
		
		System.out.println("Student Servlet Called");
		
		PrintWriter out = response.getWriter();
		
		out.print("<br>fullName");
	}
}
