package curso.java.tienda.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;

import curso.java.tienda.config.Conexion;
import curso.java.tienda.model.Articulo;

public class DetallePedidoDAO {

		Connection con;
	
		public void insert(int idPedido, Articulo articulo) {
		
		con = Conexion.getConexion();
		
		try {
		
			PreparedStatement sentenciaSQL = con.prepareStatement("insert into detalle (pedido_id, producto_id, unidades, preciounidad, impuesto, total) values(?, ?, ?, ?, ?, ?)");
			
			Double total = (articulo.getPrecio() * articulo.getImpuesto()) + (articulo.getCantidad() * articulo.getPrecio());
			
			sentenciaSQL.setInt(1, idPedido);
			sentenciaSQL.setInt(2, articulo.getId());
			sentenciaSQL.setInt(3, articulo.getCantidad());
			sentenciaSQL.setDouble(4, articulo.getPrecio());
			sentenciaSQL.setDouble(5, articulo.getImpuesto());
			sentenciaSQL.setDouble(6, total);
			
			sentenciaSQL.executeUpdate();
			
			Conexion.desconectar();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
}
