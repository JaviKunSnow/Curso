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
abstract class Banco {

    abstract int getInterest();
}

class SBI extends Banco {

    @Override
    int getInterest() {
        return 7;
    }
}

class PNB extends Banco {

    
    @Override
    int getInterest() {
        return 8;
    }
}

class C_ClaseAbstractaBasica3 {

    public static void main(String args[]) {
        Banco b;
        b = new SBI();
        System.out.println("Tasa de interes: " + b.getInterest() + " %");
        b = new PNB();
        System.out.println("Tasa de interes: " + b.getInterest() + " %");
    }
}
