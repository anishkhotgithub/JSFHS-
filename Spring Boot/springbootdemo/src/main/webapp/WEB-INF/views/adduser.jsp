<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="sp" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<sp:form modelAttribute="user" action="/user/add" method="post">
		<table>
			<tr>
				<td>Username</td>
				<td><sp:input path="username"/></td>
			</tr>
			
			<tr>
				<td>Email</td>
				<td><sp:input path="email"/></td>
			</tr>
			
			<tr>
				<td>Mobile</td>
				<td><sp:input path="mobile"/></td>
			</tr>
			<tr>
				<td><input type="submit" value="Submit"/></td>
				<td><input type="reset" value="Reset"/></td>
			</tr>
		</table>
	</sp:form>	
</body>
</html>