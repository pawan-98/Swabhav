<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! int num = 3; %>
<% if (num%2==0) { %>
         <p> number is even</p>
      <% } else { %>
         <p> number is odd</p>
      <% } %>
</body>
</html>