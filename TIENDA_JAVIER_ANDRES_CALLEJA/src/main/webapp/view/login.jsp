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
	<link rel="stylesheet" type="text/css" href="view/css/sign-in.css">
	<link rel="stylesheet" type="text/css" href="view/css/colores.css">
</head>
<body style="padding-bottom: 70px;">
	<%@ include file="/view/fragments/header.jsp"%>
	<main class="form-signin w-100 m-auto text-center">
		<section class="container bg-dark p-2 rounded">
			<section class="form-signin w-100 m-auto text-center text-white">
				<form action="login" method="post">
					<% 
					if(request.getAttribute("comprando") != null) {%>
						<input type="hidden" name="comprando" value="<%=request.getAttribute("comprando")%>">
					<%} else if(request.getAttribute("perfil") != null) { %>
						<input type="hidden" name="perfil" value="<%=request.getAttribute("perfil")%>">
					<% }%>
					<img class="mb-4" src="webroot/img/logo.jpg" alt="" width="140"
						height="100">
					<h1 class="h3 mb-3 fw-normal">Iniciar Sesion</h1>
					<section class="form-floating p-1 text-dark">
						<section class="form-group">
							<input type="text" class="form-control" name="usuario"
								id="usuario" placeholder="name@example.com">
							<%
							if (request.getAttribute("errorusuario") != null) {
							%>
							<span class="invalid feedback text-white"><%=request.getAttribute("errorusuario")%></span>
							<%
							}
							%>
							<em></em> <label for="usuario">Usuario:</label>
						</section>

					</section>
					<section class="form-floating p-1 text-dark">
						<input type="password" class="form-control" name="password"
							id="password" placeholder="Password">
						<%
						if (request.getAttribute("errorpassword") != null) {
						%>
						<span class="invalid feedback is-invalid text-white"><%=request.getAttribute("errorpassword")%></span>
						<%
						}
						%>
						<em></em> <label for="password">Contraseña:</label>
					</section>
					<input type="submit" class="w-100 btn btn-lg btn-outline-light colorfondo text-white"
						value="iniciar sesion">
					<p class="mt-5 mb-3 text-white">&copy; 2023</p>
				</form>
			</section>
		</section>
	</main>
	<%@ include file="/view/fragments/footer.jsp"%>
</body>
</html>