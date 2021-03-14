<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="container">
<h1>New Dojo</h1>
<form:form method="POST" action="/dojos/new" modelAttribute="dojo">
<div class="form-group">
<form:label path="name">First Name:
<form:errors path="name"/>
<form:input path="name"/></form:label>
</div>
</form:form>
</div>
</body>
</html>