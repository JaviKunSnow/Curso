/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A_excepciones.trycatch;

/**
 *
 * @author Javi
 */
public class A_EjemploExcepcionEjemplo4 {

    public static void main(String[] args) {

        try {
            int data = 50 / 0; //may throw exception
        } //Podemos recoger la excepcion con la clase excepción de forma genérica
        // y utilizar esa variable para imprimir el mensaje
        catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("rest of the code");
    }

}
