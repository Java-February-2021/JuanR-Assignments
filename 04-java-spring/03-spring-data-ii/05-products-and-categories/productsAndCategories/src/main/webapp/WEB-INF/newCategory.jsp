<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Category</title>
</head>
<body>
<h1>New Product</h1>
<div class="container">
<form:form method="POST" action="/addCategory" modelAttribute="category">
<div class="form-group">
<form:label path="name">Name:
<form:errors path="name"/>
<form:input path="name"/></form:label>
</div>
<button>Create</button>
</form:form>
</div>
</body>
</html>