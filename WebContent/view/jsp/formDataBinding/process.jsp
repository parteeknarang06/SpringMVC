<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Process</title>
	</head>
	<body>
		Hi, ${empbean.ename} <br>
		your code is: ${empbean.ecode}<br>
		controller is :${empbean.controller}<br>
		your fav country: ${empbean.country}<br>
		your prog lang: ${empbean.progLang}<br>
		<c:forEach items="${empbean.operatingSystem }" var="os">
			<li>${os}</li>
		</c:forEach>
	</body>
</html>