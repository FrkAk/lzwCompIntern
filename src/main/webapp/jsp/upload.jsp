<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

    <title>Dropzone for LZW</title>
    <style type="text/css"><%@include file="resources/common.css"%></style>

</head>

<body>
    <h2>Welcome ${firstname}</h2>
    <h2>Upload Your File to Compress</h2><br>



    <div class="form-container">
    <form:form method="POST" action="uploadFile" enctype="multipart/form-data">
        <input type="file" placeholder="Chose File" name="file"/>

        <button type = "submit" id="Upload" value="Upload">Press here to upload the file!</button><br>
    </form:form>
    </div>


    <button type = "button" style= "position: absolute; top: 30px; right: 25px;" onclick = "window.location.href='home.jsp'" >Home Page</button>

</body>

</html>
