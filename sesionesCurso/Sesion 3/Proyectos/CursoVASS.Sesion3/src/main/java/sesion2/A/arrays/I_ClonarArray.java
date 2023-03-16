/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion2.A.arrays;

/**
 *
 * @author Javi
 */
 
class I_ClonarArray {

    public static void main(String args[]) {
        int arr[] = {33, 3, 4, 5};
        System.out.println(" original :");
        for (int i : arr) {
            System.out.println(i);
        }

        System.out.println(" clon :");
        //clonamos
        int carr[] = arr.clone();
        //mostramos el clon
        for (int i : carr) {
            System.out.println(i);
        }

        System.out.println("Are both equal?");
        System.out.println(arr == carr);       

    }
}

