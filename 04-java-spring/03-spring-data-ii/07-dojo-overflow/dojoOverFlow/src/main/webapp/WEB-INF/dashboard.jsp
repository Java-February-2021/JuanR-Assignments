<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
<div class="container">
<h1>Questions Dashboard</h1>
<table class="table table-striped table dark">
<thead>
<td>Question</td>
<td>Tag</td>
</thead>
<tbody>
<tr>
<td><a href="/${quetion.id}"><c:out value="${question.name}"/></a></td>
<td><c:out value="${tag.subject}"/></td>
</tr>
</tbody>
</table>
</div>

</body>
</html>