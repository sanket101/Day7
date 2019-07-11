<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Scripting Elements</h1>
<hr>
<h2>
<%! 
	int a = 10;
	int b = 20;
%>
<%
	int sum = a+b;
%>
Value of a is : <%= a %><br>
Value of b is : <%= b %><br>
<br>
<br>
Sum of a and b is : <%= sum %>
</h2>
</body>
</html>