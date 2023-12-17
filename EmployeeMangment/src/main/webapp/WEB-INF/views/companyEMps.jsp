<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="emps/getEmps" method="post">
		<table style="background-color: lightgrey; margin: auto">
			<tr>
				<td>Enter Company</td>
				<td><input type="text" name="company" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="list all emps" /></td>
			</tr>
		</table>
	</form>
</body>
</html>