<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="curso.java.tienda.model.Articulo" %>
<%@ page import="curso.java.tienda.model.Pedido" %>
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
	<h1 class="mt-4">Mis pedidos</h1>
		<form action="verPedidosServlet" method="post" class="my-4" id="form">
                <div class="row justify-content-end">
                    <div class="col-md-3 align-self-center">
                        <label for="date">Fecha: </label>
                        <input type="date" class="form-control" id="fecha" name="fecha">
                    </div>
                    <div class="col-md-3 align-self-end">
                        <input type="submit" value="filtrar">
                    </div>
                </div>
         </form>
         <% List <Pedido> pedidos = (List <Pedido>)request.getAttribute("pedidos"); %>
         <div class="table-responsive">
            <table class="table table-warning">
                <thead>
                    <tr>
                        <th scope="col">Numero de factura</th>
                        <th scope="col">Fecha de compra</th>
                        <th scope="col">Metodo de pago</th>
                        <th scope="col">Estado</th>
                    </tr>
                </thead>
                <tbody>
                <% for(Pedido pedido : pedidos) { %>
                    <tr class="">
                        <td><%= pedido.getNumFactura() %></td>
                        <td><%= pedido.getFecha() %></td>
                        <td><%= pedido.getMetodoPago() %></td>
                        <td></td>
                        <td><%= pedido.getTotal() %></td>
                        <td><a href="VerDetalleServlet?id=<%= pedido.getId() %>" class="btn btn-light text-dark">Detalles</a></td>
                    </tr>
             	<% } %>
                </tbody>
            </table>
         </div>
         
	</main>
	<%@ include file="/view/fragments/footer.jsp"%>
</body>
</html>