package com.myfilter;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class ServiceFilter2 implements Filter
{

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain c)
			throws IOException, ServletException 
	{
		System.out.println("Preprocessing request");
		
		String user=req.getParameter("username");
		if(user!=null)
		{
			c.doFilter(req, res);
		}
		
		else
		{
			RequestDispatcher rd = req.getRequestDispatcher("/View.html");
			rd.forward(req, res);
		}
		
		System.out.println("Postprocessing");
		
		
	}
	
	public void init(FilterConfig fconfig)
	{
		
		
	}
	
	public void destroy()
	{
		
	}
	
	
	

}
