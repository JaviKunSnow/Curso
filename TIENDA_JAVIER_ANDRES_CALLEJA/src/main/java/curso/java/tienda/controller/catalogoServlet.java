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

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import curso.java.tienda.dao.articuloDAO;
import curso.java.tienda.model.articulo;

/**
 * Servlet implementation class catalogoServlet
 */
@WebServlet("")
public class catalogoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    articuloDAO articuloDAO;   
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public catalogoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public void init() {
    	articuloDAO = new articuloDAO();
    	
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List <articulo> catalogo = articuloDAO.obtenerCatalogo();
		ObjectMapper mapper = new ObjectMapper();
		
		if(request.getSession(false) == null) {
			request.getSession();
			request.getSession().setAttribute("carrito", new HashMap<Integer, articulo>());
		} 
		
		request.setAttribute("catalogo", catalogo);
		
		request.getRequestDispatcher("/view/index.jsp").forward(request, response);
	
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
