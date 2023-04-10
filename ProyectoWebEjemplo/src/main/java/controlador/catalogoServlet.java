package controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.articuloDAO;
import modelo.articulo;

/**
 * Servlet implementation class catalogoServlet
 */
//@WebServlet("")
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

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List <articulo> catalogo = articuloDAO.obtenerCatalogo();
		
		if(request.getSession(false) == null) {
			request.getSession();
			request.getSession().setAttribute("catalogo", catalogo);
		} else {
			request.getSession().setAttribute("catalogo", catalogo);
		}
		
		request.getRequestDispatcher("index.jsp").forward(request, response);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
