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
public class A_EjemploExcepcionEjemplo9 {

    public static void main(String[] args) {

        try {
            int arr[] = {1, 3, 5, 7};
            System.out.println(arr[10]); //may throw exception
        } //Controlando el limite del array
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        System.out.println("rest of the code");
    }

}
