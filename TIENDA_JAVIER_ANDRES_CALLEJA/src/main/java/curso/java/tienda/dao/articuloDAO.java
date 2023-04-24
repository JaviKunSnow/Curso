package curso.java.tienda.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import curso.java.tienda.config.Conexion;
import curso.java.tienda.model.articulo;


public class articuloDAO {

	private Connection con;
	
	public articuloDAO() {
//		try {
//			//Class.forName("com.mysql.cj.jdbc.Driver");
//			String url = "jdbc:mysql://localhost:3306/tienda";
//			String usuario = "root";
//			String contrasenia = "";
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			this.con = DriverManager.getConnection(url, usuario, contrasenia);
//		} catch (ClassNotFoundException | SQLException e) {
//			e.printStackTrace();
//		}
	}
	
	public List<articulo> obtenerCatalogo() {
		
		con = Conexion.getConexion();
		
		List<articulo> catalogo = new ArrayList<>();
		try {
			
			Statement statement = con.createStatement();
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
	
	public articulo devolverArticuloId(int id) {
		con = Conexion.getConexion();
		
		articulo articulo = new articulo(0, null, null, 0, null);
		
		try {
			PreparedStatement sentenciaSQL = con.prepareStatement("select * from productos where id = ?");
			
			sentenciaSQL.setInt(1, id);
			
			ResultSet rs = sentenciaSQL.executeQuery();
			if (rs.next()) {
				articulo.setId(rs.getInt("id"));
				articulo.setNombre(rs.getString("nombre"));
				articulo.setPrecio(rs.getDouble("precio"));
				articulo.setImagen(rs.getString("imagen"));

			}
			
			return articulo;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			if (con != null) {
				try {
					con.rollback();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
		return null;

	}
}
