/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.bbdd.ejemplos;

import curso.bbdd.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Javi
 */
public class D_EjemploResultSetMetaData {

    private Connection conexion;
    private Statement statement;

    D_EjemploResultSetMetaData() {
        conexion = Conexion.getConexion();
        try {
            statement = conexion.createStatement();

            if (conexion != null) {
                //** Operaciones
                PreparedStatement ps = conexion.prepareStatement("select * from tabla1");
                ResultSet rs = ps.executeQuery();
                ResultSetMetaData rsmd = rs.getMetaData();

                System.out.println("Total columns: " + rsmd.getColumnCount());
                System.out.println("Column Name of 1st column: " + rsmd.getColumnName(1));
                System.out.println("Column Type Name of 1st column: " + rsmd.getColumnTypeName(1));
                Conexion.desconectar();
            } else {
                System.out.println("Conexion no realizada");
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            if (conexion != null) {
                try {
                    conexion.rollback();
                } catch (SQLException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
            }
        }

    }

}
