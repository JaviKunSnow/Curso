package curso.java.tienda.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import curso.java.tienda.config.Conexion;
import curso.java.tienda.model.Categorias;

public class CategoriasDAO {

	Connection con;
	
	public List<Categorias> get() {
		
		con = Conexion.getConexion();
		
		List<Categorias> categorias = new ArrayList<>();
		try {
			
			Statement statement = con.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM categorias");
			
			while (resultSet.next()) {
				
				int id = resultSet.getInt("id");
				String nombre = resultSet.getString("nombre");
				
				Categorias categoria = new Categorias(id, nombre);
				categorias.add(categoria);
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return categorias;
		
	}
}
