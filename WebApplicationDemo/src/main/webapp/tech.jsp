<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

    <%
     String tech= request.getParameter("tech");
    
    if(tech.equals("java"))
    {
    %>
    <jsp:forward page="java.html"/>
    
    <%
    }
    else
    {
    
    %>
    <jsp:forward page="python.jsp"/>
    
    
    <%
    }
    %>