/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundotic.cursojava.E.superkeyword;

/**
 *
 * @author Javi
 */
class Animal {

    void comer() {
        System.out.println("eating...");
    }
}

class Gato extends Animal {

    void comer() {
        System.out.println("eating bread...");
    }

    void trepar() {
        System.out.println("barking...");
    }

    void mezclar() {
        super.comer();
        trepar();
    }
}

class B_SuperLLamarMetodoClasePadre {

    public static void main(String args[]) {
        Gato d = new Gato();
        d.mezclar();
        d.comer();
    }
}
