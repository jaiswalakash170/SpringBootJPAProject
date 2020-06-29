<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring Boot JPA-H2 Web App</title>
</head>
<body>
	<form action="addAlien">
		<input type="text" name="aid"><br>
		<input type="text" name="aname"><br>
		<input type="submit">
	</form>
	
	<form action="getAlien">
		<input type="text" name="aid"><br>
		<input type="submit">
	</form>
</body>
</html>