package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import modelo.Articulo;

//Clase DAO que se encarga de obtener los artículos desde la base de datos
public class ArticuloDAO {
	private Connection conexion;

	public ArticuloDAO() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/tienda";
			String usuario = "root";
			String contrasenia = "";
			conexion = DriverManager.getConnection(url, usuario, contrasenia);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	public List<Articulo> obtenerCatalogo() {
		List<Articulo> catalogo = new ArrayList<>();
		try {
			Statement statement = conexion.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM productos limit 24");
			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String nombre = resultSet.getString("nombre");
				String descripcion = resultSet.getString("descripcion");
				double precio = resultSet.getDouble("precio");
				String imagen = resultSet.getString("imagen");
				Articulo articulo = new Articulo(id, nombre, descripcion, precio, imagen);
				catalogo.add(articulo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return catalogo;
	}

	public Articulo obtenerArticulo(int id) {
		Articulo articulo = null;
		String sql = "SELECT * FROM productos WHERE id = ?";
		try {
			PreparedStatement pstmt = conexion.prepareStatement(sql);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				articulo = new Articulo();
				articulo.setId(rs.getInt("id"));
				// articulo.setIdCategoria(rs.getInt("id_categoria"));
				articulo.setNombre(rs.getString("nombre"));
				articulo.setDescripcion(rs.getString("descripcion"));
				articulo.setPrecio(rs.getDouble("precio"));
//	            articulo.setStock(rs.getInt("stock"));
//	            articulo.setFechaAlta(rs.getTimestamp("fecha_alta"));
//	            articulo.setFechaBaja(rs.getTimestamp("fecha_baja"));
//	            articulo.setImpuesto(rs.getFloat("impuesto"));
//	            articulo.setImagen(rs.getString("imagen"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return articulo;
	}

}