package controlador;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import dao.articuloDAO;
import modelo.articulo;

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
			carrito.put(id, articuloDAO.devolverArticuloId(id));
		}

		if (sesion.getAttribute("carritoContador") == null) {
			contador = cantidad;
			sesion.setAttribute("carritoContador", String.valueOf(contador));
		} else {
			String cont = (String) sesion.getAttribute("carritoContador");
			contador = Integer.parseInt(cont);
			contador = contador + cantidad;
			sesion.setAttribute("carritoContador", String.valueOf(contador));
		}

			Cookie[] cookies = request.getCookies();
			for(Cookie cookieit : cookies) {
				cookieit.setValue(getServletInfo());
			}
			for(int i = 0; i < cookies.length; i++) {
				if(cookies[i].getName().equals("carrito")) {
					try {
						String json = mapper.writeValueAsString(carrito);
						String url = URLEncoder.encode(json, "UTF-8");
						System.out.println("entra viejo");
						System.out.println(url);
						cookies[i].setValue(url);
						  //System.out.println(json);
					} catch (JsonProcessingException e) {
						e.printStackTrace();
					}
					
				} else {
					try {
						String json = mapper.writeValueAsString(carrito);
						String url = URLEncoder.encode(json, "UTF-8");
						Cookie cookie = new Cookie("carrito", url);
						cookie.setMaxAge(1000);
						response.addCookie(cookie);
						System.out.println("entra nuevo");
						  //System.out.println(json);
					} catch (JsonProcessingException e) {
						e.printStackTrace();
					}
				}
			}
		
		sesion.setAttribute("carrito", carrito);

		request.getRequestDispatcher("").forward(request, response);
	}

}
