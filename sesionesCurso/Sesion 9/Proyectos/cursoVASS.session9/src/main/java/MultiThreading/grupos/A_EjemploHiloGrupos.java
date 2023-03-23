/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiThreading.grupos;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Javi
 */
public class A_EjemploHiloGrupos implements Runnable {

    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        try {
            A_EjemploHiloGrupos runnable = new A_EjemploHiloGrupos();
            ThreadGroup tg1 = new ThreadGroup("GrupoCreado");

            //Metemos en el constructor el grupo al que pertenece
            Thread t1 = new Thread(tg1, runnable, "one");
            t1.start();
            Thread t2 = new Thread(tg1, runnable, "two");
            t2.start();
            Thread t3 = new Thread(tg1, runnable, "three");
            t3.start();

            Thread.sleep(500);
            System.out.println("Thread Group Name: " + tg1.getName());
            tg1.list();
            

            //Podriamos hacer mediante esta variable acciones para todo los hilos de este grupo de forma conjunta
        } catch (InterruptedException ex) {
            Logger.getLogger(A_EjemploHiloGrupos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
