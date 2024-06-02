<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Odd Even Output</title>
</head>
<body>
	${msg}
	
	<%
	int num = (Integer) request.getAttribute("num");//Object
	%>
	<br>
	<%=num%>
	<br>
</body>
</html>