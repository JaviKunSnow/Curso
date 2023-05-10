<!DOCTYPE html>
<html>
<head>
    <title>Ejemplo de AJAX con JSP y Servlets</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Incluimos los archivos CSS de Bootstrap -->
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
</head>
<body>
    <div class="container">
        <h1>Ejemplo de AJAX con JSP y Servlets</h1>
        <button id="btnEnviar" class="btn btn-primary">Enviar petición al servidor</button>
        <br><br>
        <div id="resultado"></div>
    </div>
    <!-- Incluimos los archivos JavaScript de jQuery y Bootstrap -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script>
        $(document).ready(function() {
            $("#btnEnviar").click(function() {
                // Hacemos una petición AJAX al servlet
                $.ajax({
                    url: "MiServlet",
                    method: "GET",
                    dataType: "text",
                    success: function(response) {
                        // Mostramos la respuesta del servlet en el div resultado
                        $("#resultado").html(response);
                    },
                    error: function(jqXHR, textStatus, errorThrown) {
                        console.log(textStatus, errorThrown);
                    }
                });
            });
        });
    </script>
</body>
</html>
