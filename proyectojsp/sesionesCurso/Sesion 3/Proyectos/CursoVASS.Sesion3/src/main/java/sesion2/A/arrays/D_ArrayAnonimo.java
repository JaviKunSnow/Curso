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
 
public class D_ArrayAnonimo {
//creating a method which receives an array as a parameter  

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String args[]) {
        printArray(new int[]{10, 22, 44, 66});//pasar un array anonimo, significa crear el array en la llamada del metodo al que lo quieres pasar 
    }
}
