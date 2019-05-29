<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Main</title>
	</head>
	<body>
		<form action="${pageContext.request.contextPath}/services/process2" method="post">
			<input type="text" name="userName" >
			<button type="submit">Click Me For model data</button>
		</form>
	</body>
</html>