/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ztic.genericos.A.ejemploArray;

/**
 *
 * @author Javi
 */
public class GenericMethodTest {

    // generic method printArray
    public static <E> void printArray(E[] inputArray) {
        // Display array elements
        for (E element : inputArray) {
            System.out.println(element);
        }
        System.out.println();

    }
}
