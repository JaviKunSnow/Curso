package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/deleteCookie")
public class DeleteCookieServlet extends HttpServlet {

  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  
    // Obtener la cookie "username"
    Cookie[] cookies = request.getCookies();
    if (cookies != null) {
      for (Cookie cookie : cookies) {
        if (cookie.getName().equals("username") || cookie.getName().equals("carrito") || cookie.getName().equals("articulos")) {
        	System.out.println("Encontramos una cookie para borrar");
          // Eliminar la cookie
          cookie.setMaxAge(0);
          response.addCookie(cookie);
         
        }
      }
    }
    
    // Redirigir a una página de confirmación
    response.sendRedirect("cookieDeleted.jsp");
    
  }

}
