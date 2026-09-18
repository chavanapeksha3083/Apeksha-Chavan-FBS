<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

 <jsp:useBean id="bean" class="com.myusebean.ServiceBean" scope="request"/>

 <jsp:setProperty name="bean" property="*"/>
 <p>You have provided following type of account</p>

 <p>you have following account</p>
 <jsp:getProperty property="type" name="bean"/>
 <p>Services provided below</p>
  <jsp:getProperty property="serviceStatus" name="bean"/>
 
 
 