<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		String firstNameError = (String)request.getAttribute("firstNameError");
	
	%>
	<form action="Name" method="post">
		First Name: <input type="text" name="firstName"/>
		<span style="color:red">
			<%=firstNameError==null?"":firstNameError %>
		</span><br><br>
		
		<input type="submit" value="Process" />
	</form>
</body>
</html>