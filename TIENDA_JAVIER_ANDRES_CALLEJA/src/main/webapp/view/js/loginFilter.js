$(document).ready(function() {
  $("#enviar").click(function() {

    var usuario = $("#usuario").val();
    var password = $("#password").val();
    
    if (usuario.trim() == "" || usuario.indexOf("@") == -1) {
      alert("El campo usuario esta vacio o no es correcto");
      return false;
    }
    
    if (password.trim() == "") {
      alert("El campo contraseña esta vacio");
      return false;
    }
    
    $("form").submit();
  });
});