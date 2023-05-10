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
public class J1_OperacionesBasicasHilos {

    public static void main(String args[]) throws InterruptedException {

        //Ejemplo Thread
        EjemploThread hilo1 = new EjemploThread();
        hilo1.setDaemon(true);
        hilo1.setName("HiloClase");
        hilo1.setPriority(Thread.NORM_PRIORITY);
        hilo1.start();

        EjemploRunnable intHilo = new EjemploRunnable();
        Thread hilo2 = new Thread(intHilo);
        hilo2.setDaemon(true);
        hilo2.setName("HiloRunnable");
        hilo2.setPriority(Thread.NORM_PRIORITY);
        hilo2.start();

        System.out.println("Mensaje join");
        hilo1.join();
        hilo2.join();

        //
        System.out.println("* Información Hilo Principal: " + Thread.currentThread());
        System.out.println("\t- Nombre: " + Thread.currentThread().getName());
        System.out.println("\t- Prioridad: " + Thread.currentThread().getPriority());
        System.out.println("\t- Informacion Grupo: " + Thread.currentThread().getThreadGroup());
        System.out.println("\t\t+Nombre de grupo: " + Thread.currentThread().getThreadGroup().getName());
        System.out.println("\t\t+Prioridad Máxima de grupo: " + Thread.currentThread().getThreadGroup().getMaxPriority());
        System.out.println("");

        System.out.println("El estado del hilo principal es: " + Thread.currentThread().getState());

        System.out.println("¿Esta vivo el hilo Prinicipal?" + Thread.currentThread().isAlive());
        System.out.println("¿Esta vivo el hilo 1?" + hilo1.isAlive());
        System.out.println("¿Esta vivo el hilo 2?" + hilo2.isAlive());
        System.out.println("¿Es demonio el hilo principal?" + Thread.currentThread().isDaemon());
        System.out.println("¿Está interrumpido el hilo principal?" + Thread.currentThread().isInterrupted());

    }
}

class EjemploThread extends Thread {

    public void run() {
        try {
            System.out.println("Mensaje desde la clase");

//        Mostramos aquí otro mensaje de current Thread para ver que salen los datos referentes a este hilo
            System.out.println(Thread.currentThread());
//metodo activeCount
            System.out.println("Numero de hilos activos estimado:" + Thread.activeCount());

//currentThread  [nombre, prioridad, grupo]
            System.out.println("* Información Hilo Clase: " + Thread.currentThread());
            System.out.println("\t- Nombre: " + Thread.currentThread().getName());
            System.out.println("\t- Prioridad: " + Thread.currentThread().getPriority());
            System.out.println("\t- Informacion Grupo: " + Thread.currentThread().getThreadGroup());
            System.out.println("\t\t+Nombre de grupo: " + Thread.currentThread().getThreadGroup().getName());
            System.out.println("\t\t+Prioridad Máxima de grupo: " + Thread.currentThread().getThreadGroup().getMaxPriority());
            System.out.println("");

            System.out.println("El estado del hilo Clase es: " + Thread.currentThread().getState());

            System.out.println("¿Esta vivo el hilo Clase?" + Thread.currentThread().isAlive());
            System.out.println("¿Es demonio el hilo Clase?" + Thread.currentThread().isDaemon());
            System.out.println("¿Está interrumpido el hilo Clase?" + Thread.currentThread().isInterrupted());
            System.out.print("Paramos la ejecución tres segundos");
            Thread.sleep(100);
            System.out.print(".");
            Thread.sleep(1000);
            System.out.print(".");
            Thread.sleep(1000);
            System.out.print(".");
            Thread.sleep(900);
            System.out.println("Continuamos");

//Ejemplo de join, veremos como podemos hacer que el hilo principal espere al hilo secundario hasta que acabe lo que haga
        } catch (InterruptedException ex) {
            Logger.getLogger(EjemploThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

class EjemploRunnable implements Runnable {

    public void run() {
        try {
            System.out.println("Mensaje desde la interfaz");

//        Mostramos aquí otro mensaje de current Thread para ver que salen los datos referentes a este hilo
            System.out.println(Thread.currentThread());
//metodo activeCount
            System.out.println("Numero de hilos activos estimado:" + Thread.activeCount());

//currentThread  [nombre, prioridad, grupo]
            System.out.println("* Información Hilo Interfaz: " + Thread.currentThread());
            System.out.println("\t- Nombre: " + Thread.currentThread().getName());
            System.out.println("\t- Prioridad: " + Thread.currentThread().getPriority());
            System.out.println("\t- Informacion Grupo: " + Thread.currentThread().getThreadGroup());
            System.out.println("\t\t+Nombre de grupo: " + Thread.currentThread().getThreadGroup().getName());
            System.out.println("\t\t+Prioridad Máxima de grupo: " + Thread.currentThread().getThreadGroup().getMaxPriority());
            System.out.println("");

            System.out.println("El estado del hilo Runnable es: " + Thread.currentThread().getState());

            System.out.println("¿Esta vivo el hilo Interfaz?" + Thread.currentThread().isAlive());
            System.out.println("¿Es demonio un proceso Interfaz?" + Thread.currentThread().isDaemon());
            System.out.println("¿Está interrumpido el hilo Interfaz?" + Thread.currentThread().isInterrupted());
            System.out.print("Paramos la ejecución tres segundos");
            Thread.sleep(100);
            System.out.print(".");
            Thread.sleep(1000);
            System.out.print(".");
            Thread.sleep(1000);
            System.out.println(".");
            Thread.sleep(900);
            System.out.println("Continuamos");
        } catch (InterruptedException ex) {
            Logger.getLogger(EjemploRunnable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
