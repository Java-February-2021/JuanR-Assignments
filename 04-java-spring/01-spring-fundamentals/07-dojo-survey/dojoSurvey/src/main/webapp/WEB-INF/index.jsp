<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
<form method="POST" action="/success">
<p>Your name: <input type="text" name="name"></p>

<p>Dojo location: <select name="location" id="location">
<c:forEach items="${location }" var="location">
<option value="c:out value='${location }'/>"><c:out value="${location }"></c:out></option>
</c:forEach>
</select>

<p>Favorite Language: <select name="language" id="language">
<c:forEach items="${languages }" var="lang">
<option value="c:out value='${lang }'/>"><c:out value="${lang }"></c:out></option>
</c:forEach>
</select>
<button>Button</button>
</form>
</body>
</html>