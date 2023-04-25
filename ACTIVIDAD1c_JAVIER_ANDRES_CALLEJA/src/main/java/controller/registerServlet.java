package controller;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jasypt.util.password.StrongPasswordEncryptor;

import dao.UsuarioDAO;
import model.Usuario;
import config.PropiedadesLog;

/**
 * Servlet implementation class registerServlet
 */
@WebServlet("/registro")
public class registerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public registerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("register.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		boolean validado = true;
		
		String email = request.getParameter("user");
		String pass1 = request.getParameter("pass1");
		String pass2 = request.getParameter("pass2");
		
		StrongPasswordEncryptor encryptor = new StrongPasswordEncryptor();
		String passwordCifrada = encryptor.encryptPassword(pass1);
		
		Enumeration <?> nombres = request.getParameterNames();
		UsuarioDAO UsuarioDAO = new UsuarioDAO();
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
					
					Usuario usuario = new Usuario(email, passwordCifrada);
					
					if(UsuarioDAO.insert(usuario)) {
						propiedades.registerAccess(email);
						request.getRequestDispatcher("login.jsp").forward(request, response);
					}
				} else {
					request.setAttribute("error".concat(pass2), "la contraseña no coincide.");
				}
			} else {
				request.setAttribute("error".concat(email), "El " + email + " no es correcto.");
			}
		}
		
		
		
	}

}
