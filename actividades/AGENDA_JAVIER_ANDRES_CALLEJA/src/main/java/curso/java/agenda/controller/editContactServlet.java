package curso.java.agenda.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import curso.java.agenda.modelo.contacto;

/**
 * Servlet implementation class editContactServlet
 */
@WebServlet("/editContactServlet")
public class editContactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public editContactServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HashMap <Integer, contacto> contactos = new HashMap<Integer, contacto>();
		contactos = (HashMap<Integer, contacto>) request.getSession().getAttribute("contactos");
		
		int id = Integer.parseInt(request.getParameter("id"));
		boolean editar = true;
		contacto contacto = contactos.get(id);
		
		request.setAttribute("contacto", contacto);
		request.setAttribute("id", id);
		request.setAttribute("editar", editar);
		request.getRequestDispatcher("").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		boolean compNombre = false;
		boolean compApellido = false;
		boolean comprobarMail = false;
		
		HashMap<Integer, contacto> contactos = (HashMap<Integer, contacto>) request.getSession().getAttribute("contactos");

		
		String nombre = request.getParameter("nombre");
		String apellidos = request.getParameter("apellidos");
		String email = request.getParameter("email");
		String telefono = request.getParameter("telefono");
		int id = Integer.parseInt(request.getParameter("id"));
		
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
		
		
		if(compNombre && compApellido && !comprobarMail) {
			contacto contacto = new contacto(id, nombre, apellidos, email, Integer.parseInt(telefono));
			contactos.replace(id, contacto);
		} 
		
		request.getRequestDispatcher("").forward(request, response);
		
	}

}
