package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import config.Conexion;
import model.modelPedidos;

public class pedidosDao {

	private static Connection con;

	public static boolean insertarPedido(modelPedidos pedido) {
		con = Conexion.getConexion();
		
		try {
            if (con != null) {
               
               PreparedStatement stmt = con.prepareStatement("insert into pedidos (id, id_usuario, fecha, metodo_pago, estado, num_factura, total) values(null,?,?,?,?,?,?)");
               
               stmt.setInt(1, pedido.getId_usuario());      
               stmt.setTimestamp(2, pedido.getFecha());
               stmt.setString(3, pedido.getMetodo_pago());
               stmt.setString(4, pedido.getEstado());
               stmt.setString(5, pedido.getNum_factura());
               stmt.setDouble(6, pedido.getTotal());
               
               stmt.executeUpdate();
               
               System.out.println("funciona");
               Conexion.desconectar();
               return true;
               

           } else {
               System.out.println("Conexion no realizada");
           }
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
		return false;

	}
	
	public static int devolverIdPedido(int id) {
		con = Conexion.getConexion();
		
		try {
			PreparedStatement sentenciaSQL = con.prepareStatement("select id from pedidos where id_usuario = ? order by id desc LIMIT 1");
			
			sentenciaSQL.setInt(1, id);
			
			ResultSet rs = sentenciaSQL.executeQuery();
			if (rs.next()) {
				return rs.getInt(1);

			} else {
				System.out.println("No se puede desplazar el cursor");
			}

			if (con != null) {
				// ** Operaciones
				Conexion.desconectar();
			} else {
				System.out.println("Conexion no realizada");
			}
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
		return 0;

	}
	
}
