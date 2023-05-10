///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package Multithreading.Sincronizacion;
//
///**
// *
// * @author Javi
// */
//class Table100 {
//
//    synchronized static void printTable(int n) {
//        for (int i = 1; i <= 10; i++) {
//            System.out.println("Thread: " + Thread.currentThread().getName() + " resultado: " + n * i);
//            try {
//                Thread.sleep(400);
//            } catch (Exception e) {
//            }
//        }
//    }
//}
//
//class MyThread3 extends Thread {
//
//    public void run() {
//        Table100.printTable(1);
//    }
//}
//
//class MyThread4 extends Thread {
//
//    public void run() {
//        Table100.printTable(10);
//    }
//}
//
//class MyThread7 extends Thread {
//
//    public void run() {
//        Table100.printTable(100);
//    }
//}
//
//class MyThread8 extends Thread {
//
//    public void run() {
//        Table100.printTable(1000);
//    }
//}
//
//public class C_EjemploSincronizacionEstatica {
//
//    public static void main(String t[]) {
//        MyThread3 t1 = new MyThread3();
//        MyThread4 t2 = new MyThread4();
//        MyThread7 t3 = new MyThread7();
//        MyThread8 t4 = new MyThread8();
//        t1.start();
//        t2.start();
//        t3.start();
//        t4.start();
//    }
//}
package MultiThreading.sincronizacion.II;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
class Table1 {

    static synchronized void printTableMethod(int n) {

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

class MyThread5 extends Thread {

   Table1 t;

   MyThread5(Table1 t) {
       this.t = t;
   }

   public void run() {
       t.printTableMethod(1);
       //  t.printTableBlock(5);
   }

}

class MyThread6 extends Thread {

   Table1 t;

   MyThread6(Table1 t) {
       this.t = t;
   }

   public void run() {
       t.printTableMethod(10);
       // t.printTableBlock(100);
   }
}

class MyThread7 extends Thread {

   Table1 t;

   MyThread7(Table1 t) {
       this.t = t;
   }

   public void run() {
       t.printTableMethod(100);
       //  t.printTableBlock(5);
   }

}

class MyThread8 extends Thread {

   Table1 t;

   MyThread8(Table1 t) {
       this.t = t;
   }

   public void run() {
       t.printTableMethod(1000);
       // t.printTableBlock(100);
   }
}

class B_EjemploSincronizacionEstatica {

   public static void main(String args[]) {
       Table1 obj = new Table1();
       Table1 obj2 = new Table1();
       MyThread5 t1 = new MyThread5(obj2);
       MyThread6 t2 = new MyThread6(obj);
       MyThread7 t3 = new MyThread7(obj2);
       MyThread8 t4 = new MyThread8(obj);
       t1.setName("1");
       t2.setName("2");
       t3.setName("3");
       t4.setName("4");
       //Siempre ponemos primero el hilo que queremos que se  primero
       t1.start();
       t4.start();
       t3.start();
       t2.start();
       //luego empezamos por orden de abajo arriba

       //Si lo hacemos para dos objetos table, veremos que se puede producir interferencia t entrar otro hilo primero esto se resolvería con synchronización statica
   }
}