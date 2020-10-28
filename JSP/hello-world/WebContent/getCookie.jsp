<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>


<%
String myColor="White";
Cookie[] cookies = null;
cookies = request.getCookies();
if(cookies!=null){
	out.write("Cookie found");
	myColor="green";
}
else{
	out.write("Cookie not found");
}

%>

<BODY BGCOLOR="<%= myColor %>">
</body>
</html>