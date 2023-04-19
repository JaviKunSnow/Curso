<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.HashMap" %>
<%@ page import="curso.java.agenda.modelo.contacto" %>
<%@ page import="java.util.Map.Entry" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
</head>
</head>
<body>
    <h2>Contactos</h2>
    <form action="addContactServlet" method="post">
        <p>
            <label for="nombre">Nombre: </label>
            <input type="text" name="nombre">
            <% if(request.getSession().getAttribute("errorNombre") != null) {%>
            	<div style="color: red;"><%=request.getSession().getAttribute("errorNombre") %></div>
            <% } %>
        </p>
        <p>
            <label for="apellidos">Apellidos: </label>
            <input type="text" name="apellidos">
            <% if(request.getSession().getAttribute("errorApellidos") != null) {%>
            	<div style="color: red;"><%=request.getSession().getAttribute("errorApellidos") %></div>
            <% } %>
        </p>
        <p>
            <label for="email">Email: </label>
            <input type="email" name="email">
            <% if(request.getSession().getAttribute("errorMail") != null) {%>
            	<div style="color: red;"><%=request.getSession().getAttribute("errorMail") %></div>
            <% } %>
        </p>
        <p>
            <label for="telefono">Telefono: </label>
            <input type="number" name="telefono">
            
        </p>
        <P>
        	<input type="submit" value="enviar">
        </P>
    </form>
    <% if(request.getSession().getAttribute("contactos") != null) { %>
    	<div>
    		<H2>Lista de contactos</H2>
    			<div class="table-responsive">
                    <table class="table table-primary">
                        <thead>
                            <tr>
                                <th scope="col">Nombre</th>
                                <th scope="col">Apellidos</th>
                                <th scope="col">Email</th>
                                <th scope="col">Telefono</th>
                            </tr>
                        </thead>
                        <tbody>
                        	<% HashMap <Integer, contacto> contactos = (HashMap<Integer, contacto>) request.getSession().getAttribute("contactos");%>
                            <% for (Entry<Integer, contacto> contacto : contactos.entrySet()) { %>
	                            <tr class="">
	                                <td scope="row"><%=contacto.getValue().getNombre() %></td>
	                                <td><%=contacto.getValue().getApellidos() %></td>
	                                <td><%=contacto.getValue().getEmail() %></td>
	                                <td><%=contacto.getValue().getTelefono() %></td>
	                                <td><a href="editarViewServlet?id=<%= contacto.getValue().getId()%>">Editar</a></td>
	                                <td><a href="">Eliminar</a></td>
	                                <td><a></a></td>
	                            </tr>
                            <% } %>
                     <% } %>
                        </tbody>
                    </table>
                </div>
    	</div>
</body>
</html>