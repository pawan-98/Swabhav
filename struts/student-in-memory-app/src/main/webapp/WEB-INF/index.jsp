<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Index</h1>
<form action="loginDo" method="post">
		
		<label for="name">Please enter your name</label><br> 
		<input type="text" name="name" /> <br>
		
		<label for="password">Password:-</label><br> 
		<input type="password" name="password" /><br>
		<input type="submit" value="Submit" />
	</form>
	<p style = "color:red" ><s:property value="message"/></p>
</body>
</html>