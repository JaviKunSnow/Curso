	<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<html>
<head>
<meta charset="UTF-8">
<title>Formulario de Login</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<style>
body {
	background-color: #f2f2f2;
}

.card {
	margin-top: 100px;
	margin-bottom: 100px;
	padding: 30px;
	border: none;
	border-radius: 10px;
	box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
}

.card-header {
	font-size: 24px;
	font-weight: bold;
	text-align: center;
	margin-bottom: 30px;
}

.form-group label {
	font-size: 18px;
	font-weight: bold;
	margin-bottom: 10px;
}

.form-control {
	height: 50px;
	font-size: 18px;
	border-radius: 5px;
	box-shadow: 0px 0px 5px rgba(0, 0, 0, 0.1);
}

.btn {
	height: 50px;
	font-size: 18px;
	font-weight: bold;
	border-radius: 5px;
	background-color: #3d3d3d;
	border-color: #3d3d3d;
	box-shadow: 0px 0px 5px rgba(0, 0, 0, 0.1);
}

.btn:hover {
	background-color: #2c2c2c;
	border-color: #2c2c2c;
}

.header {
	background-color: #3d3d3d;
	padding: 20px 0;
}

.logo {
	display: inline-block;
	width: 100px;
	height: 100px;
	margin-right: 20px;
}

.heading {
	display: inline-block;
	color: white;
	font-size: 24px;
	font-weight: bold;
}

.footer {
	background-color: #3d3d3d;
	color: white;
	padding: 20px 0;
}

.footer p {
	margin: 0;
	font-size: 16px;
	font-weight: bold;
}
</style>
</head>
<body>
	<header class="header">
		<div class="text-center">
			<div class="container">
				<h1 class="heading">Introduccion al desarrollo web</h1>
				<a href="pruebaFiltro"></a>
			</div>
		</div>
	</header>
	<div class="container">
		<div class="row">
			<div class="col-sm-4"></div>
			<div class="col-sm-4">
				<div class="card">
					<div class="card-header">Inicio de sesi�n</div>
					<form:form modelAttribute="userLogin" action="doLogin">
						<div class="form-group">
							<form:label path="email">Usuario</form:label> 
							<form:input path="email" type="text"
								class="form-control" id="email"
								placeholder="Introduce tu usuario"></form:input>
						</div>
						<div class="form-group">
							<form:label path="clave" for="clave">Contrase�a</form:label> 
							<form:input path="clave" type="password"
								class="form-control" id="clave"
								placeholder="Introduce tu contrase�a"></form:input>
						</div>
						<button type="submit" class="btn btn-primary btn-block">Iniciar
							sesi�n</button>
					</form:form>
					<c:if test="${errorMensaje != null}">
						<div class="form-group">${errorMensaje}</div>
					</c:if>
				</div>
			</div>
			<div class="col-sm-4"></div>
		</div>
	</div>
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</body>
<footer class="footer">
	<div class="container">
		<p class="text-center">&copy; 2023 Introduccion al desarrollo web</p>
	</div>
</footer>

</html>