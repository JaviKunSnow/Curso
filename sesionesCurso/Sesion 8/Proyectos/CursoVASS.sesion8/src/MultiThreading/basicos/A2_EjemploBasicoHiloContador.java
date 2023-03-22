/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiThreading.basicos;

class A2_EjemploBasicoHiloContador extends Thread {

    public static int contador = 0;

    public void run() {
        for (int i = 0; i < 1000; i++) {
            this.contador++;
        }
    }

    public void mostrar() {
        System.out.println(this.contador);
    }

    public static void main(String args[]) {
        A2_EjemploBasicoHiloContador t1 = new A2_EjemploBasicoHiloContador();
        t1.start();

        //La ejecucion es correcta por que la hace un solo proceso sobre la variable, todo el tiempo.
        //Si lanzamos un conjunto de hilos que operen a la vez obtendremos un valor indeterminado
        for (int i = 0; i < 1000; i++) {
            A2_EjemploBasicoHiloContador hilo = new A2_EjemploBasicoHiloContador();
            hilo.start();
            

        }

        t1.mostrar();
        
    }
}
