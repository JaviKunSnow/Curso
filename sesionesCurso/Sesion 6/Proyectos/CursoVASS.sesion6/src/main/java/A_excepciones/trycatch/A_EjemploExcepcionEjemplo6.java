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
public class A_EjemploExcepcionEjemplo6 {

    public static void main(String[] args) {
        int i = 50;
        int j = 0;
        int data;
        try {
            data = i / j; //may throw exception
        } // handling the exception
        catch (Exception e) {
            //Podemos uilizar el bloque catch para dar un resolución de la situación por defecto
            System.out.println(i / (j + 2));
        }   
        
        
    }

}
