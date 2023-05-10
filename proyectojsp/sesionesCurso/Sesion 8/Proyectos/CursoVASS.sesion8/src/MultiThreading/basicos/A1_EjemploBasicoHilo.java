/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiThreading.basicos;

class A1_EjemploBasicoHilo extends Thread {

    public void run() {
        System.out.println("thread is running..." + Thread.currentThread().getName() );
    }

    public static void main(String args[]) throws InterruptedException {
        A1_EjemploBasicoHilo t1 = new A1_EjemploBasicoHilo();   
        t1.start();
        Thread.sleep(10000);        
    }

}
