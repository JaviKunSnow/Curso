package curso.java.agenda.controller;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map.Entry;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import curso.java.agenda.modelo.contacto;

/**
 * Servlet implementation class addContactServlet
 */
@WebServlet("/addContactServlet")
public class addContactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addContactServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		boolean compNombre = false;
		boolean compApellido = false;
		boolean comprobarMail = false;
		int contador = 0;
		HashMap <Integer, contacto> contactos = new HashMap<Integer, contacto>();;
		ObjectMapper mapper = new ObjectMapper();
		
		
		if(request.getSession().getAttribute("contactos") != null) {
			contactos = (HashMap<Integer, contacto>) request.getSession().getAttribute("contactos");
		}
		
		String nombre = request.getParameter("nombre");
		String apellidos = request.getParameter("apellidos");
		String email = request.getParameter("email");
		String telefono = request.getParameter("telefono");
		
		if(!nombre.isEmpty()) {
			compNombre = true;
		} else {
			String error = "el nombre no tiene que estar vacio.";
			request.setAttribute("errorNombre", error);
		}
		
		
		if(!apellidos.isEmpty()) {
			compApellido = true;
		} else {
			String error = "Los apellidos no tiene que estar vacio.";
			request.setAttribute("errorApellidos", error);
		}
		
		if(!email.isEmpty() && email.contains("@")) {
			
		} else {
			String error = "El email esta vacio o es incorrecto.";
			request.setAttribute("errorMail", error);
		}
		
		if(contactos != null) {
			for(Entry<Integer, contacto> contacto : contactos.entrySet()) {
				if(contacto.getValue().getEmail().equalsIgnoreCase(email)) {
					String error = "El email ya esta en uso.";
					request.setAttribute("errorMail", error);
					comprobarMail = true;
				}
			}
		}
		
		if(compNombre && compApellido && !comprobarMail) {
			if(contactos.size() != 0) {
				contador = contactos.size();
			}
			contacto contacto = new contacto(++contador, nombre, apellidos, email, Integer.parseInt(telefono));
			contactos.put(contacto.getId(), contacto);
			
		}
		
		Cookie[] cookies = request.getCookies();
		
		for(int i = 0; i < cookies.length; i++) {
			
			if(cookies[i].getName().equals("contactos")) {
				try {
					String json = mapper.writeValueAsString(contactos);
					String url = URLEncoder.encode(json, "UTF-8");
					System.out.println("entra viejo contactos");
					System.out.println(url);
					cookies[i].setValue(url);
					
				} catch (JsonProcessingException e) {
					e.printStackTrace();
				}
				
			} else {
				try {
					String json = mapper.writeValueAsString(contactos);
					String url = URLEncoder.encode(json, "UTF-8");
					Cookie cookie = new Cookie("contactos", url);
					cookie.setMaxAge(1000);
					response.addCookie(cookie);
					System.out.println("entra nuevo cookie contactos");
					
				} catch (JsonProcessingException e) {
					e.printStackTrace();
				}
			}
		}
		
		request.getSession().setAttribute("contactos", contactos);
		
		request.getRequestDispatcher("").forward(request, response);
		
	}

}
