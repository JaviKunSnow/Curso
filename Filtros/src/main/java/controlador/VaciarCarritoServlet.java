package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class VaciarCarritoServlet
 */
import javax.servlet.http.*;

@WebServlet("/vaciar")
public class VaciarCarritoServlet extends HttpServlet {
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(false);
        if(session != null) {
            session.removeAttribute("carrito");
        }
        
        request.getRequestDispatcher("").forward(request, response);
    }
}
