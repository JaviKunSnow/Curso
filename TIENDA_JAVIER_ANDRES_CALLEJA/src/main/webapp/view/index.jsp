<%@ page import="java.util.List" %>
<%@ page import="curso.java.tienda.model.Articulo" %>
<%@ page import="curso.java.tienda.model.Usuario" %>
<%@ page import="curso.java.tienda.model.Categorias" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Inicio</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
</head>
<body style="padding-bottom: 70px; padding-top: 70px;">
    <%@ include file="/view/fragments/header.jsp"%>
    <main>
   	<div class="container my-4">
   	<form action="HomeServlet" method="post" class="my-4" id="form">
                <div class="row">
                    <div class="col-md-3">
                        <label for="input-numerico" class="form-label" >Precio</label>
                        <input type="number" class="form-control" id="buscador" name="buscador">
                    </div>
                    <div class="col-md-3">
                        <label for="select" class="form-label">Categorias</label>
                        <select class="form-select" id="categorias" name="categorias">
                            <option value="0" selected>Seleccione una</option>
                        <% List <Categorias> categorias = (List<Categorias>) request.getAttribute("categorias");
                        	for(Categorias categoria : categorias) {%>
                            <option value="<%= categoria.getId() %>"><%= categoria.getNombre() %></option>
                           <% } %>
                        </select>
                    </div>
                    <div class="col-md-2">
                      <label class="form-check-label" for="valorados">
                        Mas valorados
                      </label>
                      <input class="form-check-input" type="checkbox" value="valorados" id="valorados" name="valorados">
                    </div>
                    <div class="col-md-2">
                      <label class="form-check-label" for="comprados">
                        Mas comprados
                      </label>
                      <input class="form-check-input" type="checkbox" value="comprados" id="" name="comprados">
                    </div>
                    <div class="col-md-2">
                        <input type="submit" id="enviar" class="filtrar" value="filtrar">
                    </div>
                </div>
            </form>
   	
   	</div>
   	<div class="album py-5 bg-body-tertiary">
    	<div class="container">

        <div class="row row-cols-1 row-cols-sm-2 row-cols-md-3 g-3">
        <% List<Articulo> catalogo = (List<Articulo>) request.getAttribute("catalogo"); %>
        <% for (Articulo articulo : catalogo) { %>
        	<a href="carrito?id=<%=articulo.getId()%>" class="text-decoration-none text-black">
        	<div class="col">
                <div class="card shadow-sm">
                    <img src=""></img>
                    <div class="card-body">
                        <h2><%=articulo.getNombre() %></h2>
                        <p class="card-text"><%=articulo.getDescripcion() %></p>
                        <div class="d-flex justify-content-between align-items-center">
                            <small class="text-body-secondary"><%=articulo.getPrecio() %> €</small>
                            <div class="btn-group">
                            <form id="form" action="carrito" method="post">
                                <input type="hidden" id="id" name="id" value="<%=articulo.getId()%>">
                                <input type="submit" class="btn btn-sm btn-outline-secondary" id="enviar" value="al carrito">
                            </form>
                            </div>
                        </div>
                    </div>
                </div>
              </div>
              </a>
             <% } %>
     	</div>
     </div>
 </div>
                 
 </main>
    <%@ include file="/view/fragments/footer.jsp"%>
    <!-- <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
    <script>
        $(document).ready(function () {
            $("form[id^='formAjax']").submit(function (e) { 
            	let formId = $(this).attr('id');
                let form = {
                	id: $("#id").val(),
                	cantidad: $("#" + formId + "cantidad").val(),
                };
                console.log("entra");
                $.ajax({
                    type: "POST",
                    url: "carritoAjax",
                    datatype: "json",
                    data: form,
                    success: function (response) {
                        $("#botonCarrito").html(response);
                    }
                });
                e.preventDefault();
            });
        });
    </script>
 -->    
</body>
</html>
