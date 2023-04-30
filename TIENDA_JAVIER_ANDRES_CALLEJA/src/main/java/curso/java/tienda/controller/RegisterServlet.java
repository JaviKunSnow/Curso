package curso.java.tienda.controller;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jasypt.util.password.StrongPasswordEncryptor;

import curso.java.tienda.config.PropiedadesLog;
import curso.java.tienda.dao.UsuarioDAO;
import curso.java.tienda.model.Usuario;
import curso.java.tienda.service.UserService;

/**
 * Servlet implementation class registerServlet
 */
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserService userService;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
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
		// TODO Auto-generated method stub
		request.getRequestDispatcher("/view/registro.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		boolean validado = true;
		
		String email = request.getParameter("usuario");
		String pass1 = request.getParameter("pass1");
		String pass2 = request.getParameter("pass2");
		String nombre = request.getParameter("nombre");
		String apellidos = request.getParameter("apellidos");
		
		StrongPasswordEncryptor encryptor = new StrongPasswordEncryptor();
		String passwordCifrada = encryptor.encryptPassword(pass1);
		
		Enumeration <?> nombres = request.getParameterNames();
		PropiedadesLog propiedades = new PropiedadesLog();
		
		while(nombres.hasMoreElements()) {
			
			String parametro = (String) nombres.nextElement();
			
			if(request.getParameter(parametro).isEmpty()) {
				request.setAttribute("error".concat(parametro), "El parametro " + parametro + " esta vacio.");
				if(validado) {
					validado = false;
				}
			}
			
		}
		
		if(validado) {
			if(email.contains("@")) {
				if( pass1.equals(pass2)) {
					if(userService.insertUser(passwordCifrada, email, nombre, apellidos)) {
						propiedades.registerAccess(email);
						request.getRequestDispatcher("/view/login.jsp").forward(request, response);
					}
				} else {
					request.setAttribute("error".concat(pass2), "la contrase�a no coincide.");
					request.getRequestDispatcher("/view/register.jsp").forward(request, response);
				}
			} else {
				request.setAttribute("error".concat(email), "El " + email + " no es correcto.");
				request.getRequestDispatcher("/view/register.jsp").forward(request, response);
			}
		}
		
	}

}
