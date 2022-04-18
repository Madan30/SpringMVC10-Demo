<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>


<style type="text/css">
.errors {
	color: white;
	position: fixed;
	text-align: left;
	margin-left: 30px;
}
</style>
</head>
<body bgcolor="crimson">
	<div align="center">


		<form:form action="login-process" method="GET"
			modelAttribute="loginInfo">
			<p>
				<label>Username</label>
				<form:input path="userName" id="user-name" />
				<form:errors path="userName" cssClass="errors" />
			</p>

			<p>
				<label>Password</label>
				<form:password path="passWord" id="pass-word" />
				<form:errors path="passWord" cssClass="errors" />
			</p>
			<p>
				<form:checkbox path="termAndCondition" id="check" />
				<label>I am agreeing that this is for fun</label>
				<form:errors path="termAndCondition" cssClass="errors" />
				<br>
			</p>
			<button type="submit">Login</button>



		</form:form>
		<%---- 
		

		<form action="login" method="GET">

			<label for="uname"><b>Username</b></label> <input type="text"
				placeholder="Enter Username" name="userName" required> <br><br><br>
				<label for="psw"><b>Password</b></label> <input type="password"
				placeholder="Enter Password" name="passWord" required><br><br><br>

			<button type="submit">Login</button><br><br><br>
			<label> <input type="checkbox" checked="checked"
				name="termAndCondition"> Remember me
			</label>

		</form>
		--%>



	</div>

</body>
</html>