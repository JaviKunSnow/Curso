package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import config.Conexion;
import model.modelArticulo;


public class articuloDao {

	private static Connection con;

	public static List <modelArticulo> filtrarArticulo() {
		con = Conexion.getConexion();
		List <modelArticulo> articulos = new ArrayList<modelArticulo>();
		
		try {
			PreparedStatement sentenciaSQL = con.prepareStatement("select * from tabla3 where campo1_tabla_3 > ?");
			
			sentenciaSQL.setFloat(1, 60);
			//sentenciaSQL.setFloat(2, 60);
			
			ResultSet rs = sentenciaSQL.executeQuery();
			if (rs.next()) {
				while(rs.next()) {
					modelArticulo articulo = new modelArticulo();
					articulo.setClave_tabla_3(rs.getInt(1));
					articulo.setCampo1_tabla_3(rs.getFloat(2));
					articulo.setClave_tabla_2(rs.getInt(3));
					articulos.add(articulo);
					System.out.println(articulo.toString());
				}
				//persona.setNombre(rs.getString("nombre"));
				return articulos;

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
		return null;

	}
	
	
}
