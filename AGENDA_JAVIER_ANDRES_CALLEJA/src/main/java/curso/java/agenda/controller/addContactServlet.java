package curso.java.agenda.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
			request.getSession().setAttribute("errorNombre", error);
		}
		
		
		if(!apellidos.isEmpty()) {
			compApellido = true;
		} else {
			String error = "Los apellidos no tiene que estar vacio.";
			request.getSession().setAttribute("errorApellidos", error);
		}
		
		if(!email.isEmpty() && email.contains("@")) {
			
		} else {
			String error = "El email esta vacio o es incorrecto.";
			request.getSession().setAttribute("errorMail", error);
		}
		
		if(contactos != null) {
			for(Entry<Integer, contacto> contacto : contactos.entrySet()) {
				if(contacto.getValue().getEmail().equalsIgnoreCase(email)) {
					String error = "El email ya esta en uso.";
					request.getSession().setAttribute("errorMail", error);
					comprobarMail = true;
				}
			}
		}
		
		if(compNombre && compApellido && !comprobarMail) {
			contacto contacto = new contacto(nombre, apellidos, email, Integer.parseInt(telefono));
			if(contactos != null) {
				contador = contactos.size();
				contactos.put(++contador, contacto);
			} else {
				contactos.put(++contador, contacto);
			}
			
		}
		
		request.getSession().setAttribute("contactos", contactos);
		
		request.getRequestDispatcher("").forward(request, response);
		
	}

}
