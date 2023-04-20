<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %>
<%@ page import="curso.java.tienda.model.articulo" %>
<%@ page import="curso.java.tienda.model.Usuario" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
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

    </head>

    <body style="padding-bottom: 70px; padding-top: 70px;">
        <%@ include file="/view/fragments/header.jsp" %>
            <main>
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
                            	<%--<%  HashMap<String, articulo> carrito = (HashMap<Integer, articulo>) session.getAttribute("carrito");
                            	HashMap<Integer, articulo> nuevoCarrito = new HashMap<Integer, articulo>();

                            	for(Map.Entry<String, articulo> entry : carrito.entrySet()) {
                            	    Integer clave = Integer.parseInt(entry.getKey());
                            	    articulo valor = entry.getValue();

                            	    nuevoCarrito.put(clave, valor);
                            	} --%>
            					<%for(Map.Entry<Integer, articulo> entry : ((HashMap<Integer, articulo>) session.getAttribute("carrito")).entrySet()) { %>
                                <tr>
                                    <td>
                                    <%= entry.getValue().getNombre() %>
                                    </td>
                                    <td><%= entry.getValue().getDescripcion() %></td>
                                    <td><%= entry.getValue().getCantidad() %></td>
                                    <td>
                                        <div class="price-wrap"> <var class="price"><%= entry.getValue().getPrecio() %>$</var></div>
                                    </td>
                                    <td class="text-right d-none d-md-block"> <a data-original-title="Save to Wishlist" title="" href="" class="btn btn-light" data-toggle="tooltip" data-abc="true"> <i class="fa fa-heart"></i></a> <a href="" class="btn btn-light btn-round" data-abc="true"> Remove</a> </td>
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
                            <dd class="text-right ml-3">$99.99</dd>
                        </dl>
                        <hr> 
                        <a href="#" class="btn btn-out btn-primary btn-square btn-main" data-abc="true">Continua comprando</a> 
                        <a href="carritoFinalizar" class="btn btn-out btn-success btn-square btn-main mt-2" data-abc="true">Finalizar compra</a>
                    </div>
                </div>
            </aside>
        </div>
    </div>
            </main>
            <%@ include file="/view/fragments/footer.jsp" %>
    </body>

    </html>
