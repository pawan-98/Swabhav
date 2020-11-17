<%@ taglib prefix="s" uri="/struts-tags"%>
<%@page import="com.captcha.botdetect.web.servlet.Captcha"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="botDetect" uri="https://captcha.com/java/jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="sendEmail" method="post">
		<label for="firstName">First Name:-</label>
		<input type="text"name="firstName" /><br /> <br />
		<label for="secondName">Second Name:-</label>
		<input type="text" name="lastName" /><br /><br />
		
		 <label for="to">Email Id:-</label>
 		<input type="text" name="to" /><br /> <br />
 		<label for="age">Age</label>
 		<input type="number" name="age" /><br /><br />
			 
		<label for="captchaCode">Retype the characters from the picture:</label>
      
        <!-- Adding BotDetect Captcha to the page -->
		<botDetect:captcha id="exampleCaptcha" userInputID="captchaCode"></botDetect:captcha>
<br/>
        <s:textfield name="captchaCode" id="captchaCode" class="textbox" />
		<input type="submit" value="Send Email" />
	</form>
</body>
</html>