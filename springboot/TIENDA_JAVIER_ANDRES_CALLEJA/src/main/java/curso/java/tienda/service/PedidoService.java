package curso.java.tienda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import curso.java.tienda.model.Pedido;
import curso.java.tienda.repository.PedidoRepository;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository pedRepo;
	
	public List<Pedido> getAll() {
		return pedRepo.findAll();
	}
	
	public Long count() {
		return pedRepo.count();
	}
	
	public List<Pedido> getByLast() {
		return pedRepo.getByLast();
	}
	
}
