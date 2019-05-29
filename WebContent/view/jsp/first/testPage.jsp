<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Test Page</title>
	</head>
	<body>
		<p>This is test page for spring mvc</p>
		<a href="<%=request.getContextPath()%>/services/show">FormData</a><br>
		<a href="<%=request.getContextPath()%>/services/show2">Spring model Data</a><br>
		<a href="<%=request.getContextPath()%>/services/show3">param binding</a><br>
		<a href="<%=request.getContextPath()%>/services/ctrlA/index">ControllerA Request Mapping</a><br>
		<a href="<%=request.getContextPath()%>/services/ctrlB/index">ControllerB Request Mapping</a><br>
		<a href="<%=request.getContextPath()%>/services/formDataBindcontroller/showPage">Form Data Binding</a><br>
		<a href="<%=request.getContextPath()%>/services/hibernateValidation/showPage">Hibernate Validation</a><br>
	</body>
</html>