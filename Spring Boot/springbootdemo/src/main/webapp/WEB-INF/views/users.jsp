<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Users page</h1>
	<table border="1">
		<tr>
			<th>Userid</th>
			<th>Username</th>
			<th>Email</th>
			<th>Mobile</th>
		</tr>
		<c:forEach items="${usrs}" var="user">
			<tr>
				<td>${user.userid}</td>
				<td>${user.username}</td>
				<td>${user.email}</td>
				<td>${user.mobile}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>