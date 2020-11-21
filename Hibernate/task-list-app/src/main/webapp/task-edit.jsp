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

		<s:form action="taskEditDo">
			<s:hidden name="userId" value="%{userId}"></s:hidden>
			<s:hidden name="taskId" value="%{taskId}"></s:hidden>
			<s:textfield name="title" label="Get Title:-" ></s:textfield>
			<s:checkbox name="checkBoxValue"  label="Done:-"></s:checkbox>
			
		<s:submit class="btn btn-primary" value="Submit"></s:submit>
	</s:form>

</body>
</html>