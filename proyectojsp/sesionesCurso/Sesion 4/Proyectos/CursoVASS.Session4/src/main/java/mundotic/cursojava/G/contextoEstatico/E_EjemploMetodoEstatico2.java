/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundotic.cursojava.G.contextoEstatico;

/**
 *
 * @author Javi
 */
class E_EjemploMetodoEstatico2 {

    static int num;
    
    static int cube(int x) {
        E_EjemploMetodoEstatico2.num++;
        return x * x * x;
    }

    public static void main(String args[]) {
        int result = E_EjemploMetodoEstatico2.cube(5);
        System.out.println(result);
    }
}
