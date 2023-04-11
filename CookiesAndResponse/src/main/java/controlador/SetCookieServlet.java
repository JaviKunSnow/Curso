package controlador;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/setCookie")
public class SetCookieServlet extends HttpServlet {

  /**
	 * 
	 */
	private static final long serialVersionUID = -3546757334995875480L;

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  
    // Obtener el nombre del usuario del parámetro del formulario
    String username = request.getParameter("username");
    
    // Crear una nueva cookie con el nombre de usuario
    Cookie cookie = new Cookie("username", username);
    
    // Establecer la duración de la cookie en segundos
    cookie.setMaxAge(3600); // 1 hora
    
    // Agregar la cookie a la respuesta
    response.addCookie(cookie);
    
    // Redirigir a una página de confirmación
    response.sendRedirect("confirm.jsp");
    
  }

}
