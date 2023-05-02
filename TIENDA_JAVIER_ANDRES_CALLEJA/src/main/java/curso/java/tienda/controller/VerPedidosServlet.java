package curso.java.tienda.controller;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import curso.java.tienda.model.Pedido;
import curso.java.tienda.model.Usuario;
import curso.java.tienda.service.PedidoService;

/**
 * Servlet implementation class verPedidosServlet
 */
@WebServlet("/verPedidosServlet")
public class VerPedidosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private PedidoService pedidoService;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VerPedidosServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public void init() {
    	pedidoService = new PedidoService();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Usuario usuario = (Usuario) request.getSession().getAttribute("usuario");
		
		List <Pedido> pedidos = pedidoService.getAllByUser(usuario.getId());
		
		request.setAttribute("pedidos", pedidos);
		
		request.getRequestDispatcher("view/pedidos.jsp").forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String fecha = request.getParameter("fecha");
		Usuario usuario = (Usuario) request.getSession().getAttribute("usuario");
		
		if(fecha != null) {
			System.out.println(fecha);
			List <Pedido> pedidos = pedidoService.getByDate(fecha, usuario.getId());
		}
		
		request.getRequestDispatcher("view/pedidos.jsp").forward(request, response);
	}

}
