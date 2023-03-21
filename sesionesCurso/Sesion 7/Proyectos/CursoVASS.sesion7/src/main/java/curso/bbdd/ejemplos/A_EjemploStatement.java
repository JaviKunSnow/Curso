/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.bbdd.ejemplos;

import curso.bbdd.Conexion;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Javi
 */
public class A_EjemploStatement {

    private Connection conexion;
    private Statement statement;

    A_EjemploStatement() {
        conexion = Conexion.getConexion();
        try {
        	
            statement = conexion.createStatement();

            if (conexion != null) {
                //** Operaciones
                int result = statement.executeUpdate("delete from tabla1 where clave_tabla_1=33");
                
                            
                System.out.println(result + " records affected");
                Conexion.desconectar();
            } else {
                System.out.println("Conexion no realizada");
            }
        } catch (SQLException e) {
// TODO Auto-generated catch block
            if (conexion != null) {
                try {
                    conexion.rollback();
                } catch (SQLException e1) {
                    // TODO Auto-generated catch block

                }
            }
        }

    }

}
