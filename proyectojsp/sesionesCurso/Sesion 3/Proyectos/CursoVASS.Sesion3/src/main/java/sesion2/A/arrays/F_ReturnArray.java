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


class F_ReturnArray {

    static int arr[];

    static int[] get() {
        return new int[]{10, 30, 50, 90, 60};
    }

    static int[] get2() {
        arr[0] = 1;
        arr[0] = 2;
        return arr;
    }

    public static void main(String args[]) {

        int arr[] = get(); //llamamos al metodo que nos devuelve un array

        //lo imprimimos
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        
         int arr2[] = get2(); //llamamos al metodo que nos devuelve un array

        //lo imprimimos
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}
