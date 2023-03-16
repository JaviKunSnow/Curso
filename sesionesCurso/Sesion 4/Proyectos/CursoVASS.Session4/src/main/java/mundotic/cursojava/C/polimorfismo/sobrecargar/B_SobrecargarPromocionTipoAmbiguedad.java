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
//Java Program to illustrate the use of Java Method Overriding  
//Creating a parent class.  


class B_SobrecargarPromocionTipoAmbiguedad {

    void sum(int a, int b) {
        System.out.println("int arg method invoked");
    }

    void sum(long a, long b) {
        System.out.println("long arg method invoked");
    }

    public static void main(java.lang.String... args) {
        B_SobrecargarPromocionTipoAmbiguedad obj = new B_SobrecargarPromocionTipoAmbiguedad();
        int numEntero = 23445;
        long numLargo = 345345434;
        obj.sum(numEntero, numEntero );//now int arg sum() method gets invoked  
        obj.sum(345345434, numLargo);
    }
}
