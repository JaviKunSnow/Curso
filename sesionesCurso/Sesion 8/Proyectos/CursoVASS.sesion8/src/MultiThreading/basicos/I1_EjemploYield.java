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
class I1_EjemploYield extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                //  Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(i + " " + this.getName());
        }
    }

    public static void main(String args[]) {
    	I1_EjemploYield t1;
        t1 = new I1_EjemploYield();
        t1.setName("Hilo1");
        I1_EjemploYield t2 = new I1_EjemploYield();
        t2.setName("Hilo2");
        I1_EjemploYield t3 = new I1_EjemploYield();
        t3.setName("Hilo3");
        t1.start();
        t1.yield();
        t2.start();
        t2.yield();
        t3.start();
        

        // t2.yield();
    }
}
