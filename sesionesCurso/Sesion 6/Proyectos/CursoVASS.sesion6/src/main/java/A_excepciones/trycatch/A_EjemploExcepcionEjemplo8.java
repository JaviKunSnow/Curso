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
public class A_EjemploExcepcionEjemplo8 {

    public static void main(String[] args) {
        try {
            int data = 50 / 0; //may throw exception

        } //No podemos capturar la excepcion si no es del tipo adecuado, generico o personalizado
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }

        System.out.println("rest of the code");
    }

}
