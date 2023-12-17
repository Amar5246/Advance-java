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
   <form action="emps/add" method="post">
      <table style="background-color: lightgrey; margin: auto"> 
        <tr>
          <td>Enter company</td>
          <td>
          <select name="company">
           <c:forEach var="comp" items="${requestScope.compList}">
           <option value="${comp.companyName}">${comp.companyName}</option>
           </c:forEach>
          </select>
          </td>
        </tr>
        <tr>
          <td>Enter First Name</td>
          <td><input type="text" name="fname" /></td>
        </tr>
        <tr>
          <td>Enter Last Name</td>
          <td><input type="text" name="lname" /></td>
        </tr>
        <tr>
          <td>Enter City</td>
          <td><input type="text" name="cityName" /></td>
        </tr>
        <tr>
          <td><input type="submit" value="Add a player" /></td>
        </tr>
      </table>
    </form>
</body>
</html>