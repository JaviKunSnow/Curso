<%@ page import="java.util.List" %>
<%@ page import="curso.java.tienda.model.Articulo" %>
<%@ page import="curso.java.tienda.model.DetallePedido" %>
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
         <% List <DetallePedido> detalles = (List <DetallePedido>)request.getAttribute("detalles"); %>
         <h1 class="mt-4">Pedido: Nº <%= request.getAttribute("id") %></h1>
         <div class="table-responsive">
            <table class="table table-warning">
                <thead>
                    <tr>
                        <th scope="col">Producto</th>
                        <th scope="col">Unidades compradas</th>
                        <th scope="col">Precio unidad</th>
                        <th scope="col">Total</th>
                    </tr>
                </thead>
                <tbody>
         		<% for(DetallePedido detalle : detalles) { %>
                    <tr class="">
                        <td></td>
                        <td><%= detalle.getUnidades() %></td>
                        <td><%= detalle.getPrecioUnidad() %></td>
                        <td><%= detalle.getTotal() %></td>
                    </tr>
             	<% } %>
                </tbody>
            </table>
         </div>
         
	</main>
	<%@ include file="/view/fragments/footer.jsp"%>
</body>
</html>