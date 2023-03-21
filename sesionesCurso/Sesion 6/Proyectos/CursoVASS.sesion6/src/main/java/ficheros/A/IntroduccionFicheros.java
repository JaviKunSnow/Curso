/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheros.A;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.Scanner;

/**
 *
 * @author Javi
 */
public class IntroduccionFicheros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //CADA VEZ QUE QUEREMOS REALIZAR CIERTAS ACCIONES SOBRE LOS FICHEROS TENEMOS QUE CONTROLAR QUE NO SE PUEDAN PRODUCIR ERRORES EN TIEMPO DE EJECUCION
        //PARA ELLO UTILIZAMOS LOS BLOQUE TRY CATCH, EL IDE NOS SUGIERE CUANDO DEBEMOS DE INTRODUCIRLOS, PERO SERA TRABAJO NUESTRO HACER LA ORGANIZACION
        //ESTO LO VEREMOS CUANDO HAYAMOS PROBADO LAS ACCIONES PARA MANEJAR FICHEROS
        //IR DESBLOQUEANDO LOS METODOS PARA PROBAR SU EJECUCION
        crearFichero();
        escribirFichero1();
        escribirFichero2();
        leerFichero();
        obtenerRutas();
        mostrarFicheros();
        mostrarInfoFicheros();

    }

    public static void crearFichero() {
        //Este ejemplo nos presenta como podemos crear de manera simple un fichero.
        try {
            File file = new File("alumnos.dat");
            if (file.createNewFile()) {
                System.out.println("New File is created!");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void leerFichero() {
        // Fichero del que queremos leer
        File fichero = new File("javaFile123.txt");
        Scanner s = null;

        try {
            // Leemos el contenido del fichero
            System.out.println("... Leemos el contenido del fichero ...");
            s = new Scanner(fichero);

            // Leemos linea a linea el fichero
            while (s.hasNextLine()) {
                String linea = s.nextLine(); 	// Guardamos la linea en un String
                System.out.println(linea);      // Imprimimos la linea
            }

        } catch (Exception ex) {
            System.out.println("Mensaje: " + ex.getMessage());
        } finally {
            // Cerramos el fichero tanto si la lectura ha sido correcta o no
            try {
                if (s != null) {
                    s.close();
                }
            } catch (Exception ex2) {
                System.out.println("Mensaje 2: " + ex2.getMessage());
            }
        }
    }

    public static void escribirFichero1() {
        String[] lineas = {"Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "..."};
        /**
         * FORMA 1 DE ESCRITURA *
         */
        FileWriter fichero = null;
        try {

            fichero = new FileWriter("javaFile123.txt");

            // Escribimos linea a linea en el fichero
            for (String linea : lineas) {
                fichero.write(linea + "\n");
            }

            fichero.close();

        } catch (Exception ex) {
            System.out.println("Mensaje de la excepción: " + ex.getMessage());
        }

    }

    public static void escribirFichero2() {
        String[] lineas = {"Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "..."};

        /**
         * FORMA 2 DE ESCRITURA. Con el fichero codificado en UTF-8 * Vemores
         * este objeto con detalle mas adelante
         */
        Writer out = null;
        try {
            out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("javaFile123.txt"), "UTF-8"));

            // Escribimos linea a linea en el fichero
            for (String linea : lineas) {
                try {
                    out.write(linea + "\n");
                } catch (IOException ex) {
                    System.out.println("Mensaje excepcion escritura: " + ex.getMessage());
                }
            }

        } catch (UnsupportedEncodingException | FileNotFoundException ex2) {
            System.out.println("Mensaje error 2: " + ex2.getMessage());
        } finally {
            try {
                out.close();
            } catch (IOException ex3) {
                System.out.println("Mensaje error cierre fichero: " + ex3.getMessage());
            }
        }

    }

    public static void obtenerRutas() {

        String path = "";
        boolean bool = false;
        try {
            // creamos un fichero
            File file = new File("testFile1.txt");
            file.createNewFile();
            System.out.println(file);

            // creamos un fichero 2 a traves de su canonico
            File file2 = file.getCanonicalFile();

            // si se ha creado mostramos true 
            System.out.println(file2);
            bool = file2.exists();

            // devolvemos la ruta absoluta
            path = file2.getAbsolutePath();
            System.out.println(bool);

            // en caso de que el fichero exista 
            if (bool) {
                // imprimimos  
                System.out.print(path + " Exists? " + bool);
            }
        } catch (Exception e) {
            // en caso de que haya errores, sacamos un mensaje. 
            e.printStackTrace();
        }
    }

    public static void mostrarFicheros() {

        //Voy a mostrar, en mi caso, el nombre de los ficheros que tengo en la carpeta documents,
        //yo ahora mismo tengo esta ruta absoluta C:\Users\Javi\Documents\NetBeansProjects\FicherosJava
        //establezco la ruta relativa que voy a utilizar desde mi carpeta de proyecto, que en este caso es bajar dos niveles
        File f = new File("../../");
        //Obtengo la lista de nombres de ficheros.
        String filenames[] = f.list();

        //lo proceso con un stream, es como un bucle for
        for (String filename : filenames) {
            System.out.println(filename);
        }

    }

    public static void mostrarInfoFicheros() {
        File dir = new File("../../");

        File files[] = dir.listFiles();
        for (File file : files) {
            System.out.println(file.getName() + " Can Write: " + file.canWrite() + "Is Hidden: " + file.isHidden() + " Length: " + file.length() + " bytes");

        }

    }

}
