<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
	.myclass
	{
		margin:0 auto;
	}
</style>
</head>
<body>
		
		</script>
		
		<div class="container">
		<jsp:include page="header.jsp"></jsp:include>
		<div class=card style="margin: 0px 150px; width: 800px;">
		<sp:form modelAttribute="user" action="${pageContext.request.contextPath}/user/adduser">
			<br>
			<div class="form-group">
				<label>Enter Username : </label> <span id="msgusername" style="color:red"></span>
				<input type="text" name="username" id="username" onkeyup="myfunction(this)"  placeholder="Enter Username" class="form-control"/>
			</div>
			<div class="form-group">
				<label>Enter Email : </label><span id="msgemail" style="color:red"></span>
				<input type="email" name="email" id="email" onkeyup="myfunction(this)" placeholder="Enter Email" class="form-control"/>
			</div>
			<div class="form-group">
				<label>Enter Password : </label>
				<input type="password" name="password" placeholder="Enter Password" class="form-control"/>
			</div>
			<div class="form-group">
				<input type="submit" value="Register" class="btn btn-primary btn-block"/>
				<input type="reset" value="Reset" class="btn btn-danger btn-block"/>
			</div>
		</sp:form>
		</div>
		</div>
</body>
</html>