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
public class A_EjemploExcepcionEjemplo7 {

    public static void main(String[] args) {

        try {
            int data1 = 50 / 0; //may throw exception

        } // handling the exception
        catch (Exception e) {
            //Cuidado con generar otra excepcion en el bloque catch, ya que se podría dar el caso.
            int data2 = 50 / 0; //may throw exception

        }
        System.out.println("rest of the code");
    }

}
