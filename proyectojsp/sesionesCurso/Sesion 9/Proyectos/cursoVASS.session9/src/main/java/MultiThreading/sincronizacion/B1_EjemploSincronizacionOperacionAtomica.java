/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiThreading.sincronizacion;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import java.util.logging.Logger;

class HiloAtomico implements Runnable {

    private static int contador = 0;
    private static AtomicInteger contadorAtomico = new AtomicInteger(0);

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            contadorAtomico.incrementAndGet();
           // contador++;
        }
    }

    
    public static int getContador() {
       return contadorAtomico.get();
        //return contador;
    }
    
    

}

class B1_EjemploSincronizacionOperacionAtomica {

    public static void main(String args[]) {

       
        for (int i = 0; i < 1000; i++) {
            new Thread(new HiloAtomico()).start();
        }

        try {
            Thread.sleep(2500);
        } catch (InterruptedException ex) {
            Logger.getLogger(B1_EjemploSincronizacionOperacionAtomica.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Resultado: " + HiloAtomico.getContador());

    }
}
