
<%@ page import="java.util.Date" %>

<html>
<p>Welcome..........</p>

<%
String dateTime=new Date().toString();
out.println("Current date and time is....."+dateTime);
%>

<%
  session.setAttribute("TechName","java full stack");
%>


<%!
   int i=100;
public int getVal()
{
	i=i+100;
	return i;
}

%>


<%! static int count = 0; %>

<%
count++;
out.println("Total count is: " + count);
%>



</html>
