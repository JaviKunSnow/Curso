package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MiServlet")
public class MiServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Establecemos el tipo de contenido de la respuesta como texto plano
        response.setContentType("text/plain");
        // Escribimos la respuesta que se enviará al cliente
        response.getWriter().write("¡Hola desde el servlet!");
    }
}
