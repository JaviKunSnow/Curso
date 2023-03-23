package MultiThreading.sincronizacion.II;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
class Table11 {

    Object objeto = new Object();

    void printTableBlock(int n) {

    	
    	String cadena;   	
    	
        synchronized (objeto) {
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

    synchronized void printTableMethod(int n) {

        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread: " + Thread.currentThread().getName() + " resultado: " + n * i);
            try {
                Thread.sleep(400);
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }//end of the method
}

class MyThread extends Thread {

    Table11 t;

    MyThread(Table11 t) {
        this.t = t;
    }

    public void run() {
        t.printTableMethod(5);
        //t.printTableBlock(5);

    }

}

class MyThread2 extends Thread {

    Table11 t;

    MyThread2(Table11 t) {
        this.t = t;
    }

    public void run() {
        t.printTableMethod(100);
        t.printTableBlock(100);

    }
}

public class A2_EjemploBloqueSincronizado {

    public static void main(String args[]) {
        Table11 obj = new Table11();//only one object
        Table11 obj2 = new Table11();
        MyThread t1 = new MyThread(obj);
        MyThread2 t2 = new MyThread2(obj);
        MyThread t3 = new MyThread(obj);
        MyThread2 t4 = new MyThread2(obj);
        t1.setName("1");
        t1.start();
        t2.setName("2");
        t2.start();
        
        t3.start();
        t4.start();
    }
}
