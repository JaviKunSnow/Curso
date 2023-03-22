/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiThreading.basicos;

public class C3_EjemploBasicoLlamarMetodoRun extends Thread {

    public void run() {
        System.out.println("running..."); //+ Thread.currentThread().getName());
    }

    public static void main(String args[]) {
        C3_EjemploBasicoLlamarMetodoRun t1 = new C3_EjemploBasicoLlamarMetodoRun();
        t1.run();
        
    }
}
