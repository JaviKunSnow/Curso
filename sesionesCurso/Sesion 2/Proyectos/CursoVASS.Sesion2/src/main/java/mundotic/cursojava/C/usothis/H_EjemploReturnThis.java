/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundotic.cursojava.C.usothis;

/**
 *
 * @author Javi
 */
class Ados {

	Ados getAdos() {
        return this;
    }

    void msg() {
        System.out.println("Hola");
    }
}

class H_EjemploReturnThis {

    public static void main(String args[]) {
        new Ados().getAdos().msg();
    }
}
