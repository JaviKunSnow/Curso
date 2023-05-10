/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheros.D.aleaorios;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 *
 * @author Javier
 */

/*Ejemplo 1: Programa Java que pide un número entero por teclado y lo añade al final de un fichero binario enteros.dat que contiene números enteros. El programa utiliza un método mostrarFichero() que se llama dos veces. La primera muestra el contenido del fichero antes de añadir el nuevo número y la segunda llamada muestra el fichero después de añadirlo.
package random1;*/


 class OperacionesRandomAccessFile {

    static Scanner sc = new Scanner(System.in);
    static RandomAccessFile fichero = null;

    public static void main(String[] args) {
        int numero;
        try {
            //se abre el fichero para lectura y escritura
            fichero = new RandomAccessFile("enteros.dat", "rw");
            mostrarFichero(); //muestra el contenido original del fichero
            System.out.print("Introduce un número entero para añadir al final del fichero: ");                    
            numero = sc.nextInt(); //se lee el entero a añadir en el fichero
            fichero.seek(fichero.length()); //nos situamos al final del fichero
            fichero.writeInt(numero);       //se escribe el entero
            mostrarFichero();//muestra el contenido del fichero después de añadir el número

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                if (fichero != null) {
                    fichero.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void mostrarFichero() throws IOException {
        int n=0;
        long tamaño = 0;        
        try {
            fichero.seek(0); //nos situamos al principio
            //Controlando el tamaño del registro deberíamos de saber cuantas iteraciones hacer
            //evitando de esta manera el tener que recurrir a la excepcion para salir
            while (tamaño<fichero.length()) {
            	      	
                System.out.println(fichero.getFilePointer());  
                n = fichero.readInt();//se lee  un entero del fichero
                tamaño+=4;//incrementamos la variable en el numero de bytes que leemos
                System.out.println("el valor de n es " + n);  //se muestra en pantalla
            }
        } catch (EOFException e) {
            System.out.println("Fin de fichero");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}