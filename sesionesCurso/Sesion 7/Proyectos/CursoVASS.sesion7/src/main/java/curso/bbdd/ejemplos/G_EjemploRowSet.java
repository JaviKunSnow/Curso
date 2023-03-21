/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.bbdd.ejemplos;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

/**
 *
 * @author Javi
 */
public class G_EjemploRowSet {

    G_EjemploRowSet() {
        try {

            //** Operaciones
            //Creating and Executing RowSet
            JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();
          
            rowSet.setUrl("jdbc:mysql://127.0.0.1/curso");
            rowSet.setUsername("root");
            rowSet.setPassword("");
            rowSet.setAutoCommit(false);

            rowSet.setCommand("select * from tabla1 where id = ?");
            
            rowSet.setInt(1, 1);
            
            rowSet.execute();
            
            while (rowSet.next()) {
                // Generating cursor Moved event
                System.out.println("Nombre: " + rowSet.getString(2));
                System.out.println("Pais: " + rowSet.getString(3));
            }

        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println(e.toString());
        }
    }

}
