<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table class="dark table-dark">
<thead>
<tr>
<td>Name</td>
<td>state</td>
<td>exp</td>
</tr>
</thead>
<tbody>
<tr>
<select path="user">
<c:forEach items="${users}" var="user">
<option value="${user.id}">${user.firstName}</option>
</c:forEach>
</select>
</tbody>
</table>
</body>
</html>