<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Question</title>
</head>
<body>
<h1>What is your Question?</h1>
<div class="container">
<form:form method="POST" action="/addQuestion" modelAttribute="question">
<div class="form-group">
<form:label path="question">Question:
<form:errors path="question"/>
<form:input path="question"/></form:label>
</div>
<div class="form-group">
<form:label path="tag">Tags:
<form:errors path="tag"/>
<form:input path="tag"/></form:label>
</div>
<button>submit</button>
</form:form>
</div>
</body>
</html>