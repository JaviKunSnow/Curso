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

import curso.java.tienda.dao.ArticuloDAO;
import curso.java.tienda.model.Articulo;
import curso.java.tienda.service.ArticuloService;

/**
 * Servlet implementation class carritoServlet
 */
@WebServlet("/carrito")
public class CarritoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	int contadorCarrito = 0;
	private ArticuloService articuloService;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CarritoServlet() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void init() {
		articuloService = new ArticuloService();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("id"));
		
		Articulo articulo = new Articulo();
		articulo = articuloService.get(id);
		
		request.setAttribute("articulo", articulo);
		
		request.getRequestDispatcher("/view/ProductView.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();

		HttpSession sesion = request.getSession();
		HashMap<Integer, Articulo> carrito = (HashMap<Integer, Articulo>) session.getAttribute("carrito");
		Integer contador = 0;
		Integer contadorCarrito = 0;
		if(carrito == null) {
			carrito = new HashMap();
		}
		
		int id = Integer.parseInt(request.getParameter("id"));


		if (carrito.containsKey(id)) {
			Articulo articulo = carrito.get(id);
			articulo.setCantidad(articulo.getCantidad() + 1);
			carrito.replace(id, articulo);
		} else {
			Articulo articulo = articuloService.get(id);
			articulo.setCantidad(1);
			carrito.put(id, articulo);
		}
		
		sesion.setAttribute("carrito", carrito);

		request.getRequestDispatcher("").forward(request, response);
	}

}
