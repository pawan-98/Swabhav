<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employees</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
</head>
<body>
<nav class="navbar navbar-expand-sm bg-primary navbar-dark">
  <ul class="navbar-nav">
    <li class="nav-item active">
      <a class="nav-link" href="/emp-app">Home</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="#">About Us</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="display">Display Student</a>
    </li>
  </ul>
</nav>
<table border="1" class="table table-striped table-dark">
		<thead >
			<tr>
				<th scope="col">Id</th>
				<th scope="col">Name</th>
				<th scope="col">Designation</th>
				<th scope="col">Salary</th>
				<th scope="col">Age</th>
			</tr>
		</thead>
		<tbody>
			<s:iterator value="employees" >
				<tr>
					<td scope="row"><s:property value="id" /></td>
					<td><s:property value="name" /></td>
					<td><s:property value="designation" /></td>
					<td><s:property value="salary" /></td>
					<td><s:property value="age" /></td>
					
				</tr>
			</s:iterator>
		</tbody>
	</table>
</body>
</html>