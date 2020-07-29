<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

    <style><%@include file="/jsp/resources/dropzone.min.css"%></style>

    <script><%@include file="/jsp/resources/dropzone.min.js"%></script>
    <style><%@include file="resources/common.css"%></style>

    <title>Dropzone for LZW</title>
</head>
<body>

    <form:form id="my-awesome-dropzone" modelAttribute="dropzone" action="uploadFileProcess" method="post" class="dropzone">

    </form:form>
    <button type = "submit" id="dropzone" >Upload</button>

    <button type = "button" style= "position: absolute; top: 30px; right: 25px;" onclick = "window.location.href='home.jsp'" >Home Page</button>





</body>
</html>
