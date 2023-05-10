/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheros.A;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Javi
 */
public class OperacionesFile {

    static File fichero = new File("FicheroEjemplo.txt");

    public static void main(String args[]) {
        ejemploOperacionesFile();

        operacionesDirectorios();
    }

    static void ejemploOperacionesFile() {
        if (fichero.exists()) {
        	
            System.out.println("Nombre del archivo " + fichero.getName());
            System.out.println("Ruta " + fichero.getPath());
            System.out.println("Ruta absoluta " + fichero.getAbsolutePath());
            System.out.println("Se puede escribir " + fichero.canRead());
            System.out.println("Se puede leer " + fichero.canWrite());
            System.out.println("Tamaño " + fichero.length());
            System.out.println("Es ruta absoluta: " + fichero.isAbsolute());
            System.out.println("Es directorio: " + fichero.isDirectory());
            System.out.println("Es fichero: " + fichero.isFile());
            File fichero2 = new File("fichero2.txt");
            System.out.println("Nombre de fichero cambiado: " + fichero.renameTo(fichero2));
            //fichero.delete();
        } else {
            try {

                //si no existe el fichero lo creamos, esta función lo que hace crear un fichero vacío.
                fichero.createNewFile();
                System.out.println("Nombre del archivo " + fichero.getName());
                System.out.println("Ruta " + fichero.getPath());
                System.out.println("Ruta absoluta " + fichero.getAbsolutePath());
                System.out.println("Se puede escribir " + fichero.canRead());
                System.out.println("Se puede leer " + fichero.canWrite());
                System.out.println("Tamaño " + fichero.length());
                System.out.println("Es ruta absoluta: " + fichero.isAbsolute());
                System.out.println("Es directorio: " + fichero.isDirectory());
                System.out.println("Es fichero: " + fichero.isFile());
                System.out.println("Nombre de fichero cambiado: " + fichero.renameTo(new File("NuevoFichero.txt")));
            } catch (IOException ex) {
                Logger.getLogger(OperacionesFile.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void operacionesDirectorios() {

        File directorio = new File("Prueba");
        //true si se ha creado el directorio
        System.out.println(directorio.mkdir());
        directorio = new File("Prueba/d1/d2");
        //true si se han creado esa serie de directorios
        System.out.println(directorio.mkdirs());

        directorio = new File("Prueba");

        String lista[] = directorio.list();

        for (String nombre : lista) {

            System.out.println("Nombre del elemento " + nombre);

        }
    }

}
