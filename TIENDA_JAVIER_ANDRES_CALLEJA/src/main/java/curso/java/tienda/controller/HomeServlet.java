package curso.java.tienda.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import curso.java.tienda.dao.CategoriasDAO;
import curso.java.tienda.dao.articuloDAO;
import curso.java.tienda.model.Articulo;
import curso.java.tienda.model.Categorias;

/**
 * Servlet implementation class HomeServlet
 */
@WebServlet("/HomeServlet")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeServlet() {
        super();
        // TODO Auto-generated constructor stub
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
		
		articuloDAO articuloDAO = new articuloDAO();
		CategoriasDAO categoriasDAO = new CategoriasDAO();
		String comprados = request.getParameter("comprados");
		int categoria = Integer.parseInt(request.getParameter("categorias"));
		System.out.println(comprados);
		
		List<Categorias> categorias = categoriasDAO.get();
		request.setAttribute("categorias", categorias);
		
		if(comprados != null) {
			List <Articulo> catalogo = articuloDAO.masComprados();
			request.setAttribute("catalogo", catalogo);
			request.getRequestDispatcher("/view/index.jsp").forward(request, response);
		} else if(categoria != 0) {
			List <Articulo> catalogo = articuloDAO.findByCategoria(categoria);
			request.setAttribute("catalogo", catalogo);
			request.getRequestDispatcher("/view/index.jsp").forward(request, response);
			
		} else {
			request.getRequestDispatcher("").forward(request, response);
		}
		
		
		
	}

}
