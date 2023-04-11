package controlador;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.articuloDAO;

/**
 * Servlet implementation class carritoServlet
 */
@WebServlet("/carrito")
public class carritoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	int contadorCarrito = 0;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public carritoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
        articuloDAO articuloDAO = new articuloDAO();
        
		HttpSession sesion = request.getSession();
		HashMap <Integer, Integer> carrito = new HashMap<>();
		
		String id = request.getParameter("id");
		Integer idparse = Integer.parseInt(id);
		
		if(sesion.getAttribute("carrito") != null) {
			carrito = (HashMap) sesion.getAttribute("carrito");
		}
		
		if(carrito.containsKey(idparse)) {
			carrito.replace(idparse, carrito.get(idparse) + 1);
		} else {
			carrito.put(idparse, 1);
		}
		
		if(sesion.getAttribute("carritoContador") != null) {
			sesion.setAttribute("carritoContador", contadorCarrito++);
		} else {
			sesion.setAttribute("carritoContador", 1);
		}
		
		sesion.setAttribute("carrito", carrito);
		
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

}
 