<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spring"%>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Hibernate Form validation</title>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/src/css/error.css">
	</head>
	<body>
		<spring:form action="${pageContext.request.contextPath}/services/hibernateValidation/process" modelAttribute="customer">
			First Name(*)<spring:input path="firstName"/>
			<spring:errors path="firstName" cssClass="errorFirstName"/><br>
			Last Name<spring:input path="lastName"/>
			<br>
			<button type="submit">Click Me</button>
		</spring:form>
	</body>
</html>