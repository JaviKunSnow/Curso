package curso.java.tienda.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import curso.java.tienda.config.EnviarEmail;

/**
 * Servlet implementation class ContactoServlet
 */
@WebServlet("/Contacto")
public class ContactoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    EnviarEmail mail;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContactoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public void init() {
    	mail = new EnviarEmail();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("/view/contacto.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String asunto = request.getParameter("asunto");
		String mensaje = request.getParameter("mensaje");
		
		mail.enviarMail(asunto, mensaje);
		
		request.getRequestDispatcher("").forward(request, response);
		
	}

}
