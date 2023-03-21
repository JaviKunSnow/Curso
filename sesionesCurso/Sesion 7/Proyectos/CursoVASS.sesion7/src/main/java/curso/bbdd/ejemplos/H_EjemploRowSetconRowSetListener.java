/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.bbdd.ejemplos;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.sql.RowSetEvent;
import javax.sql.RowSetListener;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

/**
 *
 * @author Javi
 */
public class H_EjemploRowSetconRowSetListener {

    private Connection con;
    private Statement stmt;

    H_EjemploRowSetconRowSetListener() {
        // con = Conexion.getConexion();
        try {
            //stmt = con.createStatement();

            if (true/*con != null*/) {
                //** Operaciones
                //Creating and Executing RowSet  
                JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet(); 
                rowSet.setUrl("jdbc:mysql://127.0.0.1/curso");
                rowSet.setUsername("root");
                rowSet.setPassword("");

                rowSet.setCommand("select * from alumnos");

                rowSet.execute();

                //Adding Listener and moving RowSet  
                rowSet.addRowSetListener(new MyListener());

                while (rowSet.next()) {
                    // Generating cursor Moved event  
                    System.out.println("Nombre: " + rowSet.getString(2));
                    System.out.println("Pais: " + rowSet.getString(3));
                }

                //Conexion.desconectar();
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

class MyListener implements RowSetListener {

    @Override
    public void cursorMoved(RowSetEvent event) {
        System.out.println("Cursor Moved...");
    }

    @Override
    public void rowChanged(RowSetEvent event) {
        System.out.println("Cursor Changed...");
    }

    @Override
    public void rowSetChanged(RowSetEvent event) {
        System.out.println("RowSet changed...");

    }
}
