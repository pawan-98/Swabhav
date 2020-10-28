<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="Name.jsp">
		<label>Enter name</label><br>
		<input type="text" name="ouputName"><br>
        <button type="submit">Submit</button>
    </form>
    
    <%
		String inputName = request.getParameter("ouputName");
		out.print("hello "+inputName);
	%>
</body>
</html>