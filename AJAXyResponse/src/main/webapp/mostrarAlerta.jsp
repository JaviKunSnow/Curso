<!DOCTYPE html>
<html>
<head>
  <title>Ejemplo de JSP con AJAX y Bootstrap</title>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

  <div class="container-fluid">
    <div class="row">
      <div class="col-md-12">
        <h1>Ejemplo de JSP con AJAX y Bootstrap</h1>
      </div>
    </div>

    <div class="row">
      <div class="col-md-12">
        <p>Este ejemplo ejecuta una petición AJAX cada 15 segundos al servlet ControlArticulosCarrito, y muestra una alerta modal si el servidor devuelve un resultado verdadero.</p>
      </div>
    </div>

    <div class="row">
      <div class="col-md-12">
        <div id="alerta-modal" class="modal fade" tabindex="-1" role="dialog">
          <div class="modal-dialog" role="document">
            <div class="modal-content">
              <div class="modal-header">
                <h5 class="modal-title">Alerta</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                  <span aria-hidden="true">&times;</span>
                </button>
              </div>
              <div class="modal-body">
                <p></p>
              </div>
              <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Cerrar</button>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>

  </div>

  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
   <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
	  <script>
	    var mensaje = false;
	    setInterval(function() {
	        $.ajax({
	            url: "control",
	            type: "POST",
	            dataType: "json",
	            success: function(data) {
	                if(!mensaje)
	                {	                  
	                  alert(JSON.stringify(data))	                	
	                }	               
	                mensaje = true
	            },
	            error: function(xhr, status, error) {
	                console.log("Error al obtener datos del servidor");
	            }
	        });
	    }, 5000);
	</script>

	 

</body>
</html>
