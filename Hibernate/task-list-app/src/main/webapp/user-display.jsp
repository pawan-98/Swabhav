<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Form</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">

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
	
	<h1 class="offset-4">Student Information</h1>
	<div class="jumbotron">
	<table border="1" class="table table-striped table-dark table-hover">
		<thead >
			<tr>
				<th scope="col">Id</th>
				<th scope="col">First Name</th>
				<th scope="col">Second Name</th>
				<th scope="col">Email</th>
				<th scope="col">User name</th>
				<th scope="col">Password</th>
				<th scope="col">Task</th>
				<th scope="col">Edit</th>
				<th scope="col">Delete</th>
			</tr>
		</thead>
		<tbody>
			<s:iterator value="users" >
				<tr>
					<td scope="row"><s:property value="id" /></td>
					<td><s:property value="firstName" /></td>
					<td><s:property value="lastName" /></td>
					<td><s:property value="email" /></td>
					<td><s:property value="usermame" /></td>
					<td><s:property value="password" /></td>
						<td><s:form action="task">
							<s:hidden name="userId" value="%{id}"></s:hidden>
							<s:submit class="btn btn-info" value="task"></s:submit>
						</s:form></td>
					<td><s:form action="userUpdateForm">
							<s:hidden name="editId" value="%{id}"></s:hidden>
							<s:submit class="btn btn-info" value="edit"></s:submit>
						</s:form></td>
					<td><s:form action="deleteUser">
							<s:hidden name="deleteId" value="%{id}"></s:hidden>
							<s:submit class="btn btn-info" value="delete"></s:submit>
						</s:form>
					</td>
				</tr>
			</s:iterator>
		</tbody>
	</table>
	</div>
	

</body>
</html>