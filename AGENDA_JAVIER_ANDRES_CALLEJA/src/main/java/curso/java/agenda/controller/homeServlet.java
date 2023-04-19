package curso.java.agenda.controller;

import java.io.IOException;
import java.net.URLDecoder;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import curso.java.agenda.modelo.contacto;

/**
 * Servlet implementation class homeServlet
 */
@WebServlet("")
public class homeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public homeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		ObjectMapper mapper = new ObjectMapper();
		
		Cookie[] cookies = request.getCookies();
		
		if(cookies != null) {
			for(int i = 0; i < cookies.length; i++) {
				if(cookies[i].getName().equals("contactos")) {
					try {
						String json = cookies[i].getValue();
						String urldecode = URLDecoder.decode(json,"UTF-8");
						System.out.println("guarda cookie carrito en la nueva sesion");
						System.out.println(urldecode);
						TypeReference<HashMap<Integer, contacto>> typeRef = new TypeReference<HashMap<Integer, contacto>>() {};
						HashMap <Integer, contacto> contactos = mapper.readValue(urldecode, typeRef);
						
						
						request.getSession().setAttribute("contactos", contactos);
						
					} catch (JsonProcessingException e) {
						e.printStackTrace();
					}
					
				}
			}
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
