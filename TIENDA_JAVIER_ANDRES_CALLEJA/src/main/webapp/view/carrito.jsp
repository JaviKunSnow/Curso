<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %>
<%@ page import="curso.java.tienda.model.Articulo" %>
<%@ page import="curso.java.tienda.model.Usuario" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <!doctype html>
    <html lang="es">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Inicio</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
            integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
            crossorigin="anonymous"></script>
			<link rel="stylesheet" type="text/css" href="view/css/colores.css">
    </head>

    <body>
        <%@ include file="/view/fragments/header.jsp" %>
            <main>
            <h2 class="p-3">Mi carrito</h2>
                <div class="container-fluid">
        <div class="row">
            <aside class="col-lg-9">
                <div class="card">
                    <div class="table-responsive">
                        <table class="table table-borderless table-shopping-cart">
                            <thead class="text-muted">
                                <tr class="small text-uppercase">
                                    <th scope="col">Producto</th>
                                    <th scope="col" width="200">Descripcion</th>
                                    <th scope="col" width="200">cantidad</th>
                                    <th scope="col" width="200">Precio</th>
                                    <th scope="col" class="text-right d-none d-md-block" width="200"></th>
                                </tr>
                            </thead>
                            <tbody>
            					<%for(Map.Entry<Integer, Articulo> entry : ((HashMap<Integer, Articulo>) session.getAttribute("carrito")).entrySet()) { %>
                                <tr>
                                    <td>
                                    <%= entry.getValue().getNombre() %>
                                    </td>
                                    <td><%= entry.getValue().getDescripcion() %></td>
                                    <td><%= entry.getValue().getCantidad() %></td>
                                    <td>
                                        <div class="price-wrap"> <var class="price"><%= entry.getValue().getPrecio() %> €</var></div>
                                    </td>
                                    <td class="text-right d-none d-md-block"> 
                                    	<a href="CarritoEliminarServlet?id=<%= entry.getValue().getId() %>" class="btn btn-dark text-white btn-round">Eliminar</a> 
                                    </td>
                                </tr>
                                <% } %>
                            </tbody>
                        </table>
                    </div>
                </div>
            
            </aside>
            
            <aside class="col-lg-3">
                <div class="card">
                    <div class="card-body">
                        <dl class="dlist-align">
                            <dt>Precio total:</dt>
                            <dd class="text-right ml-3"><%= request.getAttribute("total") %> €</dd>
                        </dl>
                        <form action="carritoFinal" method="post">
                            <div class="mb-3">
                                <label for="pago" class="form-label">Metodo de pago:</label>
                                <select class="form-select form-select-lg" name="pago" id="pago">
                                    <option selected>Selecciona uno</option>
                                    <option value="tarjeta">Tarjeta de credito</option>
                                    <option value="paypal">Paypal</option>
                                </select>
                            </div>
                            <hr> 
                            <div class="col-12">
                            	<a href="#" class="btn btn-out colorfondo text-white btn-square btn-main" data-abc="true">Continua comprando</a> 
                            </div>
                            <div class="col-12">
                            	<input type="submit" class="btn btn-out colorfondo text-white btn-square btn-main mt-2" value="finalizar compra">
                            </div>
                        </form>
                    </div>
                </div>
            </aside>
        </div>
    </div>
            </main>
            <%@ include file="/view/fragments/footer.jsp" %>
    </body>

    </html>
