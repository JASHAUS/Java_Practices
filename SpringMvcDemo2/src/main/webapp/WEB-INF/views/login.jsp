<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
<style type="text/css">
.error {
	color: red;
}

.input {
  width: 50%;
  padding: 5px 10px;
  margin: 8px 0;
  text-align:ceneter
  box-sizing: border-box;
}
.submit {
  background-color: #4CAF50;
  color: white;
  padding: 12px 20px;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}
.container {
 
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
}
</style>
</head>
<body>
<form:form class ="container" action="login" method="post" modelAttribute="alias">
 <h3>Login here...</h3>
 Enter User Id : <br><form:input path = "userId" class="input"/>
                 <form:errors path = "userId"> </form:errors><br>
Enter user name: <br><form:input path = "userName" class ="input"/> 
                 <form:errors path = "userName"  cssClass="error"> </form:errors><br>
Enter password : <br><form:password path = "password"  class ="input" />
                 <form:errors path = "password" cssClass="error"> </form:errors><br>
                 <input class="submit" type="submit" value="Login">
</form:form>
	<%-- <form action="login" method="post">
		Enter User Id 	 <input type="text" name="userId">
		Enter User Name  <input type="text" name="userName">
		Enter Password	 <input type="password" name="password">

 						 <input type="submit" value="Login">

 </form> --%>
</body>
</html>