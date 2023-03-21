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
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Javi
 */
public class F_EjemploProcesamientoBatch {

    private Connection con;
    private Statement stmt;

    F_EjemploProcesamientoBatch() {
        con = Conexion.getConexion();
        try {
            stmt = con.createStatement();

            if (con != null) {
                //** Operaciones
                Statement stmt = con.createStatement();
                PreparedStatement stmtPre = con.prepareStatement("");
                stmtPre.addBatch();
                stmt.addBatch("INSERT INTO `tabla1` (`campo1_tabla_1`, `campo2_tabla1`) VALUES ( 'qwerqwer', '55324');");
                stmt.addBatch("INSERT INTO `tabla1` (`campo1_tabla_1`, `campo2_tabla1`) VALUES ( 'xcvxv', '221556');");
                

                stmt.executeBatch();//executing the batch 
                con.commit();
                
                Conexion.desconectar();
            } else {
                System.out.println("Conexion no realizada");
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block        	
            
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
