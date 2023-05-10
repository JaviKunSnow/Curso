package controller;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import config.PropiedadesLog;
import dao.UsuarioDAO;
import model.Usuario;

/**
 * Servlet implementation class loginServlet
 */
@WebServlet("/login")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("login.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		boolean validado = true;
		String email = request.getParameter("user");
		String pass1 = request.getParameter("pass1");
		
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
					if(UsuarioDAO.findByEmail(email, pass1)) {
						propiedades.loginAccess(email);
						request.getRequestDispatcher("logeado.jsp").forward(request, response);
					}
			} else {
				request.setAttribute("error".concat(email), "El " + email + " no es correcto.");
				request.getRequestDispatcher("register.jsp").forward(request, response);
			}
		}
		
		
	}

}
