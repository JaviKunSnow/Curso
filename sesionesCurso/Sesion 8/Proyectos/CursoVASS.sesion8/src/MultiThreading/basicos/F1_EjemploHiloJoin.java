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
class F1_EjemploHiloJoin extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

    public static void main(String args[]) {
    	F1_EjemploHiloJoin t1 = new F1_EjemploHiloJoin();
    	F1_EjemploHiloJoin t2 = new F1_EjemploHiloJoin();
    	F1_EjemploHiloJoin t3 = new F1_EjemploHiloJoin();
        t1.start();
        try {
            t1.join();
        } catch (Exception e) {
            System.out.println(e);
        }

        t2.start();
        t3.start();
    }
}
