package com.myservlet1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class RegisterServlet extends HttpServlet
{
	Connection con;
	PreparedStatement pst;
	ResultSet rs;
	
	public void init()
	{
		
		String driver = getServletContext().getInitParameter("driver");
		String url= getServletContext().getInitParameter("url");
		String user= getServletContext().getInitParameter("username");
		String pass= getServletContext().getInitParameter("password");
		
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

	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		try
		{
		
		response.setContentType("text/html"); 
		PrintWriter out =response.getWriter();
		
		String user=request.getParameter("username");
		String pass=request.getParameter("password");
		
		String ques = request.getParameter("question");
        String ans = request.getParameter("answer");

        String query = "insert into user(username,password,question,answer) values(?,?,?,?)";

        PreparedStatement pst = con.prepareStatement(query);
        pst.setString(1, user);
        pst.setString(2, pass);
        pst.setString(3, ques);
        pst.setString(4, ans);

        int rs = pst.executeUpdate();

      

        if (rs> 0)
        {
            out.println("Registration Successful!");
           
        } else
        {
            out.println("Registration Failed!");
        }

    } 
	catch (Exception e) 
	{
        e.printStackTrace();
    }
}

		
		
	}
	

	

