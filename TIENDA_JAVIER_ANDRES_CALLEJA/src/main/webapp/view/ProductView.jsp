<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="curso.java.tienda.model.Articulo" %>
<%@ page import="curso.java.tienda.model.Usuario" %>
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
	<% Articulo articulo = (Articulo) request.getAttribute("articulo"); %>
        <div class="container mt-5 mb-5">
            <div class="row d-flex justify-content-center">
                <div class="col-md-10">
                    <div class="card">
                        <div class="row">
                            <div class="col-md-6">
                                <div class="images p-3">
                                    <div class="text-center p-4"> <img id="main-image" src="" width="250" /> </div>
                                    <div class="thumbnail text-center"> <img src="" width="70"> </div>
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="product p-4">
                                    <div class="d-flex justify-content-between align-items-center">
                                        <div class="d-flex align-items-center">
                                            <a href="HomeServlet" class="btn bg-warning">Volver</a>
                                        </div>
                                    </div>
                                    <div class="mt-4 mb-3"> <span class="text-uppercase text-muted brand"><%= articulo.getMarca() %></span>
                                        <h5 class="text-uppercase"><%= articulo.getNombre() %></h5>
                                        <div class="price d-flex flex-row align-items-center"> 
                                            <span class="act-price"><%= articulo.getPrecio() %> €</span>
                                        </div>
                                    </div>
                                    <p class="about"><%= articulo.getDescripcion() %></p>
                                    <!--  <div class="sizes mt-5">
                                        <div class="mb-3">
                                            <label for="" class="form-label">TALLAS</label>
                                            <select class="form-select form-select-lg" name="" id="">
                                                <option >36</option>
                                                <option value="">37</option>
                                                <option value="">38</option>
                                                <option value="">39</option>
                                                <option value="" selected>40</option>
                                                <option value="">41</option>
                                                <option value="">42</option>
                                                <option value="">43</option>
                                                <option value="">44</option>
                                                <option value="">45</option>
                                                <option value="">46</option>
                                            </select>
                                        </div>
                                    </div>
                                        <div class="mb-3">
                                            <label for="" class="form-label">COLORES</label>
                                            <select class="form-select form-select-lg" name="" id="">
                                                <option selected>Rojo y negro</option>
                                                <option value="">Azul y blanco</option>
                                                <option value="">Doradas y morado</option>
                                                <option value="">Blanco y negro</option>
            
                                            </select>
                                        </div>       -->                         
                                    <div class="cart mt-4 align-items-center"> 
                                    	<form action="carrito" method="post">
                                    		<input type="hidden" name="id" value="<%= articulo.getId() %>">
                                    		<input type="submit" class="btn btn-warning text-uppercase mr-2 px-4" value="Añadir al carrito">
                                    	</form>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
      </main>
      <%@ include file="/view/fragments/footer.jsp"%>
</body>
</html>