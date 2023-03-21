/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.bbdd.ejemplos;

import curso.bbdd.Conexion;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Javi
 */
public class D_EjemploDataBaseMetaData {

    private Connection conexion;
    private Statement statement;

    D_EjemploDataBaseMetaData() {
        conexion = Conexion.getConexion();
        try {
            statement = conexion.createStatement();

            if (conexion != null) {
                //** Operaciones           
                DatabaseMetaData dbmd=conexion.getMetaData();  
                System.out.println("Driver Name: " + dbmd.getDriverName());
                System.out.println("Driver Version: " + dbmd.getDriverVersion());
                System.out.println("UserName: " + dbmd.getUserName());
                System.out.println("Database Product Name: " + dbmd.getDatabaseProductName());
                System.out.println("Database Product Version: " + dbmd.getDatabaseProductVersion());
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
