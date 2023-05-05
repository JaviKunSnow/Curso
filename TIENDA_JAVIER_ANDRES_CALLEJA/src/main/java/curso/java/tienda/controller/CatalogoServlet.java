package curso.java.tienda.controller;

import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import curso.java.tienda.config.Propiedades;
import curso.java.tienda.config.PropiedadesLog;
import curso.java.tienda.dao.CategoriasDAO;
import curso.java.tienda.dao.ArticuloDAO;
import curso.java.tienda.model.Articulo;
import curso.java.tienda.model.Categorias;
import curso.java.tienda.service.ArticuloService;
import curso.java.tienda.service.CategoriaService;

/**
 * Servlet implementation class catalogoServlet
 */
@WebServlet("")
public class CatalogoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private ArticuloService articuloService; 
    private CategoriaService categoriaService;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CatalogoServlet() {
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
		
		String ruta = request.getServletContext().getRealPath("");
		Propiedades propiedades = new Propiedades();
		PropiedadesLog proLog = new PropiedadesLog();
		
		propiedades.darRuta(ruta);
		proLog.darRuta(ruta);
		
		List <Articulo> catalogo = articuloService.getAll();
		List <Categorias> categorias = categoriaService.getAll();
		
		if(request.getSession(false) == null) {
			request.getSession();
			request.getSession().setAttribute("carrito", new HashMap<Integer, Articulo>());
		} 
		
		//System.out.println(request.getServletContext().getRealPath(""));
		
		request.setAttribute("catalogo", catalogo);
		request.setAttribute("categorias", categorias);
		
		request.getRequestDispatcher("/view/index.jsp").forward(request, response);
	
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
