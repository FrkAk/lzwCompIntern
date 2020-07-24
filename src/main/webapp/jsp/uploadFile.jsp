<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <link  rel="stylesheet" href="<c:url value="/resources/dropzone.min.css" />"/>
    <script src="<c:url value="/resources/dropzone.min.js" />"></script>
    <title>Dropzone for LZW</title>
</head>
<body>



    <form:form id="my-awesome-dropzone" modelAttribute="dropzone" action="uploadFileProcess" method="post" class="dropzone">
        <table align="center">
            <tr>
                <td></td>
                <td><a href="home.jsp">Home</a></td>
            </tr>
        </table>
    </form:form>





</body>
</html>
