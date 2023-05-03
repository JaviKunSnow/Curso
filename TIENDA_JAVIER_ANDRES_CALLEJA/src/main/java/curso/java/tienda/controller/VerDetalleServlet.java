package curso.java.tienda.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import curso.java.tienda.model.DetallePedido;
import curso.java.tienda.model.Pedido;
import curso.java.tienda.service.DetallePedidoService;

/**
 * Servlet implementation class VerDetalleServlet
 */
@WebServlet("/VerDetalleServlet")
public class VerDetalleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    DetallePedidoService detalleService;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VerDetalleServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public void init() {
    	detalleService = new DetallePedidoService();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("id"));
		
		List <DetallePedido> detalles = detalleService.getByIdPedido(id);
		
		request.setAttribute("detalles", detalles);
		request.setAttribute("id", id);
		
		request.getRequestDispatcher("view/detallePedidos.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
