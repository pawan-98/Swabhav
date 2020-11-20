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

	<s:form action="updateDo">
		<div class="form-group">
			<s:textfield name="firstName" label="First Name:- "></s:textfield>
		</div>
		<div class="form-group">
			<s:textfield name	="lastName" label="Last Name:- "></s:textfield>
		</div>
		<div class="form-group">
			<s:textfield name	="email" label="Email:- "></s:textfield>
		</div>
		<div class="form-group">
			<s:textfield name="username" label="User Name:- "></s:textfield>
		</div>
		
		<s:password key="password" label="Password" />

		<s:submit class="btn btn-primary" value="Submit"></s:submit>
	</s:form>
</body>
</html>