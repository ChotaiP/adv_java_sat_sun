<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Odd Even Input</title>
</head>
<body>
	<form action="OddEvenServlet" method="post">
	Number: <Input type="text" name="num"/>
	${numError}
	<br><br>
	<input type="submit" value="Process" />
	</form>
</body>
</html>