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
 
class G_ArrayClassName {

    public static void main(String args[]) {

        int arr[] = {4, 4, 5};
  
        Class c = arr.getClass();
        String name = c.getName();
        //Imprimimos class name
        System.out.println(name);

    }
}
