/*
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F2_excepciones.propagacion;

/**
 *
 * @author Javi
 */
public class A_EjemploExcepcionesPropagacion1 {

    //el metodo que tiene un throw debe lanzar la excepcion o controlarla
    void m() {
        throw new java.io.IOException("device error");//checked exception
    }

    void n() {
        m();
    }

    void p() {
       
            n();
       
    }

    public static void main(String args[]) {
        A_EjemploExcepcionesPropagacion1 obj = new A_EjemploExcepcionesPropagacion1();
        obj.p();
        System.out.println("normal flow");
    }

}
