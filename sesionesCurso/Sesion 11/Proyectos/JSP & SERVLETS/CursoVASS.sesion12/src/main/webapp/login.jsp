<html>

<head>

<script>

function validar() {
    //obteniendo el valor que se puso en campo text del formulario
    miCampoTexto = document.getElementById("miCampo").value;
    //la condición
    if (miCampoTexto.length == 0) {
    	alert("no se puede dejar vacio el campo nombre");
    	document.getElementById("mensaje").style.display = "block";
        return false;
    }    
    return true;
}


</script>


</head>


<body>
<h2>INTRODUCE TUS DATOS</h2>
<form action="Login" onsubmit="return validar()">
    <input type="text" id="miCampo" name="miCampo"><br>
    <input type="submit" value="Enviar">
    <div id="mensaje" style="color:red; display:none">El formulario no puede estar vacio</div>
</form>
</body>
</html>
