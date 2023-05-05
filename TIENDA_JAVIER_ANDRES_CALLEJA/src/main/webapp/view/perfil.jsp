<%@ page import="curso.java.tienda.model.Usuario" %>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Inicio</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
	crossorigin="anonymous"></script>
	<link rel="stylesheet" type="text/css" href="view/css/colores.css">
</head>
<body>
    <%@ include file="/view/fragments/header.jsp"%>
    <main>
    <% Usuario usuario = (Usuario) request.getSession().getAttribute("usuario"); %>
        <form action="perfil" method="post">
        <div class="container rounded bg-white mt-5 mb-5">
            <div class="row">
                <div class="col-md-3 border-right">
                    <div class="d-flex flex-column align-items-center text-center p-3 py-5"><img class="rounded-circle mt-5" width="150px" src="">
                    <span class="text-black-50"><%= usuario.getEmail() %></span><span> </span></div>
                </div>
                <div class="col-md-5 border-right">
                    <div class="p-3 py-5">
                        <div class="d-flex justify-content-between align-items-center mb-3">
                            <h4 class="text-right">Opciones de perfil</h4>
                        </div>
                        <div class="row mt-2">
                            <div class="col-md-6">
                            	<label class="labels">Nombre</label>
                            	<input type="text" class="form-control" name="nombre" value="<%= usuario.getNombre() %>">
                            </div>
                            <div class="col-md-6">
                            	<label class="labels">Apellidos</label>
                            	<input type="text" class="form-control" name="apellidos" value="<%= usuario.getApellidos() %>">
                            </div>
                        </div>
                        <div class="row mt-3">
                            <div class="col-md-12">
                            	<label class="labels">Email</label>
                            	<input type="text" class="form-control" name="email" value="<%= usuario.getEmail() %>" disabled>
                            </div>
                            <div class="col-md-12">
                            	<label class="labels">Provincia</label>
                            	<input type="text" class="form-control" value="">
                            </div>
                            <div class="col-md-12">
                            	<label class="labels">Localidad</label>
                            	<input type="text" class="form-control" value="">
                            </div>
                            <div class="col-md-12">
                            	<label class="labels">Contraseña</label>
                            	<input type="password" class="form-control" name="viejaPassword" value="">
                            	<label class="labels">nueva Contraseña</label>
                            	<input type="password" class="form-control" name="nuevaPassword" value="">
                            </div>
                        </div>
                        <div class="mt-5 text-center">
                        	<a href="verPedidosServlet" class="btn btn-warning profile-button">Mis pedidos</a>
                        	<input type="submit" class="btn btn-warning profile-button" value="Guardar cambios">
                        </div>
                    </div>
                </div>
            </div>
        </div>
        </div>
        </div>
        </form>
    </main>
    <%@ include file="/view/fragments/footer.jsp"%>
</body>
</html>