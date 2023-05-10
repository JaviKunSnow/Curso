<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<h2 align="center">Está será nuesta home</h2>
<hr>



<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">WebSiteName</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="/04springmvc.comenzando">Home</a></li>
      <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="#">Controlador 1<span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a class="dropdown-item" href="home">Home</a></li>
          <li><a class="dropdown-item" href="saludar">Saludar</a></li>
          <li><a class="dropdown-item" href="get">Obtener</a></li>
        </ul>
      </li>
      <li><a href="dos">Controlador 2</a></li>
      <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="#">Controlador 3<span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a class="dropdown-item" href="tres/prueba">Prueba</a></li>
          <li><a class="dropdown-item" href="tres/contestar">Contestar</a></li>
        </ul>
      </li>      
      <li><a href="cafe">Controlador Cafe</a></li>
    </ul>
  </div>
</nav>






</body>
</html>
