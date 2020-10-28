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
	out.print("Session="+session.getAttribute("value"));
	out.print("<br>Application="+application.getAttribute("value"));
	%>
	<br>
	<a href="Session.jsp">Session</a>
	<a href="Application.jsp">Application</a>
</body>
</html>