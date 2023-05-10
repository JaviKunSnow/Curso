package curso.java.tienda.controller;

import java.io.IOException;
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
 * Servlet implementation class CancelarServlet
 */
@WebServlet("/CancelarServlet")
public class CancelarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private PedidoService pedidoService;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CancelarServlet() {
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
		
		int id = Integer.parseInt(request.getParameter("id"));
		
		Pedido pedido = pedidoService.get(id);
		
		pedido.setEstado("PC");
		
		pedidoService.update(pedido);
		
		Usuario usuario = (Usuario) request.getSession().getAttribute("usuario");
		
		List <Pedido> pedidos = pedidoService.getAllByUser(usuario.getId());
		
		request.setAttribute("pedidos", pedidos);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
