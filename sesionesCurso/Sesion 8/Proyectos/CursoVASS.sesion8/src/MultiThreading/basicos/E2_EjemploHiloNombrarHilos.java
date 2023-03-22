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
class E2_EjemploHiloNombrarHilos extends Thread {

    public void run() {
        System.out.println("running..." + Thread.currentThread().getName());
    }

    public static void main(String args[]) {
        E2_EjemploHiloNombrarHilos t1 = new E2_EjemploHiloNombrarHilos();
        E2_EjemploHiloNombrarHilos t2 = new E2_EjemploHiloNombrarHilos();
        System.out.println("Name of t1:" + t1.getName());
        System.out.println("Name of t2:" + t2.getName());

        t1.start();
        t2.start();

        t1.setName("Sonoo Jaiswal");
        System.out.println("After changing name of t1:" + t1.getName());
    }
}
