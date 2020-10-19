<%@ page import="com.model.User"  %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Welcome to JSP</h3>


<%
 User user = new User();
 user.setUserId(100);
 user.setUserName("Hundred");
 user.setPassword("Secret");
%>
<%= user.getUserName() %>
<br>
<%! int a = 10; %>
<%-- <%! int add (int val1, int val2) %> --%>
<%
java.util.Date var = new java.util.Date();
out.print("Today date is : "+var);

%>
<br>
<%
out.println("int a value is" +a);
%>
</body>
</html>