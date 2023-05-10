<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Esta es la home</title>
<style type="text/css">
.error {
	color: red;
	position: fixed;
	text-align: left;
	margin-left: 8px;
}

fieldset {
	background-color: #eeeeee;
	display: block;
	margin-left: 2px;
	margin-right: 2px;
	padding-top: 0.35em;
	padding-bottom: 0.625em;
	padding-left: 0.75em;
	padding-right: 0.75em;
	border: 2px groove(internal value);
	width: 25%
}

legend {
	background-color: gray;
	color: white;
	padding: 5px 10px;
}

input {
	margin: 5px;
}
</style>
</head>
<body>
	<h1 align="center">MATCH APP</h1>
	<hr>
	<br><br>
	<div align="center">

		<!-- EMPZAMOS A UTLIZAR LAS ETIQUETAMOS QUE HEMOS INCLUIDO A TRAVES DE LAS DEPENDECIAS
	     ES IMPORTANTE QUE VAYA SEGUIDAS, SI NO DARÁ ERROR!! 
	     ES IMPORTANTE ESTABLECER EL ATRIBUTE MODEL EN ESTA ETIQUETA, PARA QUE SE PUEDA HACER LA VINCULACIÓN DEL OBJETO DEL MODELO CON LOS CAMPOS DEL FORMULARIO	     
	     -->
	     <!-- PARA LOS CAMPOS INPUT EL ATRIBUTO MÁS IMPORTANTE ES EL DE PATH Y CUYO VALOR SERA EL NOMBRE DEL ATRIBUTO DE LA CLASE -->
		<form:form action="calcular" modelAttribute="userInfo" method="POST">
			<fieldset>
				<legend>Datos del usuario</legend>
				<label for="nombreLbl">Tu Nombre&nbsp;&nbsp;</label>
				<form:input path="nombre" />
				<!-- Etiqueta que nos mostrara los errores del formulario -->
				<form:errors path="nombre" cssClass="error"></form:errors>
				<br> <br> <label for="otroNombreLbl">Otro nombre</label>
				<form:input path="otroNombre" />
				<form:errors path="otroNombre" cssClass="error"></form:errors>
				<br> <br>
				<form:checkbox path="terms" />
				<label>Estoy de acuerdo con las condiciones</label>
				<form:errors path="terms" cssClass="error"></form:errors>
				<br> <br> <input type="submit" value="Enviar">
			</fieldset>
			<br>
			<br>
		</form:form>
	</div>
	<br>	
	<hr>
	<a href="register">Registrate Aquí</a>
</body>
</html>