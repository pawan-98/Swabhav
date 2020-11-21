<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="com.captcha.botdetect.web.servlet.Captcha"%>
<%@ taglib prefix="botDetect" uri="https://captcha.com/java/jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous">
<s:head />
</head>
<body>
<nav class="navbar navbar-expand-sm bg-primary navbar-dark">
		<ul class="navbar-nav">
			<li class="nav-item">
				<a class="nav-link active" href="/task-list-app">Home</a>
			</li>
			
		</ul>
		<div class="navbar-collapse collapse w-100 order-3 dual-collapse2">
			<ul class="navbar-nav ml-auto">
				<li class="nav-item"><a class="nav-link active" href="login">Login</a>
				<li class="nav-item"><a class="nav-link active" href="register">Register</a>
				</li>
			</ul>
		</div>
	</nav>
	<h1>Register Form:-</h1>
	<s:form action="registerDo">
			<s:textfield id="firstName" onkeyup="checkButton()" name="firstName" label="First Name "></s:textfield>
			<s:textfield id="lastName" onkeyup="checkButton()" name="lastName" label="Last Name "></s:textfield>
			<s:textfield id="email" onkeyup="checkButton()" name="email" label="Email "></s:textfield>
			<s:textfield id="username" onkeyup="checkButton()" name="username" label="User Name "></s:textfield>
			<s:textfield id="password" onkeyup="checkButton()" name="password" label="Password" />
			<s:textfield id="confirmPassword" onkeyup="checkButton()" name="confirmPassword" label="Confirm Password" />
		<!-- Adding BotDetect Captcha to the page -->
		
        <s:textfield name="captchaCode" id="captchaCode" class="textbox" label="Captcha" />
		<botDetect:captcha id="exampleCaptcha" userInputID="captchaCode"></botDetect:captcha>
<br/>
		<s:submit id="submitButton" class="btn btn-primary" value="Submit"></s:submit>
	</s:form>
</body>
<script>
	checkButton();
	function checkButton(){
		var firstName =document.getElementById("firstName");
		var lastName =document.getElementById("lastName");
		var email =document.getElementById("email");
		var username =document.getElementById("username");
		var password =document.getElementById("password");
		var confirmPassword =document.getElementById("confirmPassword");
		var submitButton=document.getElementById("submitButton");
		var captchaCode= document.getElementById("captchaCode");
		console.log(captchaCode.value)
		if(firstName.value=="" || lastName.value=="" || email.value=="" || username.value=="" || password.value=="" || confirmPassword.value=="" ){
			submitButton.disabled=true;
		}
		else{
			submitButton.disabled=false;
		}
	}
</script>
</html>