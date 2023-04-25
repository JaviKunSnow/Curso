<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="registro" method="post">
		<P>
		<label for="user">Usuario: </label>
		<input type="text" name="user">
		</P>
		<% if(request.getAttribute("erroruser") != null) {
			request.getAttribute("erroruser");
		}%>
		<P>
		<label for="user">Password: </label>
		<input type="password" name="pass1">
		</P>
		<% if(request.getAttribute("errorpass1") != null) {
			request.getAttribute("errorpass1");
		}%>
		<P>
		<label for="user">repetir Password: </label>
		<input type="password" name="pass2">
		</P>
		<% if(request.getAttribute("errorpass2") != null) {
			request.getAttribute("errorpass2");
		}%>
		<p>
			<input type="submit" value="registrar">
		</p>
	</form>
</body>
</html>