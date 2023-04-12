package controlador;

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

import dao.articuloDAO;
import modelo.articulo;

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
		
		Cookie[] cookies = request.getCookies();
		
		for(int i = 0; i < cookies.length; i++) {
			if(cookies[i].getName().equals("carrito")) {
				try {
					String json = cookies[i].getValue();
					String urldecode = URLDecoder.decode(json,"UTF-8");
					HashMap <Integer, articulo> carrito = mapper.readValue(urldecode, HashMap.class);
					
					System.out.println("guarda cookie carrito en la nueva sesion");
					System.out.println(urldecode);
					
					request.getSession().setAttribute("carrito", carrito);
					
				} catch (JsonProcessingException e) {
					e.printStackTrace();
				}
				
			} else if(cookies[i].getName().equals("carritoContador")) {
				String json = cookies[i].getValue();
				String urldecode = URLDecoder.decode(json,"UTF-8");
				int contador = mapper.readValue(urldecode, Integer.class);
				
				System.out.println("guarda cookie carrito en la nueva sesion");
				System.out.println(contador);
				
				request.getSession().setAttribute("carritoContador", String.valueOf(contador));
			}
		}
		
		request.setAttribute("catalogo", catalogo);
		
		request.getRequestDispatcher("index.jsp").forward(request, response);
	
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
