<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="javax.servlet.jsp.PageContext, java.util.List, model.VO.ProductVO" %>
<!DOCTYPE html>
<%@ page isELIgnored="false" %>
<html>
<%@ include file="../fragments/headFragment.jsp" %>
<body>
	<%@ include file="../fragments/headerFragment.jsp" %>
	
<!-- Zona central -->
<div class="container my-5">
  <div class="row">
    <% List<ProductVO> catalogo = (List<ProductVO>) request.getAttribute("catalogo"); %>
    <% for (ProductVO articulo : catalogo) { %>
    <div class="col-lg-3 col-md-4 col-sm-6 mb-4">
      <div class="card">
        <img class="card-img-top" src="<%= articulo.getImagen() %>" alt="Card image cap">
        <div class="card-body">
          <h5 class="card-title"><%= articulo.getNombre() %></h5>
          <p class="card-text"><%= articulo.getDescripcion() %></p>
          <p class="card-text">Precio: $<%= articulo.getPrecio() %></p>
          <form action="agregar" method="post">
            <input type="hidden" name="id" value="<%= articulo.getId() %>">
            <div class="input-group mb-3">
              <div class="input-group-prepend">
                <button class="btn btn-outline-secondary" type="button" id="menos">-</button>
              </div>
              <input type="number" class="form-control" placeholder="Cantidad" name="cantidad" value="1">
              <div class="input-group-append">
                <button class="btn btn-outline-secondary" type="button" id="mas">+</button>
              </div>
            </div>
            <button type="submit" class="btn btn-primary mt-2">Agregar al carrito</button>
          </form>
        </div>
      </div>
    </div>
    <% } %>
  </div>
</div>
	   
	   
	       	   
	<%@ include file="../fragments/footerFragment.jsp" %>
</body>
</html>




