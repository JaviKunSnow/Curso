package curso.java.tienda.service;

import curso.java.tienda.dao.PedidoDAO;

public class PedidoService {

	private PedidoDAO pedidoDAO;
	
	public PedidoService() {
		pedidoDAO = new PedidoDAO();
	}
	
	public int insert(int idUser, String metodoPago) {
		return pedidoDAO.insert(idUser, metodoPago);
	}
	
	
}
