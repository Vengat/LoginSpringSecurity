<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

                   
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello <!-- <security:authentication property="principal.username" var="loginId" scope="request"/>  -->  
</h1>

<P>  The time on the server is ${serverTime}. </P>
<a href="<c:url value="/static/j_spring_security_logout" />" > Logout</a>
</body>
</html>
