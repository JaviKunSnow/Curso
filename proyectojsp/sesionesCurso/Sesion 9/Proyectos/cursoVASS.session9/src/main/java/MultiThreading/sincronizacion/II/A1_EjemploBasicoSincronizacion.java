/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiThreading.sincronizacion.II;

class Tabla {

    void printTable(int n) {//method not synchronized
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread: " + Thread.currentThread().getName() + " resultado: " + n * i);
            try {
                Thread.sleep(400);
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }
}

class Hilo1 extends Thread {

    Tabla t;

    Hilo1(Tabla t) {
        this.t = t;
    }

    public void run() {
        t.printTable(5);
    }

}

class HIlo2 extends Thread {

    Tabla t;

    HIlo2(Tabla t) {
        this.t = t;
    }

    public void run() {
        t.printTable(100);
    }
}

class A1_EjemploBasicoSincronizacion {

    public static void main(String args[]) {
        Tabla obj = new Tabla();//only one object
        Hilo1 t1 = new Hilo1(obj);
        HIlo2 t2 = new HIlo2(obj);
        t1.start();
        t2.start();

    }
}
