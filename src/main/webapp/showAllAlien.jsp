<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>	
	<c:forEach var="listValue" items="${listOfAliens}">
			<tr><td><c:out value="${listValue.aid}"/></td></br>
				<td><c:out value="${listValue.aname}"/></td></br>
				<td><c:out value="${listValue.tech}"/></td></br>
			</tr>
	</c:forEach>
			
</body>
</html>