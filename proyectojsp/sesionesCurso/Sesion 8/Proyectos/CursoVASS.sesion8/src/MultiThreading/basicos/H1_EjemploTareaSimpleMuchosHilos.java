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
public class H1_EjemploTareaSimpleMuchosHilos extends Thread {

    public void run() {
        System.out.println("task one");
    }

    public static void main(String args[]) {
        H1_EjemploTareaSimpleMuchosHilos t1 = new H1_EjemploTareaSimpleMuchosHilos();
        H1_EjemploTareaSimpleMuchosHilos t2 = new H1_EjemploTareaSimpleMuchosHilos();
        H1_EjemploTareaSimpleMuchosHilos t3 = new H1_EjemploTareaSimpleMuchosHilos();

        t1.start();
        t2.start();
        t3.start();
    }

}
