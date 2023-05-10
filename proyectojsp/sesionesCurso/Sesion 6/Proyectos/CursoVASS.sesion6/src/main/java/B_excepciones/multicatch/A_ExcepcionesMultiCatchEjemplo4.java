/*
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_excepciones.multicatch;

/**
 *
 * @author Javi
 */
public class A_ExcepcionesMultiCatchEjemplo4 {

    public static void main(String args[]) {

        //Tenemos que ordenar las excepciones poniendo la generica o la base mas abajo
        try {
            int a[] = new int[5];
            a[5] = 30 / 0;
        } catch (Exception e) {
            System.out.println("common task completed");
        } catch (ArithmeticException e) {
            System.out.println("task1 is completed");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("task 2 completed");
        }
        System.out.println("rest of the code...");
    }

}
