package curso.java.tienda.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;

import curso.java.tienda.config.Conexion;
import curso.java.tienda.model.Articulo;
import curso.java.tienda.model.DetallePedido;

public class DetallePedidoDAO {

		Connection con;
	
		public void insert(DetallePedido detalle) {
		
		con = Conexion.getConexion();
		
		try {
		
			PreparedStatement sentenciaSQL = con.prepareStatement("insert into detalle (pedido_id, producto_id, unidades, preciounidad, impuesto, total) values(?, ?, ?, ?, ?, ?)");
			
			sentenciaSQL.setInt(1, detalle.getPedidoId());
			sentenciaSQL.setInt(2, detalle.getProductoId());
			sentenciaSQL.setInt(3, detalle.getUnidades());
			sentenciaSQL.setDouble(4, detalle.getPrecioUnidad());
			sentenciaSQL.setDouble(5, detalle.getImpuesto());
			sentenciaSQL.setDouble(6, detalle.getTotal());
			
			sentenciaSQL.executeUpdate();
			
			Conexion.desconectar();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
}
