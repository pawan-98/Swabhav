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
<s:form action="update">
		<s:hidden name="id" value="%{editStudent.id}"></s:hidden>
		<s:textfield name="name" label="Enter name" value="%{editStudent.name}"></s:textfield>
		<s:textfield name="gender" label="Enter gender" value="%{editStudent.gender}"></s:textfield>
		<s:submit value="Edit Info"></s:submit>
	</s:form>
</body>
</html>