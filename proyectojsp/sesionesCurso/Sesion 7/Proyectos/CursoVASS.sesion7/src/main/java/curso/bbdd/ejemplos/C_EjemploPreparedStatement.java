/*
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.bbdd.ejemplos;

import curso.bbdd.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Javi
 */
public class C_EjemploPreparedStatement {

    private Connection conexion;
    private Statement statement;

    C_EjemploPreparedStatement() {
        conexion = Conexion.getConexion();
        try {
             if (conexion != null) {
                String sql = "";
                PreparedStatement stmt = conexion.prepareStatement("insert into tabla1 (campo1_tabla_1, campo2_tabla1) values(?,?)");
                
                stmt.setString(1, "Ratan");//1 specifies the first parameter in the query  
                stmt.setInt(2, 101);      
           

                int i = stmt.executeUpdate();
                
                System.out.println(i + " records inserted");

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
