<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>


<html>

<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>


</head>


<body>
	<h2>Registro Exitoso!</h2>
	<!-- AHORA TENEMOS EL OBJETO DTO DISPONIBLE EN LA VISTA Y PODEMOS ACCEDER DE LA SIGUIENTE MANERA -->
			
	<p>Nombre: Tu nombre es <strong style="color:red">${userRegister.name}</strong></p>
	
	<p>Usuario: Tu Usuario es <strong style="color:red">${userRegister.userName}</strong></p>
	
	<!-- Esto nos dara la referencia porque es un objeto, un array -->
	<p>Password: Tu Referencia Password  <strong style="color:red">${userRegister.password}</strong></p>
	
	<p>Tu password real es:
		<c:forEach var="pass" items="${userRegister.password}">
				<strong style="color:red">${pass}</strong>
		</c:forEach>
	</p>
	
	<p>Pais:  Tu Pais es <strong style="color:red">${userRegister.country}</strong></p>
	<!--
	     Esto nos dara la referencia porque es un objeto, un array
		 Par ello necesitamos recorrer el array y utilizar un for-each
	 -->
	<p>Hobbies referencia: Tu referencia es:  <strong style="color:red">${userRegister.hobbies}</strong></p>
	 
	<p>Hobbies: Tus Hobbies son</p> 
		<c:forEach var="hobbie" items="${userRegister.hobbies}">
				<p>Hobbie: <strong style="color:red">${hobbie}</strong></p>
		</c:forEach>
			
	<p>Genero: Tu Genero es <strong style="color:red">${userRegister.gender}</strong></p>
	
			
	<p>Genero: Tu Genero es <strong style="color:red">${userRegister.userContact.email}</strong></p>
	
			
	<p>Genero: Tu Genero es <strong style="color:red">${userRegister.userCopntact.telefono.usernumber}</strong></p>
	
</body>
</html>
