package curso.java.tienda.controller;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import curso.java.tienda.dao.articuloDAO;
import curso.java.tienda.model.articulo;

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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();
		articuloDAO articuloDAO = new articuloDAO();
		ObjectMapper mapper = new ObjectMapper();

		HttpSession sesion = request.getSession();
		HashMap<Integer, articulo> carrito = (HashMap<Integer, articulo>) session.getAttribute("carrito");
		Integer contador = 0;
		Integer contadorCarrito = 0;
		if(carrito == null) {
			carrito = new HashMap();
		}
		
		int id = Integer.parseInt(request.getParameter("id"));

		int cantidad = Integer.parseInt(request.getParameter("cantidad"));

		if (carrito.containsKey(id)) {
			articulo articulo = carrito.get(id);
			articulo.setCantidad(articulo.getCantidad() + cantidad);
			carrito.replace(id, articulo);
		} else {
			articulo articulo = articuloDAO.devolverArticuloId(id);
			articulo.setCantidad(cantidad);
			carrito.put(id, articulo);
			if (sesion.getAttribute("carritoContador") == null) {
				sesion.setAttribute("carritoContador", String.valueOf(1));
			} else {
				contadorCarrito = Integer.parseInt((String)sesion.getAttribute("carritoContador"));
				sesion.setAttribute("carritoContador", String.valueOf(++contadorCarrito));
			}
		}
		
		sesion.setAttribute("carrito", carrito);

		request.getRequestDispatcher("").forward(request, response);
	}

}
