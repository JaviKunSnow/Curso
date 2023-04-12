<!DOCTYPE html>
<html>
<head>
    <title>Ejemplo de AJAX con JSP y Servlets</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Incluimos los archivos CSS de Bootstrap -->
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
</head>
<body>
    <div class="container">
        <h1>Ejemplo de AJAX con JSP y Servlets</h1>
        <button id="btnCargarDatos" class="btn btn-primary">Cargar datos desde el servidor</button>
        <br><br>
        <div id="resultado"></div>
    </div>
    <!-- Incluimos los archivos JavaScript de jQuery y Bootstrap -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
    <script>
        $(document).ready(function() {
            $("#btnCargarDatos").click(function() {
                // Hacemos una petición AJAX al servlet
                $.ajax({
                    url: "cargarDatos",
                    method: "GET",
                    dataType: "json",
                    success: function(response) {
                        // Limpiamos el div resultado
                        $("#resultado").empty();
                        // Recorremos la colección recibida del servlet
                        $.each(response, function(index, item) {
                            // Creamos un nuevo card con la información de cada objeto de la colección
                            var card = $("<div>").addClass("card");
                            var cardBody = $("<div>").addClass("card-body");
                            var cardTitle = $("<h5>").addClass("card-title").text(item.nombre);
                            var cardText = $("<p>").addClass("card-text").text(item.descripcion);
                            cardBody.append(cardTitle);
                            cardBody.append(cardText);
                            card.append(cardBody);
                            // Añadimos el card al div resultado
                            $("#resultado").append(card);
                        });
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
