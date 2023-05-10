<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title>Establecer cookie en Servlet</title>
     <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.6.0/css/bootstrap.min.css">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.6.0/js/bootstrap.bundle.min.js"></script>
    
  </head>
  <body>
    <h1>Establecer cookie en Servlet</h1>
    
    <form method="post" action="setCookie">
      <label>Nombre:</label>
      <input type="text" name="username">
      <button type="submit">Establecer cookie</button>
    </form>
    <a href="deleteCookie" class="btn-primary">Borrar Cookie</a>
    <a href="setCookieCarrito" class="btn-primary">Set Cookie Carrito</a>
    <a href="setCookieHashMap" class="btn-primary">Set Cookie HashMap</a>
    <a href="decodificarCookieHashMap" class="btn-primary">Ver Cookie HashMap</a>
 
  </body>
</html>
