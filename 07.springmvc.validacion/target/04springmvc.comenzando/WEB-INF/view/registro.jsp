<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<script>


//ESTE EJEMPLO ESTÁ PARA REPRESENTAR LA IMPORTANCIA DE LAS VALIDACIONES EN EL SERVIDOR.
//ESTA FUNCIÓN SOLO DEMUESTRA ALGUNAS DE LAS VULNERABILIDADES DIRECTAS QUE PODEMOS "SUFRIR"
//A TRAVES DE LAS HERRAMIENAS DE DESARROLLADORES, EN LA PESTAÑA ELEMENTS PODEMOS EDITAR EL CODIGO, QUITAR EL ID DEL CAMPO USERNAME Y PODER SALTARNOS LA VALIDACIÓN DEL FORMULARIO
//ADEMAS, PODEMOS DESACTIVARLO DIRECTAMENTE, CON LO QUE NO PODRÍAMOS VALIDAR NADA DESDE EL LADO DEL CLIENTE
//Otra forma de deshabilitar java script. desde herramientas, ir al menu, run command, buscar javascript y sale la opcion
//Directamente desde las opciones generales del navegador, configuración-->Privacidad y seguridad --> Configuración del sition --> JAvaScript

function validar()
//{
//	alert("validando...");
	
//	var userName=document.getElementById('userName').value;
	
//	alert(userName);
	
//	if(userName.length < 2){
//		alert("Introduzca al menos un caracter");
//		return false;
//	}
//	else{
//		return true;
//	}	
	
	
	//Descomentar para probar
	
	return true;
	
}

</script>
<style>
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
	width: 20%
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
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">Registrate aqui</h1>
	<hr>
	<br>
	<br>
	<div align="center">
	<form:form action="process-register" modelAttribute="userRegister" align="left" onsubmit="return validar()">
		<fieldset>
			<legend>Datos del usuario</legend>
			<br>
			
				<label>Nombre:</label>
				<form:input path="name" />
				<br>
				<br>
				<label>Usuario:</label>
				<!-- PODEMOS DARLE UN ID AL INPUT, SI NO LO HACEMOS, SRING INYECTARA UN ID CON EL MISMO NOMBRE QUE TIENE EL PATH -->
				<form:input path="userName" />
				<br>
				<br>
				<label>Password:</label>
				<form:input path="password" />
				<br>
				<br>
				<label>Pais:</label>
				<form:select path="country">
					<form:option value="1" label="España"></form:option>
					<form:option value="2" label="Nueva Zelanda"></form:option>
					<form:option value="3" label="Noruega">
					</form:option>
				</form:select>
				<br>
				<br>
				<label>Hobbies: </label>
				<br>
				Pesca<form:checkbox path="hobbies" value="1" />
				Esquí<form:checkbox path="hobbies" value="2" />
				Buceo<form:checkbox path="hobbies" value="3" />
				Viajar<form:checkbox path="hobbies" value="4" />
				<br>
				<br>
				<label>Genero: </label>
				<br>
				Hombre<form:radiobutton path="gender" value="1" />
				Mujer<form:radiobutton path="gender" value="2" />
				<br>
				<br>
				<input type="submit" value="Enviar" />
				
				
				<fieldset>
				<legend>Datos de contacto</legend>

				
				
				<input type="submit" value="Enviar" />

			</fieldset>
				
			

		</fieldset>
		</form:form>
	</div>
</body>
</html>