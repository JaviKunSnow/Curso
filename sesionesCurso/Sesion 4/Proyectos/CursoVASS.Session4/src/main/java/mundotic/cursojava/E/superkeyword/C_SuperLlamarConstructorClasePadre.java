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
class Animall {

    Animall() {
        System.out.println("animal is created");
    }
}

class Pez extends Animall {

    Pez() {
        super();
        System.out.println("dog is created");
    }
}

class C_SuperLlamarConstructorClasePadre {

    public static void main(String args[]) {
        Pez d = new Pez ();
    }
}
