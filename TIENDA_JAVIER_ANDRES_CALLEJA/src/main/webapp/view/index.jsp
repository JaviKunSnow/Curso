<%@ page import="java.util.List" %>
<%@ page import="curso.java.tienda.model.articulo" %>
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
   			<div class="album py-5 bg-body-tertiary">
    <div class="container">

        <div class="row row-cols-1 row-cols-sm-2 row-cols-md-3 g-3">
        <% List<articulo> catalogo = (List<articulo>) request.getAttribute("catalogo"); %>
        <% for (articulo articulo : catalogo) { %>
            <div class="col">
                <div class="card shadow-sm">
                    <img src="<%=articulo.getImagen()%>"></img>
                    <div class="card-body">
                        <title><%=articulo.getNombre() %></title>
                        <p class="card-text"><%=articulo.getDescripcion() %></p>
                        <div class="d-flex justify-content-between align-items-center">
                            <small class="text-body-secondary"><%=articulo.getPrecio() %> €</small>
                            <div class="btn-group">
                            <form id="form" action="carritoServlet" method="post">
                                <input type="hidden" id="id" name="id" value="<%=articulo.getId()%>">
                                <input type="number" id="cantidad" name="cantidad" min="1">
                                <input type="submit" class="btn btn-sm btn-outline-secondary" id="enviar" value="al carrito">
                            </form>
                            </div>
                        </div>
                    </div>
                </div>
             <% } %>
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
