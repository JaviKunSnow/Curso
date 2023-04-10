package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import config.Conexion;
import modelo.articulo;

public class articuloDAO {

	private static Connection conexion;
	
	public List<articulo> obtenerCatalogo() {
		
		conexion = Conexion.getConexion();
		
		List<articulo> catalogo = new ArrayList<>();
		try {
			Statement statement = conexion.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM productos");
			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String nombre = resultSet.getString("nombre");
				String descripcion = resultSet.getString("descripcion");
				double precio = resultSet.getDouble("precio");
				String imagen = resultSet.getString("imagen");
				articulo articulo = new articulo(id, nombre, descripcion, precio, imagen);
				catalogo.add(articulo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return catalogo;
	}
}
