package curso.java.tienda.service;

import java.util.List;

import curso.java.tienda.dao.CategoriasDAO;
import curso.java.tienda.model.Categorias;

public class CategoriaService {

	private CategoriasDAO categoriasDAO;
	
	public CategoriaService() {
		categoriasDAO = new CategoriasDAO();
	}
	
	public List<Categorias> getAll() {
		return categoriasDAO.get();
	}
}
