/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundotic.cursojava.F.finalkeyword;

/**
 *
 * @author Javi
 */
class F_EjemploParametroFinal {

    int cube(final int n) {
       //n = n + 2;//b no puede ser modificada 
       return  n * n * n; //pero podemos usar su valor para operar con ella
    }

    public static void main(String args[]) {
        F_EjemploParametroFinal b = new F_EjemploParametroFinal();
       int cube =  b.cube(5);
        System.out.println(cube);
    }
}
