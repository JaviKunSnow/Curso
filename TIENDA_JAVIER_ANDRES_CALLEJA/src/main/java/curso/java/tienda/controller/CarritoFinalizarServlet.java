package curso.java.tienda.controller;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map.Entry;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import curso.java.tienda.dao.DetallePedidoDAO;
import curso.java.tienda.dao.PedidoDAO;
import curso.java.tienda.dao.ArticuloDAO;
import curso.java.tienda.model.Articulo;
import curso.java.tienda.model.DetallePedido;
import curso.java.tienda.model.Pedido;
import curso.java.tienda.model.Usuario;
import curso.java.tienda.service.ArticuloService;
import curso.java.tienda.service.DetallePedidoService;
import curso.java.tienda.service.PedidoService;

/**
 * Servlet implementation class carritoFinalizarServlet
 */
@WebServlet("/carritoFinal")
public class CarritoFinalizarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private ArticuloService articuloService;
	private DetallePedidoService detalleService;
	private PedidoService pedidoService;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CarritoFinalizarServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    public void init() {
		articuloService = new ArticuloService();
		detalleService = new DetallePedidoService();
		pedidoService = new PedidoService();
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Double total = new Double(0);
		DecimalFormat df = new DecimalFormat("#.##");
		HashMap <Integer, Articulo> carrito = new HashMap<Integer, Articulo>();
		carrito = (HashMap<Integer, Articulo>) request.getSession().getAttribute("carrito");
		
		for(Entry<Integer, Articulo> entry : carrito.entrySet()) {
			Articulo articulo = entry.getValue();
			
			total += (articulo.getPrecio() * articulo.getImpuesto()) + (articulo.getCantidad() * articulo.getPrecio());
		}
		
		String result = df.format(total);
		result = result.replace(",", ".");
		Double totalParseado = Double.parseDouble(result);
		
		request.setAttribute("total", totalParseado);

		request.getRequestDispatcher("/view/carrito.jsp").forward(request, response);

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if(request.getSession().getAttribute("usuario") == null) {
			request.setAttribute("comprando", "comprando");
			request.getRequestDispatcher("/view/login.jsp").forward(request, response);
		} else {
			Usuario usuario = (Usuario) request.getSession().getAttribute("usuario");
			String metodoPago = request.getParameter("pago");
			Double totalFactura = new Double(0);
			
			HashMap <Integer, Articulo> carrito = new HashMap<Integer, Articulo>();
			carrito = (HashMap<Integer, Articulo>) request.getSession().getAttribute("carrito");
			
			int numPedido = pedidoService.insert(usuario.getId(), metodoPago);
			
			if(numPedido != 0) {
				for(Entry<Integer, Articulo> entry : carrito.entrySet()) {
					Articulo articulo = entry.getValue();
					
					if(articulo.getCantidad() > articulo.getStock()) {
						articulo.setCantidad(articulo.getStock());
					} 
					
					articulo.setStock(articulo.getStock() - articulo.getCantidad());
					
					Double total = (articulo.getPrecio() * articulo.getImpuesto()) + (articulo.getCantidad() * articulo.getPrecio());
					totalFactura += total;
					
					DetallePedido detalle = new DetallePedido(0, numPedido, articulo.getId(), articulo.getCantidad(), articulo.getPrecio(), articulo.getImpuesto(), total);
					
					detalleService.insert(detalle);
					
					articuloService.update(articulo);
					
				}
				
				Pedido pedido = pedidoService.get(numPedido);
				
				pedido.setTotal(totalFactura);
				
				pedidoService.update(pedido);
				
				request.getSession().setAttribute("carrito", new HashMap<Integer, Articulo>());
				request.getRequestDispatcher("/view/compraRealizada.jsp").forward(request, response);
			} else {	
				request.getRequestDispatcher("").forward(request, response);
			}
			
			
		}
		
		
		
	}

}
