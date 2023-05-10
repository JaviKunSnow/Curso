/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.bbdd.ejemplos;

import curso.bbdd.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Javi
 */
public class B_EjemploResultSet {

	private Connection con;

	B_EjemploResultSet() {
		con = Conexion.getConexion();
		try {

			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery("select * from tabla1");
			if (rs.next()) {
				//persona.setNombre(rs.getString("nombre"));

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

	}

}
