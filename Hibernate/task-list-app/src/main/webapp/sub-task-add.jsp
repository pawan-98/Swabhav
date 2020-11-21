<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
  <!--   <li class="nav-item">
      <a class="nav-link active" href="add">Add</a>
    </li> -->
   
  </ul>
   <div class="navbar-collapse collapse w-100 order-3 dual-collapse2">
        <ul class="navbar-nav ml-auto">
            <li class="nav-item">
                <a class="nav-link active" href="logout">Logout</a>
            </li>
        </ul>
    </div>
</nav>
	<h1>Sub Task Form:-</h1>
	<form action="subTaskAddDo">
	<s:hidden name="taskId" value="%{taskId}"></s:hidden>
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