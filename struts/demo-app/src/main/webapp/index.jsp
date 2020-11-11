<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "s" uri = "/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="hello" method="post" >
		<label for="name">Please enter your name</label><br /> 
			<input type="text" name="name" /> 
			<input type="submit" value="Submit" />
	</form>
</body>
</html>