package curso.java.tienda.service;

import curso.java.tienda.dao.ConfiguracionDAO;
import curso.java.tienda.model.Configuracion;

public class ConfiguracionService {

	ConfiguracionDAO configDAO;
	
	public int create(Configuracion config) {
		return configDAO.create(config);
	}
	
	public Configuracion get(int id) {
		return configDAO.get(id);
	}
	
}
