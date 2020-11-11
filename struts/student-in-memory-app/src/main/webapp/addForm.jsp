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
	<h1>Add Student Form:-</h1>
	<s:form action="doAdd">
		<s:textfield name="name" label="Name:- " ></s:textfield>
		<s:textfield name="gender" label="Gender:- "></s:textfield>
		<s:submit value="Submit"></s:submit>
	</s:form>
	
	
	
</body>
</html>