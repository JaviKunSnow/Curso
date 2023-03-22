package MultiThreading.basicos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Javi
 */
class Customer {

    int amount = 10000;

    synchronized void withdraw(int amount) throws InterruptedException {
        System.out.println("going to withdraw...");

        Thread.sleep(2000);

        if (this.amount < amount) {
            System.out.println("Less balance; waiting for deposit...");
            Thread.sleep(1000);
            wait();

        }
        this.amount -= amount;
        Thread.sleep(1000);
        System.out.println("withdraw completed...");
    }

    synchronized void deposit(int amount) throws InterruptedException {
        System.out.println("going to deposit...");

        Thread.sleep(2000);
        this.amount += amount;
        Thread.sleep(1000);
        System.out.println("deposit completed... ");
        notify();
        
        Object objeto;
        
        
        
        

    }
}

class Test {

    public static void main(String args[]) {
        try {
            final Customer c = new Customer();

            new Thread() {
                @Override
                public void run() {
                    try {
                        c.withdraw(15000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }.start();

            Thread.sleep(2000);

            new Thread() {
                @Override
                public void run() {
                    try {
                        c.deposit(10000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }.start();
        } catch (InterruptedException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
