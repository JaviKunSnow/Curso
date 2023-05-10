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
public class A_EjemploExcepcionEjemplo3 {

    public static void main(String[] args) {

        try {
            int data = 50 / 0; //may throw exception   
            // el codigo que este por debajo de la excepcion no se ejecua, y nos iriamos al bloque catch
            System.out.println("rest of the code");
        } // handling the exception
        catch (ArithmeticException e) {
            System.out.println(e);
        }

        System.out.println("rest of the code");

    }
}
