package curso.java.tienda.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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
		
	public List<DetallePedido> getByIdPedido(int id) {
			
		con = Conexion.getConexion();
			
		List <DetallePedido> detalles = new ArrayList<>();
		try {
			
				PreparedStatement sentenciaSQL = con.prepareStatement("select * from detalle where pedido_id = ?");
				
				sentenciaSQL.setInt(1, id);
				
				ResultSet rs = sentenciaSQL.executeQuery();
				
				while(rs.next()) {
					
					int idDetalle = rs.getInt("id");
					int idPedido = rs.getInt("pedido_id");
					int idProducto = rs.getInt("producto_id");
					int unidades = rs.getInt("unidades");
					Double precioUnidad = rs.getDouble("preciounidad");
					Double impuesto = rs.getDouble("impuesto");
					Double total = rs.getDouble("total");
					
					DetallePedido detalle = new DetallePedido(id, idPedido, idProducto, unidades, precioUnidad, impuesto, total);
					
					detalles.add(detalle);
					
				}
				
				Conexion.desconectar();
				
				return detalles;
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		return null;	
	}
	
}
