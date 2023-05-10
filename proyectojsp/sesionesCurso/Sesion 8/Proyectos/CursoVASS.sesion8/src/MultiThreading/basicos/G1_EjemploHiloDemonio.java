/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiThreading.basicos;

public class G1_EjemploHiloDemonio extends Thread {

    public void run() {
        if (this.isDaemon()) {//checking for daemon thread
            System.out.println("daemon thread work");
        } else {
            System.out.println("user thread work");
        }
    }

    public static void main(String[] args) {
        G1_EjemploHiloDemonio t1 = new G1_EjemploHiloDemonio();//creating thread
        G1_EjemploHiloDemonio t2 = new G1_EjemploHiloDemonio();
        G1_EjemploHiloDemonio t3 = new G1_EjemploHiloDemonio();

        t1.setDaemon(true);//now t1 is daemon thread

        t1.start();//starting threads
        t2.start();
        t3.start();

        //nunca se debe de meter la ejecución de nada en un bucle infinito
        while (true) {
            //codigo del hilo demonio
        }
    }
}
