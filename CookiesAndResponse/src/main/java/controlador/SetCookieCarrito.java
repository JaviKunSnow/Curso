package controlador;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SetCookieCarrito
 */
@WebServlet("/setCookieCarrito")
public class SetCookieCarrito extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SetCookieCarrito() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtenemos la sesión del usuario
        HttpSession session = request.getSession();

        // Obtenemos el carrito de la sesión o lo creamos si no existe
        HashMap<Integer, Articulo> carrito = (HashMap<Integer, Articulo>) session.getAttribute("carrito");
        if (carrito == null) {
            carrito = new HashMap<Integer, Articulo>();
            session.setAttribute("carrito", carrito);
        }

        // Agregamos un artículo al carrito
        int idArticulo = 6;
        Articulo articulo = new Articulo();
        carrito.put(idArticulo, articulo);

        // Creamos la cookie y la agregamos a la respuesta, pasamos el carrito to string, pero eso no nos valdria
        Cookie cookie = new Cookie("carrito",carrito.toString());
        cookie.setMaxAge(60 * 60 * 24); // La cookie expira en un día
        response.addCookie(cookie);

        // Redirigimos al usuario a la página del carrito
        response.sendRedirect("confirm.jsp");
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
