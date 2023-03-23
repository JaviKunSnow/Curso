/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiThreading.sincronizacion;

import java.io.IOException;

class HiloVolatile2 implements Runnable {

    //COMENTAR Y DESCOMENTAR LAS VARIABLES PARA PODER HACER LAS PRUEBAS EN LOS  CASOS
      public static  boolean pleaseStop = false;
   // public volatile boolean pleaseStop = false;
  //  public static boolean pleaseStop = false;
   // public boolean pleaseStop = false;
    private int contador = 1;

    //En el metodo run lo que vamos a hacer es solo incrementar el contador
    public void run() {

        while (!pleaseStop) {
            contador++;
        }
        
        //Cuando cambiemos la variable de valor se mostrar� este mensaje
        System.out.println("El contador es: " + Thread.currentThread().getName() + " y ha cotado hasta: " + contador);
        
    }

    //Este metodo lo vamos a utilizar para parar el funcioanmiento del programa
    public void tellMeToStop() {
    	System.out.println("Cambiamos el valor de la variable stop");
        pleaseStop = true;
    }

}

class A2_EjemploSincronizacionVolatile {

    public static void main(String args[]) throws InterruptedException {

        //Creamos y lanzamos un hilo
        HiloVolatile2 t = new HiloVolatile2();
        Thread hilo = new Thread(t);
        hilo.setName("hilo1");
        hilo.start();

        //Creamos y lanzamos otro hilo
        HiloVolatile2 t2 = new HiloVolatile2();
        Thread hilo2 = new Thread(t2);
        hilo2.setName("hilo2");
        hilo2.start();

        //Dorminos el programa para que pueda operar un poco
        Thread.sleep(1000);

        //Desde uno de los hilos paramos cambiamos el valor de la variable
        t.tellMeToStop();
        //t2.tellMeToStop();
        
        //Mostramos el valor de las variables para ver si han cambiado el estado correctamente
        System.out.println("Valor de la variable desde el hilo1 " + t.pleaseStop);
        System.out.println("Valor de la variable desde el hilo2 " + t2.pleaseStop);

    }
}
