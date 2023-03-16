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
 
class H_CopiarArray {

    public static void main(String[] args) {
         
        char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e',
            'i', 'n', 'a', 't', 'e', 'd'};
        
        //declaramos array destino
        char[] copyTo = new char[7];
        
         //utilizamos el metodo arraycopy de la clase System
        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        
        //printing el array de destino desde la clase String
        System.out.println(String.valueOf(copyTo));
    }
}
