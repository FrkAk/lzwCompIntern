<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link href="common.css" rel="stylesheet" >
	<title>Login</title>
</head>
<body>
	<h2>Compress your File after Sign in</h2>
	<div class="form-container">
		<form:form id="loginForm" modelAttribute="login" action="loginProcess"
				   method="post">
			<h1>Sign in</h1>
			<span>use your account</span>
			<label>
				<input type="text" placeholder="Username" name="username"/>
			</label>
			<label>
				<input type="password" placeholder="Password" name="password"/>
			</label>
			<button type = "submit" id="login" >Sign In</button>

		</form:form>
	</div>
	<button type = "button" style= "position: absolute; top: 30px; right: 25px;"
			onclick = "window.location.href='home.jsp'" >Home Page</button>
	<table align="center">
		<tr>
			<td style="font-style: italic; color: red;">${message}</td>
		</tr>
	</table>

</body>
</html>