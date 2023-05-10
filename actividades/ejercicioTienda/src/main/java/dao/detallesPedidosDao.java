package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import config.Conexion;
import model.modelDetallesPedidos;

public class detallesPedidosDao {

	private static Connection con;
	
	public static boolean insertarDetallesPedido(List <modelDetallesPedidos> detalles) {
		con = Conexion.getConexion();
		
		try {
            if (con != null) {
               
               PreparedStatement stmt = con.prepareStatement("insert into detalles_pedido (id, id_pedido, id_producto, precio_unidad, unidades, impuesto, total) values(?,?,?,?,?,?,?)");
               
               
               for(modelDetallesPedidos detalle : detalles) {
            	   
            	   stmt.setInt(1, detalle.getId());
            	   stmt.setInt(2, detalle.getId_pedido());
            	   stmt.setInt(3, detalle.getId_producto());
            	   stmt.setFloat(4, detalle.getPrecio_unidad());
            	   stmt.setInt(5, detalle.getCantidad());
            	   stmt.setFloat(6, detalle.getImpuesto());
            	   stmt.setDouble(7, detalle.getTotal());
            	   
            	   stmt.executeUpdate();
            	   
               }
               
               
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
}
