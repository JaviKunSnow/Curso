<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Este es el resultado</title>
</head>
<body>

	<h1 align="center">ESTAMOS EN LA PAGINA DE RESULTADO</h1>
<hr><br>
	<p>El usuario 1 desde el @ModelAttribute es: <strong style="color:red">${nombre}</strong></p>
	<p>El usuario 2 desde el @ModelAttribute es <strong style="color:red">${otroNombre}</strong></p>
	<p>El usuario 1 desde el modelo es: <strong style="color:red">${userInfo.nombre}</strong></p>
	<p>El usuario 2 desde el modelo es: <strong style="color:red">${userInfo.otroNombre}</strong></p>		
</body>
</html>