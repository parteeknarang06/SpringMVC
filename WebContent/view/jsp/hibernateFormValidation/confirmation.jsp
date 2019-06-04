<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Confirmation</title>
	</head>
	<body>
		<p>Hi ${customer.firstName} ${customer.lastName} you are confirmed with ${customer.freePasses} passes</p>
		<p> on postal code: ${customer.postalCode}</p>
	</body>
</html>