/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundotic.cursojava.modificadoresdeacceso.C.paqueteauxiliardemo;

/**
 *
 * @author Javi
 */
class A_EjemploDefaultDefiniciones {

    void msg() {
        System.out.println("Hello");
    }
}

class Prueba
{
     
    
     public static void main(String... args)
     {
         A_EjemploDefaultDefiniciones ademo = new A_EjemploDefaultDefiniciones();
         ademo.msg();
     }
}
