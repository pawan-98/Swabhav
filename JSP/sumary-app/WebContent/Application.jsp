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
	int value;
	if(application.getAttribute("value")==null){
		value=0;
	}
	else{
	value = (int)application.getAttribute("value");
	}
	int oldValue= value;
	value++;
	application.setAttribute("value", value);
	out.print("Old: "+oldValue);
	out.print("<br>New: "+value);

%>
<br>
<a href="Summary.jsp">Summary</a>
</body>
</html>