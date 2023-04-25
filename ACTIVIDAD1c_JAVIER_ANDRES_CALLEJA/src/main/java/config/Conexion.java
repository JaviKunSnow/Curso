package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class Conexion {
    
	static List<String> propiedades = Propiedades.recogerDatosBD();
	
	static String bd = propiedades.get(0);
	static String login = propiedades.get(1);
	static String password = propiedades.get(2);
	static String host = propiedades.get(3); //localhost
	
	static String url = "jdbc:mysql://";
	static Connection conexion; //atributo para  guardar el objeto Connection
        
    
	public static Connection getConexion() {
	   //SINGLETON
    	if (conexion == null) {
	    	crearConexion();
	    }
    	
	    return conexion;
	    
    }
    
    // devuelve true si se ha creado correctamente
    public static boolean crearConexion() {
	    try {
	        //cargo el driver
	    	
	    	
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        conexion = DriverManager.getConnection(url + host + "/"+ bd, login, password);    
                
            conexion.setAutoCommit(true);
	        
	    } catch (SQLException e) {
	    	return false;
	    }
	    catch (Exception e) {
	    	return false;
	    }
	    return true;
    }

    public static void desconectar(){
    	try {
            conexion.close();
            conexion = null;
    	
    	} catch (SQLException e) {
    		System.out.println("Error al cerrar la conexion");
        }
    }
   
}
