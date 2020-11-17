<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>		
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

	if(session.isNew() ){
		session.setAttribute("oldCount",0);
		session.setAttribute("newCount", 1);
	}
	else{
		session.setAttribute("oldCount",(int)session.getAttribute("oldCount")+1);
		session.setAttribute("newCount",(int)session.getAttribute("oldCount")+1);
	}
	
	out.print("Old: "+session.getAttribute("oldCount"));
	out.print("<br>New: "+session.getAttribute("newCount"));
	out.print("<br>Id: "+session.getId());
	

%>
<br>
<a href="Summary.jsp">Summary</a>
</body>
</html>