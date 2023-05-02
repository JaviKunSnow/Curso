package curso.java.tienda.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jasypt.util.password.StrongPasswordEncryptor;

import curso.java.tienda.dao.UsuarioDAO;
import curso.java.tienda.model.Usuario;
import curso.java.tienda.service.UserService;

/**
 * Servlet implementation class perfilServlet
 */
@WebServlet("/perfil")
public class ProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	UserService userService;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProfileServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    public void init() {
    	userService = new UserService();
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
		
		String nombre = request.getParameter("nombre");
		String apellidos = request.getParameter("apellidos");
		String viejaPassword = request.getParameter("viejaPassword");
		String nuevaPassword = request.getParameter("nuevaPassword");
		
		StrongPasswordEncryptor encryptor = new StrongPasswordEncryptor();
		String passwordCifrada = encryptor.encryptPassword(nuevaPassword);
		
		if(!nombre.isEmpty()) {
			if(!apellidos.isEmpty()) {
				validado = true;
			}
		}
		
		if(validado) {
			Usuario usuario = (Usuario) request.getSession().getAttribute("usuario");
			
			if(encryptor.checkPassword(viejaPassword, usuario.getClave())) {
				
				usuario.setNombre(nombre);
				usuario.setApellidos(apellidos);
				usuario.setClave(passwordCifrada);
				
				userService.update(usuario);
				
				request.getRequestDispatcher("").forward(request, response);
			} else {
				request.getRequestDispatcher("/view/perfil.jsp").forward(request, response);
			}
			
			
			
		} else {
			request.getRequestDispatcher("/view/perfil.jsp").forward(request, response);
		}
		
	}

}
