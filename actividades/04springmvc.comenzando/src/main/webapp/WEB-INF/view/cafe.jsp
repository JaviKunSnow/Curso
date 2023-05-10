<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">Esta es la pagina ${title}</h1>
	<hr>
	<br>
	<div align="center">
		<form action="realizarPedido">
			<label for="label_input">Pedido a realizar</label> <input
				id="label_input" type="text" name="comida"
				placeholder="Introduzca algo de comer"> <input type="submit"
				value="Enviar">
		</form>
	</div>
</body>
</html>
