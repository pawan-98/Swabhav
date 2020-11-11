<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="add">Add</a>
	<h1>Student Information:-</h1>
	<table border="1">
		<thead>
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Gender</th>
				<th>Edit</th>
				<th>Delete</th>
			</tr>
		</thead>
		<tbody>
			<s:iterator value="students" status="studentsStatus">
				<tr>
					<td><s:property value="id" /></td>
					<td><s:property value="name" /></td>
					<td><s:property value="gender" /></td>
					<td><s:form action="updateForm">
							<s:hidden name="editId" value="%{id}"></s:hidden>
							<s:submit value="edit"></s:submit>
						</s:form></td>
					<td><s:form action="delete">
							<s:hidden name="deleteId" value="%{id}"></s:hidden>
							<s:submit value="delete"></s:submit>
						</s:form></td>
				</tr>
			</s:iterator>
		</tbody>
	</table>
	<a href="logout">Logout</a>
</body>
</html>