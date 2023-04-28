package curso.java.tienda.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import curso.java.tienda.dao.UsuarioDAO;
import curso.java.tienda.model.Usuario;

/**
 * Servlet implementation class perfilServlet
 */
@WebServlet("/perfil")
public class perfilServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public perfilServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getSession().getAttribute("usuario") == null) {
			request.setAttribute("perfil", "perfil");
			request.getRequestDispatcher("/view/login.jsp").forward(request, response);
		} else {
			request.getRequestDispatcher("/view/perfil.jsp").forward(request, response);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		boolean validado = false;
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		
		String nombre = request.getParameter("nombre");
		String apellidos = request.getParameter("apellidos");
		
		if(!nombre.isEmpty()) {
			if(!apellidos.isEmpty()) {
				validado = true;
			}
		}
		
		if(validado) {
			Usuario usuario = (Usuario) request.getSession().getAttribute("usuario");
			
			usuario.setNombre(nombre);
			usuario.setApellidos(apellidos);
			usuarioDAO.update(usuario);
			
			request.getRequestDispatcher("").forward(request, response);
			
		} else {
			request.getRequestDispatcher("/view/perfil.jsp").forward(request, response);
		}
		
	}

}
