<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Form</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous">
</head>
<body>
	<nav class="navbar navbar-expand-sm bg-primary navbar-dark">
		<ul class="navbar-nav">
			<li class="nav-item">
				<s:form action="addSubTask">
					<s:hidden name="taskId" value="%{taskId}"></s:hidden>
					<s:submit class="btn btn-info" value="Add"></s:submit>
				</s:form>
			</li>

		</ul>
		<div class="navbar-collapse collapse w-100 order-3 dual-collapse2">
			<ul class="navbar-nav ml-auto">
				<li class="nav-item"><a class="nav-link active" href="logout">Logout</a>
				</li>
			</ul>
		</div>
	</nav>

	<h1 class="offset-4">Student Information</h1>
	<div class="jumbotron">
		<table border="1" class="table table-striped table-dark table-hover">
			<thead>
				<tr>
					<th scope="col">Id</th>
					<th scope="col">Title</th>
					<th scope="col">Done</th>
					<th scope="col">Date</th>
					<th scope="col">Edit</th>
					<th scope="col">Delete</th>
				</tr>
			</thead>
			<tbody>
				<s:iterator value="subTasks">
					<tr>
						<td scope="row"><s:property value="id" /></td>
						<s:if test="done==true">
         					<td><del><s:property value="title" /></del></td>
         					<td><p>Yes</p></td> 
      					</s:if>
						<s:elseif test="done==false">
         					<td><s:property value="title" /></td>
         					<td><p>No</p></td>
      					</s:elseif>
						<td class="date"><s:property value="date" /></td>
						<td><s:form action="subTaskEdit">
								<s:hidden name="taskId" value="%{taskId}"></s:hidden>
								<s:hidden name="subTaskId" value="%{id}"></s:hidden>
								<s:submit class="btn btn-info" value="edit"></s:submit>
							</s:form></td>
						<td><s:form action="deleteSubTask">
								<s:hidden name="taskId" value="%{taskId}"></s:hidden>
								<s:hidden name="subTaskId" value="%{id}"></s:hidden>
								<s:submit class="btn btn-info" value="delete"></s:submit>
							</s:form></td>
					</tr>
				</s:iterator>
			</tbody>
		</table>
	</div>
<script >
	
	var date =document.getElementsByClassName("date");
	console.log(date);
	for(i = 0; i < date.length; i++){
		date[i].innerText=date[i].innerText.substring(0,8);
	}
	</script>

</body>
</html>