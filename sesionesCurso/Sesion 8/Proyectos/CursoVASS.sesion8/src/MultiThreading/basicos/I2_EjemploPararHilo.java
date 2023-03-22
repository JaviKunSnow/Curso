/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiThreading.basicos;

import java.util.concurrent.TimeUnit;

/**
 *
 * @author Javi
 */
public class I2_EjemploPararHilo {



        public static void main(String args[]) throws InterruptedException {
            Server myServer = new Server();
            Thread t1 = new Thread(myServer, "T1");
            t1.start();

            Thread.sleep(1000);

            System.out.println(Thread.currentThread().getName() + " is stopping Server thread");
            myServer.stop(); //Let's wait to see server thread stopped

            TimeUnit.MILLISECONDS.sleep(200);
            System.out.println(Thread.currentThread().getName() + " is finished now");
        }

    }

    class Server implements Runnable {

        private boolean exit = false;

        public void run() {
        	
            while (!exit) {
                System.out.println("Server is running.....");
            }
            System.out.println("Server is stopped....");
        }

        public void stop() {
            exit = true;
        }
    } 

