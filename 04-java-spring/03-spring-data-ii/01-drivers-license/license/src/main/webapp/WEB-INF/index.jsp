<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign in</title>
</head>
<body>
<div class="container">
<h1>New Person</h1>
<form:form method="POST" action="/licenses/new" modelAttribute="user">
<div class="form-group">
<form:label path="firstName">First Name:
<form:errors path="firstName"/>
<form:input path="firstName"/></form:label>
</div>
<div class="form-group">
<form:label path="lastName">Last Name:
<form:errors path="lastName"/>
<form:input path="lastName"/></form:label>
</div>
<button>Create</button>
</form:form>

</div>
</body>
</html>