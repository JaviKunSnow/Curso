package curso.java.tienda.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class EjmploServlet
 */

@WebServlet("/ejemplo")
public class EjmploServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EjmploServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String parametro = request.getParameter("nombreParametro");
		String parametro2 = request.getParameter("nombreParametro2");
		
		System.out.println(parametro2 + "  " + parametro) ;
		
}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String parametro = request.getParameter("usuario");
		String parametro2 = request.getParameter("password");
		
		System.out.println(parametro2 + "  " + parametro) ;
		
		// validaciones
		
		// acceso a datos
		
		
		// sesion
		
		HttpSession sesion = request.getSession();
		
		sesion.setAttribute("usuario", parametro);
		
		sesion.setAttribute("password", parametro2);
		
		
		// mandar a respuesta
		
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

}