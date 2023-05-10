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
class B_RecorrerForEach {

    public static void main(String args[]) {
          int a[] = {33, 3, 4, 5};//declaracion, instanciacion e inicialiacion  
        
       //imprimir con for  
        for (int i = 0; i < a.length; i++)  
        {
            System.out.println(a[i]);
        }

        //imprimir array usando for-each loop  
        for (int x : a) {
            System.out.println(x);
        }
    }
}
