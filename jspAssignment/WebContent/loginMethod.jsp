<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%@page import="java.util.*" %>
<%@page import="java.sql.*" %>
<body>
<% 
String usr = request.getParameter("usr");
String pwd = request.getParameter("pwd");

Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/User","root","Sapient123");

Statement stmt = con.createStatement();

//stmt.executeUpdate("Insert into Employee (Name_emp, Id) values('Rajiv', 12)");
ResultSet rs = stmt.executeQuery("select * from user_details");
if(rs.next() == false){
	out.println("Sign Up");
}
else{
	//out.println("Good to go");
}
con.close();
%>

</body>
</html>