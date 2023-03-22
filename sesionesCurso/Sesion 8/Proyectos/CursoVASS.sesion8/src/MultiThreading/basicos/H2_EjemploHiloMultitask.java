/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiThreading.basicos;

/**
 *
 * @author Javi
 */
class Simple1 extends Thread {

    public void run() {
        System.out.println("task one");
    }
}

class Simple2 extends Thread {

    public void run() {
        System.out.println("task two");
    }
}

class H2_EjemploHiloMultitask {

    public static void main(String args[]) {
        Simple1 t1 = new Simple1();
        Simple2 t2 = new Simple2();

        t1.start();
        t2.start();

    }
}
