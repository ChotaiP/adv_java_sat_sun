<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<%
	String userName = (String) session.getAttribute("userName");
	%>
	<%=userName%>
	<br>
	<BR>

	Username : ${userName}
	
	<br><br> 
	<a href="logout">Logout</a>
</body>
</html>