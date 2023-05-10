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
public class A_EjemploExcepcionEjemplo5 {

    public static void main(String[] args) {
        try {
            int data = 50 / 0; //may throw exception
        } catch (Exception e) {
            //Podemos sacar mensajes personalizados
            System.out.println("Can't divided by zero");
        }
    }

}
