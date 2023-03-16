/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundotic.cursojava.I.abstraccion.interfaz;

/**
 *
 * @author Javi
 */
interface Pintame {

    void dibuja();

    default void msg() {
        System.out.println("");
    }
}

class Cuadrado implements Pintame {

    public void dibuja() {
        System.out.println("");
    }
}

class TestInterfaceDefault {

    public static void main(String args[]) {
        Pintame d = new Cuadrado();
        d.dibuja();
        d.msg();
    }
}
