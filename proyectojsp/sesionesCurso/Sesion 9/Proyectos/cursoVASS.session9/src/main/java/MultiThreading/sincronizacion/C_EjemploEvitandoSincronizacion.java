/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiThreading.sincronizacion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


//******************EJEMPLO BIEN HECHO*********************
class HiloEvitar extends Thread {

	
	ArrayList lista = (ArrayList) Collections.synchronizedList(new ArrayList<Integer>());
	
	
    //pongo los atributos publicos para simplificar los ejemplos
    public static int tam = 8;
    public static int[] vec = new int[tam];

    private final int inicio;
    private final int fin;

    HiloEvitar(int inicio, int fin) {
        this.inicio = inicio;
        this.fin = fin;
    }

    @Override
    public void run() {
        for (int i = inicio; i < fin; i++) {
            HiloEvitar.vec[i] *= 10;
        }
    }
}

public class C_EjemploEvitandoSincronizacion {

    public static void main(String[] args) throws InterruptedException {
        Random rand = new Random(System.nanoTime());

        for (int i = 0; i < HiloEvitar.tam; i++) {
            HiloEvitar.vec[i] = rand.nextInt(10) + 1;
        }

        //Partimos la estructura para que una parte la haga cada hilo;
        HiloEvitar h1 = new HiloEvitar(0, (HiloEvitar.tam / 2));
        HiloEvitar h2 = new HiloEvitar(HiloEvitar.tam / 2, HiloEvitar.tam);

        h1.start();
        h2.start();
        //
        //Dirnunis el hilo principal para que puedan tener tiempo los subprocesos de acabar
        Thread.sleep(1000);

        for (int i = 0; i < HiloEvitar.tam; i++) {
            System.out.println(HiloEvitar.vec[i]);

        }

    }
}
