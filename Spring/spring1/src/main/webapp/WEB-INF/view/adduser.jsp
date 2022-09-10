<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="sp" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<jsp:include page="header.jsp"></jsp:include>
		<sp:form modelAttribute="user" action="${pageContext.request.contextPath}/user/adduser">
			<div class="form-group">
				<label>Enter Username</label>
				<sp:input path="username" placeholder="Enter Username" class="form-control"/>
			</div>
			<div class="form-group">
				<label>Enter Email</label>
				<sp:input path="email" placeholder="Enter Email" class="form-control"/>
			</div>
			<div class="form-group">
				<label>Enter Password</label>
				<sp:password path="password" placeholder="Enter Password" class="form-control"/>
			</div>
			<div class="form-group">
				<input type="submit" value="Add User" class="btn btn-primary btn-block"/>
				<input type="reset" value="Reset" class="btn btn-danger btn-block"/>
			</div>
		</sp:form>
	</div>
</body>
</html>