
import dao.ConfiguracionDAO;
import model.Configuracion;

public class Main {

	
	
	public static void main(String[] args) {
		ConfiguracionDAO configuracionDAO = new ConfiguracionDAO();
		Configuracion config = new Configuracion(0, "nombre", "paco");
		
		int id = configuracionDAO.create(config);
		
		Configuracion config2 = configuracionDAO.get(id);
		
		System.out.println(config2);
	}
}
