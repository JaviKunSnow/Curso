/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiThreading.basicos;

public class C2_EjemploBasicoIniciarHilosDosVeces extends Thread {

    public void run() {
        System.out.println("running...");
    }

    public static void main(String args[]) {
        C2_EjemploBasicoIniciarHilosDosVeces t1 = new C2_EjemploBasicoIniciarHilosDosVeces();
        t1.start();
        t1.start();
    }
}
