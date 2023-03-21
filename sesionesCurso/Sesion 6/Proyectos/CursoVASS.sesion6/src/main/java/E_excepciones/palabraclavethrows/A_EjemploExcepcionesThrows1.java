/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E_excepciones.palabraclavethrows;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Javi
 */
public class A_EjemploExcepcionesThrows1 {

    //ejecución de una excepcion en una pila de metodos
    void m() throws IOException {
       
    	throw new IOException("device error");//checked exception
    }

    void n() throws IOException, SQLException {
        m();
    }

    void p() throws IOException, SQLException {
        n();
    }

    public static void main(String args[]) {
        try {
            A_EjemploExcepcionesThrows1 obj = new A_EjemploExcepcionesThrows1();
            obj.p();
            System.out.println("normal flow...");
        } catch (IOException ex) {
            Logger.getLogger(A_EjemploExcepcionesThrows1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

}
