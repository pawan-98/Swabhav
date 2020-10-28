<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	String userName = request.getParameter("userName");
	String password = request.getParameter("password");
	if(userName.equals("admin") && password.equals("admin")){
		out.print("Login succesfull");
	}else{
		out.print("login Failed!!");
	}
%>
</body>
</html>