package curso.java.tienda.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.Year;

import curso.java.tienda.config.Conexion;

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
	
	
	
}
