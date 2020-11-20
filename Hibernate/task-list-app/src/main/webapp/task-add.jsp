<%@ taglib prefix="s" uri="/struts-tags"%>
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
	<h1>Task Form:-</h1>
	<form action="taskAddDo">
	<s:hidden name="userId" value="%{userId}"></s:hidden>
		<label>Title:-</label>
		<input type="text" id="title" name="title">
		<br>
		<br>
		<label>Date:-</label>
		<input type="date" id="date" name="date">
		<br>
		<br>
		<input type="submit" value="Submit">
	</form>
</body>
</html>