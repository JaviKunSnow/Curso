/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiThreading.basicos;

class B2_EjemploBasicoRunnable implements Runnable {

    public static int contador = 0;

    public void run() {

        for (int i = 0; i < 1000; i++) {
            this.contador++;
        }

    }

    public void mostrar() {
        System.out.println(this.contador);
    }

    public static void main(String args[]) {
        B2_EjemploBasicoRunnable t1 = new B2_EjemploBasicoRunnable();
        Thread hilo = new Thread(t1);
      //  hilo.start();

        t1.mostrar();
        
        for (int i = 0; i < 1000; i++) {
            hilo = new Thread(t1);
            hilo.start();

        }

        t1.mostrar();
    }
}
