package curso.java.tienda.service;

import java.util.List;

import curso.java.tienda.dao.DetallePedidoDAO;
import curso.java.tienda.model.DetallePedido;

public class DetallePedidoService {

	private DetallePedidoDAO detallePedidoDAO;
	
	public DetallePedidoService() {
		detallePedidoDAO = new DetallePedidoDAO();
	}
	
	public void insert(DetallePedido detalle) {
		detallePedidoDAO.insert(detalle);
	}
	
	public List<DetallePedido> getByIdPedido(int id) {
		return detallePedidoDAO.getByIdPedido(id);
	}
}
