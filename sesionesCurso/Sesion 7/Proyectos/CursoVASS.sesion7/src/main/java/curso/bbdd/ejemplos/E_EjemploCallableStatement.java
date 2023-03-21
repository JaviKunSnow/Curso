/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.bbdd.ejemplos;

import curso.bbdd.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Javi
 */
public class E_EjemploCallableStatement {

    private Connection conexion;
    private Statement statement;

    E_EjemploCallableStatement() {
        conexion = Conexion.getConexion();
        try {      

            if (conexion != null) {
                //** Operaciones
                //procedimiento almacenado sin parametros
                CallableStatement stmt = conexion.prepareCall("{call inserarDatos(?,?)}");

                stmt.setInt(1, 1546011);
                stmt.setString(2, "Ejemplo");
                boolean b = stmt.execute();
                // devuelve el valor del parametro de salida del procedimiento
                //String resultado = stmt.getString("nombre");                
                System.out.println("success");

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
