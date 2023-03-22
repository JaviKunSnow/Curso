/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiThreading.basicos;

class B1_EjemploBasicoRunnable implements Runnable  {

    public void run() {
        System.out.println("Mensaje desde el metodo run de la interfaz");
    }

    public static void main(String args[]) {
        B1_EjemploBasicoRunnable t1 = new B1_EjemploBasicoRunnable();
        Thread hilo = new Thread(t1);
        hilo.start();
    }
}
