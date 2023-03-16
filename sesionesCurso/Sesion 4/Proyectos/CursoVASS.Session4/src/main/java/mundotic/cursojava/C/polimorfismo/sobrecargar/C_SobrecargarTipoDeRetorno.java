/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundotic.cursojava.C.polimorfismo.sobrecargar;

/**
 *
 * @author Javi
 */
class D_OverloadingConPromocinoPorTipos {

    //EN JAVA NO SE PUEDE CONSEGUIR LA SOBRECARGA SOLO CAMBIANDO EL TIPO DE RETORNO
    public static void main(java.lang.String... args) {
        System.out.println(Adder.add(11, 11));//ambiguity  
    }
}

class Adder {

    static int add(double a, double b) {
        return (int) ((int) a + b);
    }

 /*   static double add(double a, double b) {
        return a + b;
    }*/
}

