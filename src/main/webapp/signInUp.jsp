<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <style><%@include file="jsp/resources/common.css"%></style>
    <script><%@include file="jsp/resources/overlay.js"%></script>

    <title>Sign In or Up</title>
</head>
<body>

<h2>Weekly Coding Challenge #1: Sign in/up Form</h2>

<div class="container" id="container">
    <div class="form-container sign-up-container">
        <%--@elvariable id="user" type="jbr"--%>
        <form:form id="regForm" modelAttribute="user" action="registerProcess" method="post">
            <h1>Create Account</h1>
            <span>or use your email for registration</span>
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
    <div class="form-container sign-in-container">

        <%--@elvariable id="login" type="jbr"--%>
        <form:form id="loginForm" modelAttribute="login" action="loginProcess" method="post">
            <h1>Sign in</h1>
            <span>or use your account</span>
            <label>
                <input type="text" placeholder="Username" name="username"/>
            </label>
            <label>
                <input type="password" placeholder="Password" name="password"/>
            </label>

            <button type = "submit" id="login" >Sign In</button>
        </form:form>
    </div>
    <div class="overlay-container">
        <div class="overlay">
            <div class="overlay-panel overlay-left">
                <h1>Welcome Back!</h1>
                <p>To keep connected with us please login with your personal info</p>
                <button class="ghost" id="signIn">Sign In</button>
            </div>
            <div class="overlay-panel overlay-right">
                <h1>Hello, Friend!</h1>
                <p>Enter your personal details and start journey with us</p>
                <button class="ghost" id="signUp">Sign Up</button>
            </div>
        </div>
    </div>
</div>



</body>
</html>
