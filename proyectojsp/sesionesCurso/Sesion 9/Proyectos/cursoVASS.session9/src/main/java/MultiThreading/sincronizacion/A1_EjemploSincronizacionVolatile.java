/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiThreading.sincronizacion;

class HiloVolatile implements Runnable {

    //public volatile boolean pleaseStop = false;
    public boolean pleaseStop = false;
    private int contador = 1;

    public void run() {

        while (!pleaseStop) {
            contador++;
        }
        System.out.println("El contador es: " + contador);
    }

    public void tellMeToStop() {
        pleaseStop = true;
    }

}

public class A1_EjemploSincronizacionVolatile {

    public static void main(String args[])  {

        //Lanzamos el hilo1
        HiloVolatile t = new HiloVolatile();
        Thread hilo = new Thread(t);
        hilo.start();

        try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        t.tellMeToStop();

        System.out.println(t.pleaseStop);

    }
}
