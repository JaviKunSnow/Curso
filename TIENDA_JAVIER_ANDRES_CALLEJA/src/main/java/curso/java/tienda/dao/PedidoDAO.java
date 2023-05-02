package curso.java.tienda.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Year;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

import curso.java.tienda.config.Conexion;
import curso.java.tienda.model.Pedido;

public class PedidoDAO {

	static Connection con;
	
	public int insert(int idUser, String metodoPago) {
		
		con = Conexion.getConexion();
		
		int year = Year.now().getValue();
		String numFacturaFormat = String.format("%03d", 1);
		String numeroFactura = "F-" + year + "-" + numFacturaFormat;
		
		try {
		
			PreparedStatement sentenciaSQL = con.prepareStatement("insert into pedido (usuario_id, fecha, metodoPago, numFactura, total) values(?, ?, ?, ?, null)", Statement.RETURN_GENERATED_KEYS);
			
			sentenciaSQL.setInt(1, idUser);
			sentenciaSQL.setObject(2, LocalDateTime.now());
			sentenciaSQL.setString(3, metodoPago);
			sentenciaSQL.setString(4, numeroFactura);
			
			sentenciaSQL.executeUpdate();
			
			ResultSet rs = sentenciaSQL.getGeneratedKeys();
			
			
			if(rs.next()) {
				int idPedido = rs.getInt(1);
				Conexion.desconectar();
				return idPedido;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
		
	}
	
	public List<Pedido> getAll() {
		
		con = Conexion.getConexion();
		List <Pedido> pedidos = new ArrayList<>();
		
		try {
			
			PreparedStatement sentenciaSQL = con.prepareStatement("select * from pedido");
			
			ResultSet rs = sentenciaSQL.executeQuery();
			
			while(rs.next()) {
				
				int id = rs.getInt("id");
				int idUser = rs.getInt("usuario_id");
				Timestamp fecha = rs.getTimestamp("fecha");
				String metodoPago = rs.getString("metodopago");
				String numFactura = rs.getString("numfactura");
				Double total = rs.getDouble("total");
				
				Pedido pedido = new Pedido(id, idUser, fecha, numFactura, numFactura, total);
				pedidos.add(pedido);
			}
			
			return pedidos;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public Pedido get(int id) {
		
		con = Conexion.getConexion();
		
		try {
			
			PreparedStatement sentenciaSQL = con.prepareStatement("select * from pedido where id = ?");
			
			sentenciaSQL.setInt(1, id);
			
			ResultSet rs = sentenciaSQL.executeQuery();
			
			while(rs.next()) {
				
				int idPedido = rs.getInt("id");
				int idUser = rs.getInt("usuario_id");
				Timestamp fecha = rs.getTimestamp("fecha");
				String metodoPago = rs.getString("metodopago");
				String numFactura = rs.getString("numfactura");
				Double total = rs.getDouble("total");
				
				Pedido pedido = new Pedido(id, idUser, fecha, numFactura, numFactura, total);

				return pedido;
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public List<Pedido> getAllByUser(int idUsuario) {
		
		con = Conexion.getConexion();
		List <Pedido> pedidos = new ArrayList<>();
		
		try {
			
			PreparedStatement sentenciaSQL = con.prepareStatement("select * from pedido where usuario_id = ?");
			
			sentenciaSQL.setInt(1, idUsuario);
			
			ResultSet rs = sentenciaSQL.executeQuery();
			
			while(rs.next()) {
				
				int id = rs.getInt("id");
				int idUser = rs.getInt("usuario_id");
				Timestamp fecha = rs.getTimestamp("fecha");
				String metodoPago = rs.getString("metodopago");
				String numFactura = rs.getString("numfactura");
				Double total = rs.getDouble("total");
				
				Pedido pedido = new Pedido(id, idUser, fecha, metodoPago, numFactura, total);
				pedidos.add(pedido);
			}
			
			return pedidos;
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public void update(Pedido pedido) {
		con = Conexion.getConexion();
		
		try {
			
			PreparedStatement sentenciaSQL = con.prepareStatement("update pedido set usuario_id = ?, metodopago = ?, numfactura = ?, total = ?");
			
			sentenciaSQL.setInt(1, pedido.getUsuarioId());
			sentenciaSQL.setString(2, pedido.getMetodoPago());
			sentenciaSQL.setString(3, pedido.getNumFactura());
			sentenciaSQL.setDouble(4, pedido.getTotal());
			
			sentenciaSQL.executeUpdate();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public List <Pedido> getByDate(String fechaComprobar, int idUsuario) {
		
		con = Conexion.getConexion();
		List <Pedido> pedidos = new ArrayList<>();
		
		try {
			
			PreparedStatement sentenciaSQL = con.prepareStatement("select * from pedido where DATE(fecha) = ? AND usuario_id = ?");
			
			sentenciaSQL.setString(1, fechaComprobar);
			sentenciaSQL.setInt(2, idUsuario);
			
			ResultSet rs = sentenciaSQL.executeQuery();
			
			while(rs.next()) {
				
				int id = rs.getInt("id");
				int idUser = rs.getInt("usuario_id");
				Timestamp fecha = rs.getTimestamp("fecha");
				String metodoPago = rs.getString("metodopago");
				String numFactura = rs.getString("numfactura");
				Double total = rs.getDouble("total");
				
				Pedido pedido = new Pedido(id, idUser, fecha, metodoPago, numFactura, total);
				pedidos.add(pedido);
			}
			
			return pedidos;
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
}
