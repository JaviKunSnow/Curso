/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundotic.cursojava.H.abstraccion.claseabstracta;

/**
 *
 * @author Javi
 */
//Example of an abstract class that has abstract and non-abstract methods  
abstract class Coche {

    static int vehiculos;
    final int N_RUEDAS = 4;

    //LAS CLASES ABSTRACTAS PUEDEN TENER CONSTRUCTORES PERO SOLO PUEDEN SER USADOS DESDE LAS CLASES HIJA
    Coche() {
        System.out.println("coche");
        vehiculos++;
    }

    abstract void run();

    void cambiarMarcha() {
        System.out.println("marcha cambiada");
    }
}
//Cramos una clase que hereda de una clase abstracta

class Audi extends Coche {
    
    Audi(){
        super();
    }

    @Override
    void run() {
        System.out.println("circulando");
    }
}
//

class E_ClaseAbstractaBasica4 {

    public static void main(String args[]) {
        Coche obj = new Audi();
        obj.run();
        obj.cambiarMarcha();

        obj = new Audi();

        System.out.println(Coche.vehiculos);
    }
}
