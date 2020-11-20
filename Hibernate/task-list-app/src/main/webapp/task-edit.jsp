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

		<s:form action="taskEditDo">
			<s:hidden name="userId" value="%{userId}"></s:hidden>
			<s:hidden name="taskId" value="%{taskId}"></s:hidden>
			<s:textfield name="title" label="Get Title:-" ></s:textfield>
			<s:checkbox name="checkBoxValue"  label="Done:-"></s:checkbox>
			
		<s:submit class="btn btn-primary" value="Submit"></s:submit>
	</s:form>

</body>
</html>