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
public class A_EjemploExcepcionesPropagacio2 {

    void m() {
        int data = 50 / 0;
    }

    void n() {
        m();
    }

    //Puedo proteger el código en otro metodo donde se pueda producir la excepcion siempre que este en la pila de llamadas
    void p() {
        try {
            n();
        } catch (Exception e) {
            System.out.println("exception handled");
        }
    }

    public static void main(String args[]) {
        A_EjemploExcepcionesPropagacio2 obj = new A_EjemploExcepcionesPropagacio2();
        obj.p();
        System.out.println("normal flow...");
    }

}
