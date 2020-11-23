<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Form</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous">
</head>
<body>
	<nav class="navbar navbar-expand-sm bg-primary navbar-dark">
		<ul class="navbar-nav">
			<li class="nav-item"><a class="nav-link active"
				href="/task-list-app">Home</a></li>

		</ul>
		<div class="navbar-collapse collapse w-100 order-3 dual-collapse2">
			<ul class="navbar-nav ml-auto">
				<li class="nav-item"><a class="nav-link active" href="login">Login</a>
				<li class="nav-item"><a class="nav-link active" href="register">Register</a>
				</li>
			</ul>
		</div>
	</nav>

	<form action="loginDo" method="post">
		<div class="form-group">
			<label for="username">Username :-</label><br> <input type="text"
				name="usermame" /> <br>
		</div>
		<div class="form-group">
			<label for="password">Password :-</label><br> <input
				type="password" name="password" /><br>
		</div>
		<s:checkbox name="role"  label="Is Admin:-"></s:checkbox>
		<input class="btn btn-primary" type="submit" value="Submit" />

	</form>
	<p style="color: red">
		<s:property value="message" />
	</p>
</body>
</html>