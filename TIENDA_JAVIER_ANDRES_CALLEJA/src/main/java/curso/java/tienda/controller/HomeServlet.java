package curso.java.tienda.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import curso.java.tienda.dao.CategoriasDAO;
import curso.java.tienda.dao.ArticuloDAO;
import curso.java.tienda.model.Articulo;
import curso.java.tienda.model.Categorias;
import curso.java.tienda.service.ArticuloService;
import curso.java.tienda.service.CategoriaService;

/**
 * Servlet implementation class HomeServlet
 */
@WebServlet("/HomeServlet")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	 private ArticuloService articuloService; 
	 private CategoriaService categoriaService;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    public void init() {
    	articuloService = new ArticuloService();
    	categoriaService = new CategoriaService();
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ArticuloDAO articuloDAO = new ArticuloDAO();
		
		boolean filtrado  = false;
		String comprados = request.getParameter("comprados");
		int categoria = Integer.parseInt(request.getParameter("categorias"));
		int precioMin = Integer.parseInt(request.getParameter("price-min"));
		int precioMax = Integer.parseInt(request.getParameter("price-max"));
		
		System.out.println(comprados);
		
		List<Categorias> categorias = categoriaService.getAll();
		request.setAttribute("categorias", categorias);
		
		StringBuilder consulta = new StringBuilder("SELECT * FROM producto");
		
		if(precioMax != 0 && precioMin < precioMax) {
			consulta.append(" WHERE precio BETWEEN " + precioMin + " AND " + precioMax);
			filtrado = true;
		}
		
		if(categoria != 0) {
			if(consulta.toString().contains("WHERE")) {
				consulta.append(" AND categoria_id = " + categoria);
			} else {
				consulta.append(" WHERE categoria_id = " + categoria);
			}
			filtrado = true;
		}
		
		if(comprados != null) {
			consulta.append(" ORDER BY (SELECT SUM(unidades) FROM detalle WHERE producto_id = producto.id) DESC");
			filtrado = true;
		}
		
		if(filtrado) {
			List<Articulo> catalogo = articuloService.getFilter(consulta.toString());
			request.setAttribute("catalogo", catalogo);
			request.getRequestDispatcher("view/index.jsp").forward(request, response);
		} else {
			request.getRequestDispatcher("").forward(request, response);
		}
	}

}
