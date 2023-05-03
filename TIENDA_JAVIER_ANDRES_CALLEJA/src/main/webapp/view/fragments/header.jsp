<%@ page import="curso.java.tienda.model.Usuario" %>
<header class="p-3 bg-dark fixed-top">
        <section class="container">
            <section class="d-flex flex-wrap align-items-center justify-content-center justify-content-lg-start">
                <a href="/" class="d-flex align-items-center mb-2 mb-lg-0 text-white text-decoration-none">
                    <img src="webroot/img/logo.jpg" class="bi me-2" width="60" height="40"></img>
                </a>
                <form class="col-12 col-lg-auto me-lg-auto mb-2 justify-content-center mb-md-0" action="./index.php" method="post">
                <ul class="nav">
                    <a href="HomeServlet" class="btn text-white">inicio</a>
                    <a href="perfil" class="btn text-white">perfil</a>
                    <input type="submit" class="btn text-white" name="home" value="Contacto">
                    </ul>
                </form>
                <form action="./index.php" method="post">
                	<% if(request.getSession().getAttribute("usuario") != null) { %>
                	<section class="text-end">
                		<a href="perfil" class='btn btn-outline-light me-2'><%= ((Usuario) request.getSession().getAttribute("usuario")).getNombre() %></a>
                        <a href="cerrar" class='btn btn-outline-light me-2'>cerrar sesion</a>
                        <a href="carritoFinal" class="btn btn-warning">
                        	<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-bag" viewBox="0 0 16 16">
							  <path d="M8 1a2.5 2.5 0 0 1 2.5 2.5V4h-5v-.5A2.5 2.5 0 0 1 8 1zm3.5 3v-.5a3.5 3.5 0 1 0-7 0V4H1v10a2 2 0 0 0 2 2h10a2 2 0 0 0 2-2V4h-3.5zM2 5h12v9a1 1 0 0 1-1 1H3a1 1 0 0 1-1-1V5z"/>
							</svg>
                        </a>
                	</section>
                	<% } else {%>
                		<section class="text-end">
                		<a href="login" class='btn colorfondo text-white me-2'>iniciar sesion</a>
                		<a href="register" class='btn colorfondo text-white me-2'>registrarse</a>
                        <a href="carritoFinal" class="btn colorfondo">
                        	<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-bag" viewBox="0 0 16 16">
							  <path d="M8 1a2.5 2.5 0 0 1 2.5 2.5V4h-5v-.5A2.5 2.5 0 0 1 8 1zm3.5 3v-.5a3.5 3.5 0 1 0-7 0V4H1v10a2 2 0 0 0 2 2h10a2 2 0 0 0 2-2V4h-3.5zM2 5h12v9a1 1 0 0 1-1 1H3a1 1 0 0 1-1-1V5z"/>
							</svg>
                        </a>
                	<%}%>
               	</form>
            </section>
        </section>
    </header>