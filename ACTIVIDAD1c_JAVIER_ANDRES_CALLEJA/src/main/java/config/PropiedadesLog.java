package config;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class PropiedadesLog {

	private static Logger Log = Logger.getLogger(PropiedadesLog.class);
	
	public void registerAccess(String email) {
		
		PropertyConfigurator.configure("./src/ficheros/log4j.properties");
	
		Log.info("- Usuario " + email + " se ha registrado.");
	}
	
	public void loginAccess(String email) {
		
		PropertyConfigurator.configure("./src/ficheros/log4j.properties");
		
		Log.info("- Usuario " + email + " se ha Logeado.");
	}
	
	public void LogOutAccess(String email) {
		
		PropertyConfigurator.configure("./src/ficheros/log4j.properties");
		
		Log.info("- Usuario " + email + " ha cerrado sesion.");
	}
}
