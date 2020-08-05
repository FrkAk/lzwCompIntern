<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<style type="text/css"><%@include file="resources/common.css"%></style>

	<title>Registration</title>
</head>
<body>
<h2>Compress your File after Sign Up</h2>
	<div class="form-container">
		<form:form id="regForm" modelAttribute="user" action="registerProcess" method="post">
			<h1>Create Account</h1>
			<span>with your email for registration</span>
			<label>
				<input type="text" placeholder="Username" name="username"/>
			</label>

			<label>
				<input type="text" placeholder="Firs Name" name="firstname"/>
			</label>

			<label>
				<input type="text" placeholder="Last Name" name="lastname"/>
			</label>

			<label>
				<input type="email" placeholder="Email"  name="email"/>
			</label>

			<label>
				<input type="text" placeholder="Address" name="address"/>
			</label>

			<label>
				<input type="tel" placeholder="Telephone"  name="phone"/>
			</label>

			<label>
				<input type="password" placeholder="Password" name="password"/>
			</label>

			<button type = "submit" id="register">Sign Up</button>
		</form:form>

	</div>

	<button type = "button" style= "position: absolute; top: 30px; right: 25px;" onclick = "window.location.href='home.jsp'" >Home Page</button>


</body>
</html>