<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<html>
  <head>
    <%@ include file="../fragments/headFragment.jsp" %>
    <style>
      .card-header {
        text-align: center;
        background-color: white;
        color: black;
        font-size: 24px;
        font-weight: bold;
        padding: 16px;
      }
      .btn-primary {
        background-color: #000;
        border-color: #000;
      }
      .btn-primary:hover {
        background-color: #333;
        border-color: #333;
      }
      .card {
        background-color: #f2f2f2;
      }
      
      .error{
      	color:red;
      }
    </style>
  </head>
  <body>
    <%@ include file="../fragments/headerFragment.jsp" %>
    <div class="relleno" style="margin-top:4%"></div>
    <div class="container d-flex justify-content-center align-items-center h-100">
      <div class="card shadow p-3 mb-5 bg-white rounded" style="width: 30%;">
        <div class="card-header">Registro</div>
        <div class="card-body">
        
          <form:form modelAttribute="userRegister" action="doRegister">
          
          
            <div class="form-group">
              <form:label path="email" class="form-label">Email:</form:label>
              <form:input path="email" type="email" class="form-control" id="email"  />
              <form:errors path="email" cssClass="error" />
              <c:forEach var="error" items="${binding.getFieldErrors('email')}" varStatus="status">
  					<c:if test="${not empty error}">
 					   <c:if test="${status.index == 0}">
      						<div class="alert alert-danger">${error.defaultMessage}</div>      						
   					 </c:if> 
   				  </c:if>
			 </c:forEach>	
              <div id="email-error" class="error"></div>
            </div>
            
            
            <div class="form-group">
              <form:label path="clave" class="form-label">Contraseña:</form:label>
              <div class="input-group">
                <form:input path="clave" type="password" id="clave" class="form-control"  />
                <button type="button" class="btn btn-outline-secondary" id="togglePassword">
                  <i class="bi bi-eye"></i>
                </button>
                <c:forEach var="error" items="${binding.getFieldErrors('password')}" varStatus="status">
  					<c:if test="${not empty error}">
 					   <c:if test="${status.index == 0}">
      						<div class="alert alert-danger">${error.defaultMessage}</div>      						
   					 </c:if> 
   				  </c:if>
			 </c:forEach>	
             <form:errors path="clave" cssClass="error" />
              </div>              
              <div id="clave-error" class="error"></div>
              
              
            </div>
            <div class="form-group">
              <form:label path="nombre" class="form-label">Nombre:</form:label>
              <form:input path="nombre" type="text" id="nombre" class="form-control"  />   
 			  
 			  <c:forEach var="error" items="${binding.getFieldErrors('nombre')}" varStatus="status">
  					<c:if test="${not empty error}">
 					   <c:if test="${status.index == 0}">
      						<div class="alert alert-danger">${error.defaultMessage}</div>      						
   					 </c:if> 
   				  </c:if>
			 </c:forEach>			
			 <form:errors path="nombre" cssClass="error" />	          
            <div id="nombre-error" class="error"></div>
            
            
            </div>
            <div class="form-group form-check">
              <form:checkbox path="aceptaCondiciones"  class="form-check-input" id="aceptaCondiciones" />
              <form:label for="aceptaCondiciones" path="aceptaCondiciones" class="form-check-label">Acepto las condiciones</form:label>
             <form:errors path="aceptaCondiciones" cssClass="error" />
              <div id="aceptaCondiciones-error" class="error"></div>
            </div>
            
            
            <button type="submit" class="btn btn-primary btn-block" onclick= "return validateForm();">Enviar</button>
		</form:form>
	        </div>
	      </div>
	    </div>
	  <div class="relleno" style="margin-top:3%"></div>
	
	
	    <%@ include file="../fragments/footerFragment.jsp" %>
	    <script>
	    
	    
			  /* const togglePassword = document.getElementById('togglePassword');
			  const password = document.getElementById('clave');
			  
			  togglePassword.addEventListener('click', function() {
			    const type = password.getAttribute('type') === 'password' ? 'text' : 'password';
			    password.setAttribute('type', type);
			    this.classList.toggle('bi-eye');
			    this.classList.toggle('bi-eye-slash');
			  });
			  
			  
			  
			  function validateForm() {
				  
				  const email = document.getElementById('email').value.trim();
				  const clave = document.getElementById('clave').value.trim();
				  const nombre = document.getElementById('nombre').value.trim();
				  const aceptaCondiciones = document.getElementById('aceptaCondiciones').checked;
				 
				  
				  let isValid = true;
	
				  // Validar campo de email
				  if (email === '') {
				    document.getElementById('email-error').textContent = 'Este campo es obligatorio.';
				    isValid = false;
				  } else if (email.length < 2) {
				    document.getElementById('email-error').textContent = 'Este campo debe tener al menos 2 caracteres.';
				    isValid = false;
				  } else if (email.length > 15) {
				    document.getElementById('email-error').textContent = 'Este campo no debe tener más de 15 caracteres.';
				    isValid = false;
				  } else {
				    document.getElementById('email-error').textContent = '';
				  }
	
				  // Validar campo de clave
				  if (clave === '') {
				    document.getElementById('clave-error').textContent = 'Este campo es obligatorio.';
				    isValid = false;
				  } else if (clave.length < 2) {
				    document.getElementById('clave-error').textContent = 'Este campo debe tener al menos 2 caracteres.';
				    isValid = false;
				  } else if (clave.length > 15) {
				    document.getElementById('clave-error').textContent = 'Este campo no debe tener más de 15 caracteres.';
				    isValid = false;
				  } else {
				    document.getElementById('clave-error').textContent = '';
				  }
	
				  // Validar campo de nombre
				  if (nombre === '') {
				    document.getElementById('nombre-error').textContent = 'Este campo es obligatorio.';
				    isValid = false;
				  } else if (nombre.length < 2) {
				    document.getElementById('nombre-error').textContent = 'Min 2 caracteres.';
				    isValid = false;
				  } else if (nombre.length > 15) {
				    document.getElementById('nombre-error').textContent = 'Max 15 caracteres.';
				    isValid = false;
				  } else {
				    document.getElementById('nombre-error').textContent = '';
				  }
	
				  // Validar campo de aceptaCondiciones
				  if (!aceptaCondiciones) {
					  alert("check");
				    document.getElementById('aceptaCondiciones-error').textContent = 'Aceptar condiciones  .';
				    isValid = false;
				  } else {
				    document.getElementById('aceptaCondiciones-error').textContent = '';
				  }
	
				  alert("valido" + isValid);
				  return isValid;
				} */
			  
			  
			  
			  
							 
	</script>
	    
	  </body>
	</html>
	
	
