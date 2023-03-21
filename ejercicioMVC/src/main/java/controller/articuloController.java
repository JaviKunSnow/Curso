package controller;

import java.util.List;

import dao.articuloDao;
import model.modelArticulo;

public class articuloController {

	public static void main(String[] args) {
		
		List <modelArticulo> articulos = articuloDao.filtrarArticulo();
		
	}
}
