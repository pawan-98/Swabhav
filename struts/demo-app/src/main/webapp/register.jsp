<%@ taglib uri="/struts-tags" prefix="s" %>  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<s:head />
</head>
<body>

<s:form action="registerDo">
	<s:textfield name="name" label="Please enter your name"></s:textfield>
	<s:textfield name="age" label="Age:-"></s:textfield>
	<s:textfield name="address" label="Enter your address"></s:textfield>
	<s:submit value="Submit"></s:submit> 
</s:form>
</body>
</html>