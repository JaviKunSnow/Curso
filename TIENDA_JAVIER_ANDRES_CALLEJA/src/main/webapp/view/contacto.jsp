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
	<link rel="stylesheet" type="text/css" href="view/css/colores.css">
</head>
<body style="padding-bottom: 70px;">
    <%@ include file="/view/fragments/header.jsp"%>
	<main>
			<div class="container my-5">
	  <div class="row justify-content-center">
	    <div class="col-lg-9">
	      <h1 class="mb-3">Contactanos</h1>
	      <form action="Contacto" method="post">
	        <div class="row g-3">
	          <div class="col-md-6">
	            <label for="your-name" class="form-label">Nombre</label>
	            <input type="text" class="form-control" id="your-name" name="your-name">
	          </div>
	          <div class="col-md-6">
	            <label for="your-surname" class="form-label">Apellidos</label>
	            <input type="text" class="form-control" id="your-surname" name="your-surname">
	          </div>
	          <div class="col-md-6">
	            <label for="your-email" class="form-label">Tu email</label>
	            <input type="email" class="form-control" id="your-email" name="your-email">
	          </div>
	          <div class="col-md-6">
	            <label for="your-subject" class="form-label">Tu asunto</label>
	            <input type="text" class="form-control" id="your-subject" name="asunto">
	          </div>
	          <div class="col-12">
	            <label for="your-message" class="form-label">Tu mensaje</label>
	            <textarea class="form-control" id="your-message" name="mensaje" rows="5"></textarea>
	          </div>
	          <div class="col-12">
	            <div class="row">
	              <div class="col-md-6">
	              </div>
	              <div class="col-md-6">
	                <button type="submit" class="btn colorfondo w-100 fw-bold text-light" >Enviar</button>
	              </div>
	            </div>
	          </div>
	        </div>
	      </form>
	    </div>
	  </div>
	</div>
	</main>
	<%@ include file="/view/fragments/footer.jsp"%>
</body>
</html>