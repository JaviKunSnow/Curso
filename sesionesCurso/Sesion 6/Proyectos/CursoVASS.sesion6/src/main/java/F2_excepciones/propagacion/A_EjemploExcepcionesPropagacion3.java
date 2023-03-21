/*
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F2_excepciones.propagacion;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Javi
 */
public class A_EjemploExcepcionesPropagacion3 {

    //claramente el metodo que tiene un throw debe lanzar la excepcion o controlarla
    void m() throws IOException {
        throw new java.io.IOException("device error");//checked exception
    }

    void n() throws NullPointerException, IOException {
        m();
    }

    void p() throws NullPointerException, IOException {

        n();

    }

    public static void main(String args[]) {
        //Aqui procesamos todas las excepciones que puedan existir en una jerarquia de llamadas
        try {
            A_EjemploExcepcionesPropagacion3 obj = new A_EjemploExcepcionesPropagacion3();
            obj.p();
            System.out.println("normal flow");
        } catch (NullPointerException ex) {
            Logger.getLogger(A_EjemploExcepcionesPropagacion3.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(A_EjemploExcepcionesPropagacion3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
