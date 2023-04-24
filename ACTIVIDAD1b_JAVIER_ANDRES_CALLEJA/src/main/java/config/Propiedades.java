package config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class Propiedades {
	
	public static List<String> recogerDatosBD() {
		
		String fichero = "./src/ficheros/bbdd.properties";
		List <String> propiedadesBD = new ArrayList<>();
		Properties properties = new Properties();
		
		try {
			properties.load(new FileInputStream(fichero));
		} catch(IOException ex) {
			
		}
		
		String paramNombre = properties.getProperty("bd.nombre");
		String paramLogin = properties.getProperty("bd.login");
		String paramPass = properties.getProperty("bd.pass");
		String paramHost = properties.getProperty("bd.host");
		
		propiedadesBD.add(paramNombre);
		propiedadesBD.add(paramLogin);
		propiedadesBD.add(paramPass);
		propiedadesBD.add(paramHost);
		
		return propiedadesBD;
	}
	
}
