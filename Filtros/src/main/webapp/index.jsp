<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="modelo.Articulo" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Lista de artículos</title>
    <!-- Enlaces a las librerías de Bootstrap -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.6.0/css/bootstrap.min.css">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.6.0/js/bootstrap.bundle.min.js"></script>
</head>
<body>

<!-- Header -->
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="#">Mi Tienda</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNav">
    <ul class="navbar-nav">
    <%
    // Comprobamos si la variable "usuario" existe en la sesión
    if(session.getAttribute("usuario") == null) {
    %>    
      <li class="nav-item">
        <a class="nav-link" href="login.jsp">Login</a>
      </li>
      <%
    } else {
    %>
      <li class="nav-item">
        <a class="nav-link" href="logout">Cerrar Session</a>
      </li>
      <%
    }
%>
      <li class="nav-item">
        <a class="nav-link" href="perfil.jsp">Perfil</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="carrito.jsp">Carrito</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="prueba">Prueba filtro</a>
      </li>
    </ul>
  </div>
</nav>

<!-- Zona central -->
<div class="container my-5">
  <div class="row">
    <% List<Articulo> catalogo = (List<Articulo>) request.getAttribute("catalogo"); %>
    <% for (Articulo articulo : catalogo) { %>
    <div class="col-lg-3 col-md-4 col-sm-6 mb-4">
      <div class="card">
        <img class="card-img-top" src="<%= articulo.getImagen() %>" alt="Card image cap">
        <div class="card-body">
          <h5 class="card-title"><%= articulo.getNombre() %></h5>
          <p class="card-text"><%= articulo.getDescripcion() %></p>
          <p class="card-text">Precio: $<%= articulo.getPrecio() %></p>
          <form action="agregar" method="post">
            <input type="hidden" name="id" value="<%= articulo.getId() %>">
            <div class="input-group mb-3">
              <div class="input-group-prepend">
                <button class="btn btn-outline-secondary" type="button" id="menos">-</button>
              </div>
              <input type="number" class="form-control" placeholder="Cantidad" name="cantidad" value="1">
              <div class="input-group-append">
                <button class="btn btn-outline-secondary" type="button" id="mas">+</button>
              </div>
            </div>
            <button type="submit" class="btn btn-primary mt-2">Agregar al carrito</button>
          </form>
        </div>
      </div>
    </div>
    <% } %>
  </div>
</div>

<!-- Footer -->
<footer class="bg-light py-3">
  <div class="container">
    <div class="row">
      <div class="col">
        <p class="text-center">© 2023 Mi Tienda. Todos los derechos reservados.</p>
      </div>
    </div>
  </div>
</footer>

<!-- Script para los botones de más y menos -->
<script>
  $(function() {
    $('button#mas').click(function() {
      var input = $(this).parent().siblings('input[type="number"]');
      input.val(parseInt(input.val()) + 1);
    });

    $('button#menos').click(function() {
      var input = $(this).parent().siblings('input[type="number"]');
      if (parseInt(input.val()) > 1) {
        input.val(parseInt(input.val()) - 1);
      }
    });
  });
</script>

</body>
</html>
              