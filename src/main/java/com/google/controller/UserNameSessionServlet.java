package com.google.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/UserNameSessionServlet")
public class UserNameSessionServlet extends HttpServlet
{
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String userName = request.getParameter("userName");

		// server -> get
		HttpSession session = request.getSession();// get the existing session or create new if not found
		// getSession(false);

		session.setAttribute("userName", userName);
		session.setMaxInactiveInterval(60*10);

		response.sendRedirect("SessionHome.jsp");
	}
}
