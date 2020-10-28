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

Cookie cookie=new Cookie("name","Pawan");
cookie.setMaxAge(60*60*24);
response.addCookie(cookie);
%>
<h1>Cookie Created</h1>
<a href="getCookie.jsp">View</a>

</body>

</html>