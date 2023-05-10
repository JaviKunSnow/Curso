<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <h2>Contactos</h2>
    <form action="editarContactServlet" method="post">
        <input type="hidden" name="id" value="<%=request.getParameter("id") %>">
        <p>
            <label for="nombre">Nombre: </label>
            <input type="text" name="nombre">
        </p>
        <p>
            <label for="apellidos">Apellidos: </label>
            <input type="text" name="apellidos">
        </p>
        <p>
            <label for="email">Email: </label>
            <input type="email" name="email">
        </p>
        <p>
            <label for="telefono">Telefono: </label>
            <input type="number" name="telefono">
        </p>
        <p>
        	<input type="submit" value="enviar">
        </p>
    </form>
</body>
</html>