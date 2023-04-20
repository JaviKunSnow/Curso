package curso.java.tienda.controller;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import curso.java.tienda.dao.UsuarioDAO;
import curso.java.tienda.model.Usuario;

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
		request.getRequestDispatcher("/view/login.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		boolean validado = true;
		Enumeration <?> nombres = request.getParameterNames();
		UsuarioDAO UsuarioDAO = new UsuarioDAO();
		
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
			if(!UsuarioDAO.validarUsuario(request.getParameter("usuario"), request.getParameter("password"))) {
				request.setAttribute("errorusuario", "el usuario es incorrecto.");
				request.setAttribute("errorpassword", "la contraseña es incorrecta.");
				request.getRequestDispatcher("/view/login.jsp").forward(request, response);
			} else {
				Usuario usuario = UsuarioDAO.recogerUsuarioPorEmail(request.getParameter("usuario"));
				request.getSession().setAttribute("usuario", usuario);
				if(request.getSession().getAttribute("comprando") != null) {
					request.getRequestDispatcher("/view/carrito.jsp").forward(request, response);
				} else if(request.getSession().getAttribute("perfil") != null) {
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
