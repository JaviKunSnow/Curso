/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E_excepciones.palabraclavethrows;

import java.io.IOException;

/**
 *
 * @author Javi
 */


class M {

    void method() throws IOException {
        throw new IOException("device error");
    }
}

class Testthrows2 {

    //Recoger una excepcion llamada por otro metodo y manejada correctamente
    public static void main(String args[]) {
        try {
            M m = new M();
            m.method();
        } catch (Exception e) {
            System.out.println("exception handled");
        }

        System.out.println("normal flow...");
    }
}
