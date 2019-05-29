<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		This is default Page
		<br>
		Context Name: 
		<br>
		Context Root: <%=request.getContextPath()%>
		<br>
		Server Name: <%=request.getServerName() %>
		<br>
		<a href="<%=request.getContextPath()%>/services/test">Spring</a>
		
	</body>
</html>