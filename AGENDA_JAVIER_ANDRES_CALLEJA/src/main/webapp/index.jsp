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
    <form action="<%if(request.getAttribute("editar") != null) {%>
    	editContactServlet
    	<% } else { %>
    	addContactServlet
    	<% } %>" method="post">
    	<%if(request.getAttribute("editar") != null) {%>
    	<input type="hidden" name="id" value="<%= request.getAttribute("id")%>">
    	<% } %>
        <p>
        
            <label for="nombre">Nombre: </label>
            <input type="text" name="nombre" <% if(request.getAttribute("editar") != null) { %>
            value="<%=((contacto)request.getAttribute("contacto")).getNombre() %>"
            <% } %>>
            <% if(request.getAttribute("errorNombre") != null) {%>
            	<div style="color: red;"><%=request.getAttribute("errorNombre") %></div>
            <% } %>
        </p>
        <p>
            <label for="apellidos">Apellidos: </label>
            <input type="text" name="apellidos" <% if(request.getAttribute("editar") != null) { %>
            value="<%=((contacto)request.getAttribute("contacto")).getApellidos() %>"
            <% } %>>
            <% if(request.getAttribute("errorApellidos") != null) {%>
            	<div style="color: red;"><%=request.getAttribute("errorApellidos") %></div>
            <% } %>
        </p>
        <p>
            <label for="email">Email: </label>
            <input type="email" name="email" <% if(request.getAttribute("editar") != null) { %>
            value="<%=((contacto)request.getAttribute("contacto")).getEmail() %>"
            <% } %>>
            <% if(request.getAttribute("errorMail") != null) {%>
            	<div style="color: red;"><%=request.getAttribute("errorMail") %></div>
            <% } %>
        </p>
        <p>
            <label for="telefono">Telefono: </label>
            <input type="number" name="telefono" <% if(request.getAttribute("editar") != null) { %>
            value="<%=((contacto)request.getAttribute("contacto")).getTelefono() %>"
            <% } %>>
            
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
                        	<% HashMap <Integer, contacto> contactos = (HashMap<Integer, contacto>) request.getSession().getAttribute("contactos");
                            for (Entry<Integer, contacto> contacto : contactos.entrySet()) { %>
	                            <tr class="">
	                                <td scope="row"><%=contacto.getValue().getNombre() %></td>
	                                <td><%=contacto.getValue().getApellidos() %></td>
	                                <td><%=contacto.getValue().getEmail() %></td>
	                                <td><%=contacto.getValue().getTelefono() %></td>
	                                <td><a href="editContactServlet?id=<%= contacto.getValue().getId()%>">Editar</a></td>
	                                <td><a href="deleteContactServlet?id=<%= contacto.getValue().getId()%>">Eliminar</a></td>
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