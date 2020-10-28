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
if(cookies!=null ){
	for (int i = 0; i < cookies.length; i++) {
		
		Cookie cookie = cookies[i];
		if(cookie.getName().equals("color")){
			myColor=cookie.getValue();
			out.write("Cookie found");
		}
	 }
}
else{
	out.write("Cookie not found");
}

%>

<BODY BGCOLOR="<%= myColor %>">
</body>
</html>