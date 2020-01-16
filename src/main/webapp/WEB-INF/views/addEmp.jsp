<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Employee</title>
</head>
<body>
	<form action="saveEmp" method="post" modelAttribute="employee">
		<table width="100%">
			<tr>
				<th colspan="3"><span class="LabelStyle">Add Employee ::
						${msg}</span></th>
			</tr>
			<tr>
				<th>First Name</th>
				<th><input type="text" name="firstName"></th>
			</tr>
			<tr>
				<th>Last Name</th>
				<th><input type="text" name="lastName" /></th>
			</tr>
			<tr>
				<th>Salary</th>
				<th><input type="number" name="salary" /></th>
			</tr>
			<tr>
				<th>Age</th>
				<th><input type="number" name="age" /></th>
			</tr>
			<tr>
				<th>Email</th>
				<th><input type="email" name="email" /></th>
			</tr>
			<tr>
				<th>&nbsp;</th>
				<th><input type="submit" name="Submit" value="Save Employee"/></th>
			</tr>
		</table>

	</form>
</body>
</html>