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
		<h1>Add Alien</h1>
		<input type="text" name="aid"><br>
		<input type="text" name="aname"><br>
		<input type="text" name="tech"><br>
		<input type="submit">
	</form>
	
	<form action="getAlien">
		<h1>View Alien Information</h1>
		<input type="text" name="aid"><br>
		<input type="submit">
	</form>
	
	<form action="updateAlienName">
		<h1>Update Alien Name</h1>
		<input type="text" name="aid"><br>
		<input type="text" name="aname"><br>
		<input type="submit">
	</form>
	
	<form action="updateAlienTech">
		<h1>Update Alien Technology</h1>
		<input type="text" name="aid"><br>
		<input type="text" name="tech"><br>
		<input type="submit">
	</form>
	
	<form action="deleteAlien">
		<h1>Delete Alien</h1>
		<input type="text" name="aid"><br>
		<input type="submit">
	</form>
	
	<form action="viewAllAliens">
		<h1>View All Aliens</h1>
		<input type="submit">
	</form>
</body>
</html>