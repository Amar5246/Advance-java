<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
  <tr>
    <th>First Name</th>
    <th>Last Name</th>
    <th>City</th>
  </tr> 
  <c:forEach var="emp" items="${requestScope.listEmps}">
  <tr>
    <td>${emp.firstName}</td>
    <td>${emp.lastName}</td>
    <td>${emp.city}</td>
  </tr> 
  </c:forEach>
</table>
</body>
</html>