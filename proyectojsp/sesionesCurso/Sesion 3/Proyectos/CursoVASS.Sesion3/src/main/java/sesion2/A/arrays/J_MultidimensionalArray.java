/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion2.A.arrays;

import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author Javi
 */
class Testarray3 {

    public static void main(String args[]) {

        int arr[][] = {{1, 2, 3}, {2, 4, 5}, {4, 4, 5}};

        int arr2[] = {0, 0, 0};

        Vector vector = new Vector();
        ArrayList lista = new ArrayList();

        vector.add(1);
        vector.add(1);
        System.out.println(vector.size());

        System.out.println(arr2.length);
//        arr[0][3]; //fila 0 columna 3
//        arr[i].length // longitud la fila
        

        int contador = 0;

        //imprimimos
        for (int i = 0; i < 3; i++) {
            //columnas
            for (int j = 0; j < 3; j++) {

                if (arr[i][j] == 'O') {
                    contador++;
                }
            }
            System.out.println("El numero de asientos ocupados es: " + contador);
        }
    }
}
