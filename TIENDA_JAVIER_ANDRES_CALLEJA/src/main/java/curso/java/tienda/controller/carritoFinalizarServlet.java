package curso.java.tienda.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import curso.java.tienda.dao.DetallePedidoDAO;
import curso.java.tienda.dao.PedidoDAO;
import curso.java.tienda.dao.articuloDAO;
import curso.java.tienda.model.Articulo;
import curso.java.tienda.model.DetallePedido;
import curso.java.tienda.model.Usuario;

/**
 * Servlet implementation class carritoFinalizarServlet
 */
@WebServlet("/carritoFinal")
public class carritoFinalizarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public carritoFinalizarServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if(request.getParameter("inicio") != null) {
			response.sendRedirect(request.getContextPath());
		} else {
			request.getRequestDispatcher("/view/carrito.jsp").forward(request, response);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if(request.getSession().getAttribute("usuario") == null) {
			request.setAttribute("comprando", "comprando");
			request.getRequestDispatcher("/view/login.jsp").forward(request, response);
		} else {
			PedidoDAO pedidoDAO = new PedidoDAO();
			DetallePedidoDAO detallePedidoDAO = new DetallePedidoDAO();
			articuloDAO articuloDAO = new articuloDAO();
			Usuario usuario = (Usuario) request.getSession().getAttribute("usuario");
			String metodoPago = request.getParameter("pago");
			
			HashMap <Integer, Articulo> carrito = new HashMap<Integer, Articulo>();
			carrito = (HashMap<Integer, Articulo>) request.getSession().getAttribute("carrito");
			
			int numPedido = pedidoDAO.insert(usuario.getId(), metodoPago);
			
			if(numPedido != 0) {
				for(Entry<Integer, Articulo> entry : carrito.entrySet()) {
					Articulo articulo = entry.getValue();
					
					if(articulo.getCantidad() > articulo.getStock()) {
						articulo.setCantidad(articulo.getStock());
					} 
					
					articulo.setStock(articulo.getStock() - articulo.getCantidad());
					
					Double total = (articulo.getPrecio() * articulo.getImpuesto()) + (articulo.getCantidad() * articulo.getPrecio());
					
					DetallePedido detalle = new DetallePedido(0, numPedido, articulo.getId(), articulo.getCantidad(), articulo.getPrecio(), articulo.getImpuesto(), total);
					
					detallePedidoDAO.insert(detalle);
					
					articuloDAO.update(articulo);
					
				}
				
				request.getSession().setAttribute("carrito", new HashMap<Integer, Articulo>());
				request.getRequestDispatcher("/view/compraRealizada.jsp").forward(request, response);
			} else {	
				request.getRequestDispatcher("").forward(request, response);
			}
			
			
		}
		
		
		
	}

}
