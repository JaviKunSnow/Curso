package curso.java.tienda.controller;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import curso.java.tienda.config.PropiedadesLog;
import curso.java.tienda.dao.UsuarioDAO;
import curso.java.tienda.model.Usuario;
import curso.java.tienda.service.ArticuloService;
import curso.java.tienda.service.CategoriaService;
import curso.java.tienda.service.UserService;

/**
 * Servlet implementation class loginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	UserService userService;
	private PropiedadesLog propiedades;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    public void init() {
    	userService = new UserService();
    	propiedades = new PropiedadesLog();
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/view/login.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		boolean validado = true;
		Enumeration <?> nombres = request.getParameterNames();
		
		String usuarioNombre = request.getParameter("usuario");
		String password = request.getParameter("password");
		
		while(nombres.hasMoreElements()) {
			
			String parametro = (String) nombres.nextElement();
			
			
			if(request.getParameter(parametro).isEmpty()) {
				request.setAttribute("error".concat(parametro), "El parametro " + parametro + " esta vacio.");
				if(validado) {
					validado = false;
				}
			}
			
		}
		
		if(!validado) {
			request.getRequestDispatcher("/view/login.jsp").forward(request, response);
		} else {
			Usuario usuario = userService.login(usuarioNombre, password);
			if(usuario == null) {
				request.setAttribute("errorusuario", "el usuario es incorrecto.");
				request.setAttribute("errorpassword", "la contraseña es incorrecta.");
				request.getRequestDispatcher("/view/login.jsp").forward(request, response);
			} else {
				propiedades.loginAccess(usuarioNombre);
				request.getSession().setAttribute("usuario", usuario);
				if(request.getParameter("comprando") != null) {
					request.getRequestDispatcher("/view/carrito.jsp").forward(request, response);
				} else if(request.getParameter("perfil") != null) {
					request.getRequestDispatcher("/view/perfil.jsp").forward(request, response);
				} else {
					request.getRequestDispatcher("").forward(request, response);
				}
			}
		}
		}
	{
	}

}
