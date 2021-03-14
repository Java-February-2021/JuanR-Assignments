<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Ninja</title>
</head>
<body>
<div class="container">
<h1>New Dojo</h1>
<form:form method="POST" action="/ninjas/new" modelAttribute="ninjas">
<div class="form-group">
<form:label path="firstName">First Name:
<form:errors path="firstName"/>
<form:input path="firstName"/></form:label>
</div>
<div class="form-group">
<form:label path="lastName">last Name:
<form:errors path="lastName"/>
<form:input path="lastName"/></form:label>
</div>
<div class="form-group">
<form:label path="age">Age:
<form:errors path="age"/>
<form:input path="age"/></form:label>
</div>
</form:form>
</body>
</html>