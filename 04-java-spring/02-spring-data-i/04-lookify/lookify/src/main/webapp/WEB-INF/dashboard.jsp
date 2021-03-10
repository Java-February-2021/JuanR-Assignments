<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dashboard</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" >
</head>
<body>
<div class="container">
<h3><a href="/add">Add new</a></h3>
<h3><a href="topSongs">Top Songs</a></h3>
<hr>
<table class="table table-striped table-dark">
<thead>
<td>Name</td>
<td>Rating</td>
<td>Actions</td>
</thead>
<tbody>
<c:forEach items="${allSongs}" var="song">
<tr>
<td><c:out value="${song.id}"/></td>
<td><a href="/${song.id}"><c:out value="${song.name}"></c:out></a></td>
<td><c:out value="${song.rating }"/></td>
<td><c:out value="${song.action }"/></td>
</tr>
</c:forEach>
</tbody>
</table>
</div>
</body>
</html>