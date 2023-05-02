package curso.java.tienda.service;

import java.util.List;

import curso.java.tienda.dao.PedidoDAO;
import curso.java.tienda.model.Pedido;

public class PedidoService {

	private PedidoDAO pedidoDAO;
	
	public PedidoService() {
		pedidoDAO = new PedidoDAO();
	}
	
	public int insert(int idUser, String metodoPago) {
		return pedidoDAO.insert(idUser, metodoPago);
	}
	
	public Pedido get(int id) {
		return pedidoDAO.get(id);
	}
	
	public List<Pedido> getAll() {
		return pedidoDAO.getAll();
	}
	
	public List<Pedido> getAllByUser(int idUsuario) {
		return pedidoDAO.getAllByUser(idUsuario);
	}
	
	public List<Pedido> getByDate(String fechaComp,int idUsuario) {
		return pedidoDAO.getByDate(fechaComp, idUsuario);
	}
	
	public void update(Pedido pedido) {
		pedidoDAO.update(pedido);
	}
	
}
