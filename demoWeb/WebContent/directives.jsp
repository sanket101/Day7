<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%@page import="java.util.Date" %>
<%@page isErrorPage="true" %>
<%@page info ="Just for Demo" %>
<%@page session="true" %>

<body>
<h1>Directives</h1>
<hr>
<h2>
Todays Date : <%= new Date()%><br>
Exception : <%= exception %><br>
Information : <%= getServletInfo() %><br>
Session Id : <%= session.getId() %><br>
<hr>
<%@include file="login.html" %>
</h2>
</body>
</html>