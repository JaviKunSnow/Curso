package curso.java.tienda.service;

import java.util.List;

import curso.java.tienda.dao.ArticuloDAO;
import curso.java.tienda.model.Articulo;

public class ArticuloService {

	private ArticuloDAO articuloDAO;
	
	public ArticuloService() {
		articuloDAO = new ArticuloDAO();
	}
	
	public List<Articulo> getAll() {
		return articuloDAO.getAll();
	}
	
	public Articulo get(int id) {
		return articuloDAO.get(id);
	}
	
	public void update(Articulo articulo) {
		articuloDAO.update(articulo);
	}
	
	public List<Articulo> getFilter(String consulta) {
		return articuloDAO.getFilter(consulta);
	}
}
