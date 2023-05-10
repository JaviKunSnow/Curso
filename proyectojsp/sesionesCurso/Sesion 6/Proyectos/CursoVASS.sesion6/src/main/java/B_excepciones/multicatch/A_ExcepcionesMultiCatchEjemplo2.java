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
public class A_ExcepcionesMultiCatchEjemplo2 {

    public static void main(String[] args) {

        //igual que antes
        try {
            int a[] = new int[5];
            System.out.println(a[10]);

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurs");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        } catch (Exception e) {
            System.out.println("Parent Exception occurs");
        }
        System.out.println("rest of the code");
    }

}
