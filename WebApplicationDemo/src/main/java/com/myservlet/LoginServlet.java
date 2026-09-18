package com.myservlet;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet 
{
	Connection con;
	PreparedStatement pst;
	ResultSet rs;
	
	public void init()
	{
	  
		String driver=getServletContext().getInitParameter("driver");
			String url=getServletContext().getInitParameter("url");
			String user=getServletContext().getInitParameter("username");
			String pass=getServletContext().getInitParameter("password");
			try
			{
			Class.forName(driver);
			con=DriverManager.getConnection(url,user,pass);
			}
			
			catch(Exception e)
			{
				e.printStackTrace();
			}
			}
		
	
protected void doPost(HttpServletRequest request,HttpServletResponse response)
{
	try
	{
		response.setContentType("text/html"); 
		PrintWriter out =response.getWriter();
		//out.println("Hello World");
		
	
		String user=request.getParameter("username");
		String pass=request.getParameter("password");
		
		String query = "select*from user where username=?  and password=?";
		pst=con.prepareStatement(query);
		
	pst.setString(1, user);
	pst.setString(2, pass);
	
	rs=pst.executeQuery();
	
	/*
	if(rs.next())
	{
	   out.println("Valid user.....");
	}
	else
	{
		 out.println("InValid user!!!!!");
	}
	*/
	
	String companyName=getServletConfig().getInitParameter("company");
	companyName="@"+companyName+".com";
	
	
	//servlet-collaberation
	
     RequestDispatcher rd=null;

     if(rs.next())
     {
    	 //create a session
    	 HttpSession session = request.getSession(true);
    	 String sessionId = session.getId();
    	 System.out.println("session id..."+sessionId);
    	 session.setAttribute("username", user);
    	 
      //   rd = request.getRequestDispatcher("/Home.html");
         rd = request.getRequestDispatcher("/s2");
         rd.forward(request, response);
    	 
         //Redirectio to talk to another web app
    	// response.sendRedirect("https://chatgpt.com/");
     }
     else
     {
         rd = request.getRequestDispatcher("/View.html");
         rd.include(request, response);
         out.println("Invalid Username or password");
     }
	
	
	}
	catch(Exception e)
	{
		e.printStackTrace();	
	}
	
       
}  

public void destroy()
{
	try
	{
	con.close()	;
	}
	
	catch(Exception e)
	{
		e.printStackTrace();
	}
}

  
}