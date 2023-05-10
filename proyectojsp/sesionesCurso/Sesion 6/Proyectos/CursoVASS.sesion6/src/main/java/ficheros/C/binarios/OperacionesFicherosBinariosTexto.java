/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheros.C.binarios;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Javi
 */
public class OperacionesFicherosBinariosTexto {

    //Reservamos memoria para la variable File
    static File fichero = new File("input.dat");

    public static void main(String... args) {

        try {

            //Comprobamos que no exista el fichero para crearlo
            if (!fichero.exists()) {
                fichero.createNewFile();
            }

            //Empezamos con las funciones
            escribirSinBuffer();
            escribirConBuffer();
            escribirConBufferModificado();

            copiarSinBuffer();
            copiarConBuffer();

            comprobarFichero();

            leerSinBuffer();
            leerConBuffer();
            leerConBufferModificado();

            escribirLeerVariableBuffered();
            escribirLeerFlujosBuffered();

        } catch (IOException ex) {
            Logger.getLogger(OperacionesFicherosBinariosTexto.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    static void leerSinBuffer() {
        try {
            // Creamos un lector
            FileInputStream fis = new FileInputStream(new File("output.dat"));

            // leemos un caracter de cada vez
            int ch;
            while ((ch = fis.read()) != -1) {
                System.out.print((char) ch);
            }

            // cerramos el lector
            fis.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    static void leerConBuffer() {
        try {
            // Creamos un lector y luego creamos su buffer
            FileInputStream fis = new FileInputStream(new File("output.dat"));
            BufferedInputStream reader = new BufferedInputStream(fis);

            // leemos un caracter de cada vez
            int ch;

            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }

            // cerramos el lector
            reader.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    static void leerConBufferModificado() {
        try {
            // creamos nosotros mismos el tamaño del buffer
            int BUFFER_SIZE = 16 * 1024; // 16KB

            // creamos el lector y su buffer con el tamaño especificado
            FileInputStream fis = new FileInputStream(new File("output.dat"));
            BufferedInputStream reader = new BufferedInputStream(fis, BUFFER_SIZE);

            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }

            // cerramos el lector
            reader.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    static void escribirSinBuffer() {

        try {
            // creamos un escritor
            FileOutputStream fos = new FileOutputStream(new File("output.dat"));

            // escribimos datos en el fichero
            fos.write('c');
            String cadena = "hola";
            fos.write(cadena.getBytes());
            fos.write("\nhe saltado la línea".getBytes());

            // cerramos el escritor
            fos.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    static void escribirConBuffer() {

        try {
            // create a writer
            FileOutputStream fos = new FileOutputStream(new File("output.dat"));
            BufferedOutputStream writer = new BufferedOutputStream(fos);

            // escribimos datos en el fichero
            writer.write("Metodo escribir con Buffer".getBytes());
            writer.write("\n".getBytes());
            writer.write("Como va la cosa?".getBytes());

            //vaciamos el buffer
            writer.flush();

            //cerramos el escritor
            writer.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    static void escribirConBufferModificado() {

        try {
            // especificamos el tamaño del buffer
            int BUFFER_SIZE = 16 * 1024; // 16KB

            //creamos un escritor
            FileOutputStream fos = new FileOutputStream(new File("output.dat"));
            BufferedOutputStream writer = new BufferedOutputStream(fos, BUFFER_SIZE);

            //escribimos datos en el fichero
            writer.write("EscribirConBufferModificado".getBytes());
            writer.write("\n".getBytes());
            writer.write("Que tal?".getBytes());

            // vaciamos el buffer
            writer.flush();

            // cerramos el escritor
            writer.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    static void copiarSinBuffer() {
        String inputFile = "output.dat";
        String outputFile = "input.dat";

        try (
                FileInputStream inputStream = new FileInputStream(inputFile);
                FileOutputStream outputStream = new FileOutputStream(outputFile);) {

            int byteRead;

            while ((byteRead = inputStream.read()) != -1) {
                outputStream.write(byteRead);
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    static void copiarConBuffer() {
        String inputFile = "input.dat";
        String outputFile = "output.dat";
        final int BUFFER_SIZE = 4096; // 4KB

        try (
                FileInputStream inputStream = new FileInputStream(inputFile);
                FileOutputStream outputStream = new FileOutputStream(outputFile);) {

            byte[] buffer = new byte[BUFFER_SIZE];

            while (inputStream.read(buffer) != -1) {
                outputStream.write(buffer);
            }

            outputStream.flush();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    static void comprobarFichero() {

        String inputFile = "input.dat";
        int[] pngSignature = {137, 80, 78, 71, 13, 10, 26, 10};

        try (
                FileInputStream inputStream = new FileInputStream(inputFile);) {
            int[] headerBytes = new int[8];

            boolean isPNG = true;

            for (int i = 0; i < 8; i++) {
                headerBytes[i] = inputStream.read();
                if (headerBytes[i] != pngSignature[i]) {
                    isPNG = false;
                    break;
                }
            }

            System.out.println("Is PNG file? " + isPNG);

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    static void escribirLeerVariableBuffered() {
        String inputFile = "input.dat";
        String outputFile = "output.dat";

        final int BUFFER_SIZE = 8192; // 4KB
        try (
                BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(inputFile));
                BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(outputFile));) {

            byte[] buffer = new byte[BUFFER_SIZE];

            while (inputStream.read(buffer) != -1) {
                outputStream.write(buffer);
            }

            // vaciamos el buffer
            outputStream.flush();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    static void escribirLeerFlujosBuffered() {
        String inputFile = "input.dat";
        String outputFile = "output.dat";

        final int BUFFER_SIZE_ARRAY = 8192; // 4KB
        final int BUFFER_SIZE_PARAMETRO = 8192; // 4KB

        try (
                BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(inputFile), BUFFER_SIZE_PARAMETRO);
                BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(outputFile), BUFFER_SIZE_PARAMETRO);) {

            //Creamos el array para almacenar los bytes y utilizarlo para pasarlo al escritor
            byte[] buffer = new byte[BUFFER_SIZE_ARRAY];

            while (inputStream.read(buffer) != -1) {
                outputStream.write(buffer);
            }

            // vaciamos el buffer
            outputStream.flush();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
