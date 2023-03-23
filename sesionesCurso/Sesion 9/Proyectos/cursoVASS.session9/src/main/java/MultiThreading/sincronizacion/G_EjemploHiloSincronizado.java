/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiThreading.sincronizacion;

import java.util.ArrayList;

class HiloSincronizado implements Runnable {

    public static int contador = 0;
    private static Object objeto = new Object();

    @Override
    public void run() {

        for (int i = 0; i < 20000; i++) {

            //Sincronizamos el contador en un bloque para ello podemos utilizar cualquier variable
            synchronized (objeto) {
                contador++;
            }
            //Podemos hacerlo con un bloque o con un metodo que este en otra clase y que maneje la variable compartida
            // OperacionesSincronizadas.incrementar();
        }
    }

    //sincronizamos un método estatico
    public static synchronized int getContador() {
        return contador;
    }

    //sincronizamos un metodo
    public synchronized void unMetodo() {
        System.out.println("El codigo de este metodo esta sincronizado");
    }

}

//Otro fichero que contenga esta clase
class OperacionesSincronizadas {
    public static synchronized void incrementar() {
        HiloSincronizado.contador++;
    }
}

class G_EjemploHiloSincronizado {

    public static void main(String args[]) throws InterruptedException {

        Runtime runtime = Runtime.getRuntime();

        int nNucleos = runtime.availableProcessors();

        //Es recomendable mandaar tantos hilos a la cpu como nucleos tenemos, pero se pueden mandar mas
        System.out.println(nNucleos);

       

        for (int i = 0; i < nNucleos; i++) {
            new Thread(new HiloSincronizado()).start();
           
        }

        //Dormimos el hilo principal para que el resto pueda completar su trabajo
        Thread.sleep(3000);

        System.out.println("Resultado: " + HiloSincronizado.getContador());

    }
}
