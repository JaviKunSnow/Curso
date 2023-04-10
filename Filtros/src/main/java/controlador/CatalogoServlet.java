package controlador;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ArticuloDAO;
import modelo.Articulo;

//Controlador que se encarga de recuperar la lista de artículos desde la base de datos y mostrarlos en la vista
@WebServlet("")
public class CatalogoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ArticuloDAO articuloDAO;

	public void init() {
		articuloDAO = new ArticuloDAO();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		List<Articulo> catalogo = articuloDAO.obtenerCatalogo();
		request.setAttribute("catalogo", catalogo);
		
		if (request.getSession(false) == null) {
			request.getSession();
			request.getSession().setAttribute("carrito", new HashMap<Integer, Articulo>() );
		}
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}