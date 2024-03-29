<header class="p-3 text-bg-dark fixed-top">
        <section class="container">
            <section class="d-flex flex-wrap align-items-center justify-content-center justify-content-lg-start">
                <a href="/" class="d-flex align-items-center mb-2 mb-lg-0 text-white text-decoration-none">
                    <img src="webroot/img/logo.jpg" class="bi me-2" width="60" height="40"></img>
                </a>
                <form class="col-12 col-lg-auto me-lg-auto mb-2 justify-content-center mb-md-0" action="./index.php" method="post">
                <ul class="nav">
                    <a href="" class="btn text-white">inicio</a>
                    <a href="perfil" class="btn text-white">perfil</a>
                    <input type="submit" class="btn text-white" name="home" value="Contacto">
                    </ul>
                </form>
                <form action="./index.php" method="post">
                	<% if(request.getSession().getAttribute("usuario") != null) { %>
                	<section class="text-end">
                		<a href="perfil" class='btn btn-outline-light me-2'><%=request.getSession().getAttribute("usuario")%></a>
                        <a href="cerrar" class='btn btn-outline-light me-2'>cerrar sesion</a>
                        <button id="botonCarrito" class="btn btn-warning">0</button>
                	</section>
                	<% } else {%>
                		<section class="text-end">
                		<a href="login" class='btn btn-outline-light me-2'>iniciar sesion</a>
                        <button id="botonCarrito" class="btn btn-warning">0</button>
                	<%}%>
               	</form>
            </section>
        </section>
    </header>