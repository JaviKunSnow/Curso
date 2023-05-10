/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiThreading.basicos;

import java.util.logging.Level;
import java.util.logging.Logger;

class I3_EjemploHiloShutdonwHook extends Thread {

	I3_EjemploHiloShutdonwHook() {
        System.out.println("Se crea el gancho, pero no se inicializa hasta que las secuencias de cierre de la JVM se activan o por ella misma o por el usuario (Ctrl+c)");
    }

    public void run() {
        try {
            //Aquí pondríamos el código que queremos ejecutar para las tareas de cierre
            System.out.println("Se ha llegado al final del código, haciendo tareas del hilo hook");
            System.out.println("Haremos lo que nos parezca interesante si hemos almacenado este gancho");
            Thread.sleep(0);
        } catch (InterruptedException ex) {
            Logger.getLogger(I3_EjemploHiloShutdonwHook.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String[] args) throws Exception {

        Runtime r = Runtime.getRuntime();

        //Añado un hilo al almacen en el punto que me interesa, se que se va a ejecutar siempre que se acabe el programa
        r.addShutdownHook(new I3_EjemploHiloShutdonwHook());

        Thread.sleep(5000);

        System.out.println("Esperando a las tareas del hook");
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
        }
    }
}
