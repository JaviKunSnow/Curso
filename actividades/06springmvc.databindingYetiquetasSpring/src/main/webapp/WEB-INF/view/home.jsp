<!-- IMPORTATNE. ES NECESARIA UTILIZAR ESTA DIRECTIVA PARA INCLUIOR ETIQUETAS DE SPRING -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Esta es la home</title>
</head>
<body>

<h1 align="center">HOME</h1>
<hr>
<br>

<h3>SIN ETIQUETAS DE SPRING</h3>
	<div align="center">
		<form action="calcular2" method="POST">			
			 <label for="nombreLbl">Tu Nombre&nbsp;&nbsp;</label>
			  <input id="nombreLbl" name="nombre"	type="text" />
			  <br> <br>
			  <label for="otroNombreLbl">Otro nombre</label>
			  <input id=" otroNombreLbl" type="text" name="otroNombre"/>
			  <br><br>
			  
			  <input type="submit" value="Enviar">
		</form>
	</div>	
<br>
<br>
<hr>
<br>
<br>	


<h3>CON ETIQUETAS DE SPRING</h3>
	<div align="center">
	
	<!--  En este momento necesitmaos introducir SPRING MVC TAGS -->
	
	<!-- bASICAMENTE ES EMPEZAR LAS ETIQUETAS CON EL PREFIJO form: -->
	
	<!-- EMPZAMOS A UTLIZAR LAS ETIQUETAMOS QUE HEMOS INCLUIDO A TRAVES DE LAS DEPENDECIAS  ES IMPORTANTE QUE VAYA SEGUIDAS, SI NO DARÁ ERROR!! 
	     ES IMPORTANTE ESTABLECER EL ATRIBUTE MODEL EN ESTA ETIQUETA, PARA QUE SE PUEDA HACER LA VINCULACIÓN
	     El ATRIBUTO DEBE DE ESTAR RELLENO CON EL MISMO NOMBRE QUE SE LE DIO EN EL CONTROLADOR AL ESTABLECERLOR COMO PARAMETRO
	     -->
		<form:form action="calcular"  modelAttribute="userInfo" method="POST">			
			  <label for="nombreLbl">Tu Nombre&nbsp;&nbsp;</label>
			  <form:input  path="nombre"/>
			  <br> <br>
			  <label for="otroNombreLbl">Otro nombre</label>
			  <form:input  path="otroNombre"/>
			  <br><br>			  
			  <input type="submit" value="Enviar">
		</form:form>
		
	</div>
<br>
<br>
<hr>
<br>
<br>	
	
	<a href="register">Registrarse</a>
	
</body>
</html>