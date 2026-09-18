package com.myservlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class Myservlet extends HttpServlet 
{

	
	protected void doPost(jakarta.servlet.http.HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		
		PrintWriter out =response.getWriter();
		System.out.println("IN servlet---2");
		
		 HttpSession session = request.getSession(false);
		System.out.println("IN servlet--2 session id "+session.getId());
		String name=(String)session.getAttribute("username");
		System.out.println("username in session is...."+name);
		
		RequestDispatcher rd =request.getRequestDispatcher("/Home.html");
		
		rd.forward(request, response);
		//out.println("Hello World");
	}

}
