<%@page import="com.model.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Welcome</h3>
<%
  User obj = (User) session.getAttribute("key1");
  if(obj != null){
  	out.println(obj.getUserId());
  	out.println(obj.getPassword());
  }else{
	  out.println("No Data");
  }
%>
</body>
</html>