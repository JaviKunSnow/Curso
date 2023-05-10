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
public class A_EjemploExcepcionEjemplo2 {

    public static void main(String[] args) {

        //controlamos el error con un bloque try catch
        try {
            int data = 50 / 0; //may throw exception
            //
            //
            //
        } //handling the exception
        catch (Exception e) {
            System.out.println(e);
        }
        
        System.out.println("El resto del código se ejecutaría");
    }
}
