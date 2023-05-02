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
import curso.java.tienda.model.Articulo;


public class ArticuloDAO {

	private Connection con;
	
	public ArticuloDAO() {
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
	
	public List<Articulo> getAll() {
		
		con = Conexion.getConexion();
		
		List<Articulo> catalogo = new ArrayList<>();
		try {
			
			Statement statement = con.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM producto");
			
			while (resultSet.next()) {
				
				int id = resultSet.getInt("id");
				String nombre = resultSet.getString("nombre");
				String descripcion = resultSet.getString("descripcion");
				String marca = resultSet.getString("marca");
				int categoria_id = resultSet.getInt("categoria_id");
				double precio = resultSet.getDouble("precio");
				double impuesto = resultSet.getDouble("impuesto");
				int stock = resultSet.getInt("stock");
				boolean baja = resultSet.getBoolean("baja");
				
				Articulo articulo = new Articulo(id, nombre, descripcion, marca, categoria_id, precio, impuesto, stock, baja);
				catalogo.add(articulo);
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return catalogo;
	}
	
	public Articulo get(int id) {
		con = Conexion.getConexion();
		
		Articulo articulo = new Articulo();
		
		try {
			PreparedStatement sentenciaSQL = con.prepareStatement("select * from producto where id = ?");
			
			sentenciaSQL.setInt(1, id);
			
			ResultSet rs = sentenciaSQL.executeQuery();
			if (rs.next()) {
				articulo.setId(rs.getInt("id"));
				articulo.setNombre(rs.getString("nombre"));
				articulo.setDescripcion(rs.getString("descripcion"));
				articulo.setMarca(rs.getString("marca"));
				articulo.setCategoria_id(rs.getInt("categoria_id"));
				articulo.setPrecio(rs.getDouble("precio"));
				articulo.setImpuesto(rs.getDouble("impuesto"));
				articulo.setStock(rs.getInt("stock"));
				articulo.setBaja(rs.getBoolean("baja"));

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
	
	public void update(Articulo articulo) {
		con = Conexion.getConexion();
		
		try {
			PreparedStatement sentenciaSQL = con.prepareStatement("UPDATE producto SET nombre = ?, descripcion = ?, marca = ?, categoria_id = ?, precio = ?, impuesto = ?, stock = ?, baja = ? where id = ?");
			
			sentenciaSQL.setString(1, articulo.getNombre());
			sentenciaSQL.setString(2, articulo.getDescripcion());
			sentenciaSQL.setString(3, articulo.getMarca());
			sentenciaSQL.setInt(4, articulo.getCategoria_id());
			sentenciaSQL.setDouble(5, articulo.getPrecio());
			sentenciaSQL.setDouble(6, articulo.getImpuesto());
			sentenciaSQL.setInt(7, articulo.getStock());
			sentenciaSQL.setBoolean(8, articulo.isBaja());
			sentenciaSQL.setInt(9, articulo.getId());
			
			sentenciaSQL.executeUpdate();
			
			Conexion.desconectar();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public List<Articulo> getFilter(String consulta) {
		
		con = Conexion.getConexion();
		
		List<Articulo> catalogo = new ArrayList<>();
		try {
			
			Statement statement = con.createStatement();
			ResultSet resultSet = statement.executeQuery(consulta);
			
			while (resultSet.next()) {
				
				int id = resultSet.getInt("id");
				String nombre = resultSet.getString("nombre");
				String descripcion = resultSet.getString("descripcion");
				String marca = resultSet.getString("marca");
				int categoria_id = resultSet.getInt("categoria_id");
				double precio = resultSet.getDouble("precio");
				double impuesto = resultSet.getDouble("impuesto");
				int stock = resultSet.getInt("stock");
				boolean baja = resultSet.getBoolean("baja");
				
				Articulo articulo = new Articulo(id, nombre, descripcion, marca, categoria_id, precio, impuesto, stock, baja);
				catalogo.add(articulo);
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return catalogo;
		
	}
	
	public List<Articulo> findByCategoria(int id_categoria) {
		
		con = Conexion.getConexion();
		
		List<Articulo> catalogo = new ArrayList<>();
		try {
			
			PreparedStatement sentenciaSQL = con.prepareStatement("SELECT * FROM producto where categoria_id = ?");
			
			sentenciaSQL.setInt(1, id_categoria);
			
			ResultSet resultSet = sentenciaSQL.executeQuery();
			
			while (resultSet.next()) {
				
				int id = resultSet.getInt("id");
				String nombre = resultSet.getString("nombre");
				String descripcion = resultSet.getString("descripcion");
				String marca = resultSet.getString("marca");
				int categoria_id = resultSet.getInt("categoria_id");
				double precio = resultSet.getDouble("precio");
				double impuesto = resultSet.getDouble("impuesto");
				int stock = resultSet.getInt("stock");
				boolean baja = resultSet.getBoolean("baja");
				
				Articulo articulo = new Articulo(id, nombre, descripcion, marca, categoria_id, precio, impuesto, stock, baja);
				catalogo.add(articulo);
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return catalogo;
		
	}
}
