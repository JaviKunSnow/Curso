package controlador;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.ArticuloDAO;
import modelo.Articulo;

@WebServlet("/agregar")
public class AgregarArticuloServlet extends HttpServlet {

    /**
	 * 
	 */
	private static final long serialVersionUID = -3794898853696467410L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        ArticuloDAO articuloDAO = new ArticuloDAO();

        // Obtenemos los parámetros del formulario
        int id = Integer.parseInt(request.getParameter("id"));
        int cantidad = Integer.parseInt(request.getParameter("cantidad"));

        // Obtenemos el artículo correspondiente a partir del ID
        Articulo articulo = null;
		try {
			articulo = articuloDAO.obtenerArticulo(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        // Obtenemos el carrito de la sesión o lo creamos si no existe
        HashMap<Integer, Articulo> carrito = (HashMap<Integer, Articulo>) session.getAttribute("carrito");
        if (carrito == null) {
            carrito = new HashMap<>();
            session.setAttribute("carrito", carrito);
        }

        // Agregamos el artículo al carrito o actualizamos su cantidad
        if (carrito.containsKey(id)) {
            Articulo articuloExistente = carrito.get(id);
            articuloExistente.setCantidad(articuloExistente.getCantidad() + cantidad);
        } else {
            articulo.setCantidad(cantidad);
            carrito.put(id, articulo);
        }
        
        request.getSession().setAttribute("carrito", carrito);

        // Redireccionamos a la página de visualización del carrito
        request.getRequestDispatcher("").forward(request, response);
    	   }
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

}
