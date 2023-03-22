/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiThreading.basicos;

class D1_DormirHilos extends Thread {

    public void run() {
        for (int i = 1; i < 5; i++) {
            //try {
               // Thread.sleep(500);                
//            } catch (InterruptedException e) {
//                System.out.println(e);
//            }
            System.out.println(i);
        }
    }

    public static void main(String args[]) {
    	D1_DormirHilos t1 = new D1_DormirHilos();
    	D1_DormirHilos t2 = new D1_DormirHilos();
        t1.start();        
        t2.start();
    }
}
