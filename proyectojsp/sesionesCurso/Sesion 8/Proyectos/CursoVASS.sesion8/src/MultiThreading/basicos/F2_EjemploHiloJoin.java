/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiThreading.basicos;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Javi
 */
class F2_EjemploHiloJoin extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
            //Para manejar los métodos del hilo actual utilizaremos el operador this de aquí en adelante
            System.out.println(i + " " + this.getName());
            
        }
    }

    public static void main(String args[]) {
        try {
        	F2_EjemploHiloJoin t1;
            t1 = new F2_EjemploHiloJoin();
            t1.setName("Hilo1");
            F2_EjemploHiloJoin t2 = new F2_EjemploHiloJoin();
            t2.setName("Hilo2");
            F2_EjemploHiloJoin t3 = new F2_EjemploHiloJoin();
            t3.setName("Hilo3");
            t1.start();
           
            t1.join();
           

            t2.start();
            t2.join();
            t3.start();
        } catch (InterruptedException ex) {
            Logger.getLogger(F2_EjemploHiloJoin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
