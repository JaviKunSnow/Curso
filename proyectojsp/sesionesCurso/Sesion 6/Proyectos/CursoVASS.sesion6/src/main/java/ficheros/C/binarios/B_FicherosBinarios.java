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
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author Javi
 */
public class B_FicherosBinarios {

    public static void main(String[] args) {

//        ManejarFicherosBinarios.copiarFichero();
//        ManejarFicherosBinarios.copiarFicheroDeUnaVez();
//        ManejarFicherosBinarios.copiarFicheroTrozos();
        ManejarFicherosBinarios.comprobarPNG();
    }

}

class ManejarFicherosBinarios {

    private static final int BUFFER_SIZE = 4096; // 4KB

    public static void copiarFichero() {

        /**
         * Copy one file to another using low level byte streams, one byte at a time.
         *
         */
        try (
                InputStream inputStream = new FileInputStream(new File("MyFile.txt"));
                OutputStream outputStream = new FileOutputStream(new File("MyFileOutput.txt"))) {

            int byteRead;

            while ((byteRead = inputStream.read()) != -1) {
                outputStream.write(byteRead);
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Copy one file to another using low level byte streams, read and write a whole.at once.
     */
    public static void copiarFicheroDeUnaVez() {
        try (
                InputStream inputStream = new FileInputStream(new File("MyFile.txt"));
                OutputStream outputStream = new FileOutputStream(new File("MyFileOutput.txt"))) {

            long fileSize = new File("MyFile.txt").length();

            byte[] allBytes = new byte[(int) fileSize];

            inputStream.read(allBytes);

            outputStream.write(allBytes);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Copy one file to another using low level byte streams, 4KB at a time.
     *
     */
    public static void copiarFicheroTrozos() {

        try (
                InputStream inputStream = new FileInputStream(new File("MyFile.txt"));
                OutputStream outputStream = new FileOutputStream(new File("MyFileOutput.txt"))) {

            byte[] buffer = new byte[BUFFER_SIZE];

            while (inputStream.read(buffer) != -1) {
                outputStream.write(buffer);
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

//    This program checks whether a file is of PNG image format or not,
//  by analysing its first 8 bytes.
    public static void comprobarPNG() {

        int[] pngSignature = {137, 80, 78, 71, 13, 10, 26, 10};

        try (
                InputStream inputStream = new FileInputStream(new File("./foto.png"));) {
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

    public static void copiarFicheroBuffer() {

        int bufferSize = 16384; // 16KB buffer size

        try (
                //Sin tamaño de Buffer
                InputStream inputStream = new BufferedInputStream(new FileInputStream(new File("MyFile.txt")));
                OutputStream outputStream = new BufferedOutputStream(new FileOutputStream(new File("MyFileOutput.txt"))) //Con tamaño de Buffer
                //                InputStream inputStream = new BufferedInputStream(new FileInputStream(new File("MyFile.txt")), bufferSize);
                //                OutputStream outputStream = new BufferedOutputStream(new FileOutputStream(new File("MyFileOutput.txt")), bufferSize)
                //No subir esta linea para poder comentar/descomentar más fácil
                ;) {

            byte[] buffer = new byte[BUFFER_SIZE];

            while (inputStream.read(buffer) != -1) {
                outputStream.write(buffer);
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    public static void copiarFicheroNewIOAPI() {

        int bufferSize = 16384; // 16KB buffer size

        try {
            long start = System.currentTimeMillis();

            byte[] allBytes = Files.readAllBytes(Paths.get("MyFile.txt"));
            Files.write(Paths.get("MyFileOutpu.txt"), allBytes);

            long end = System.currentTimeMillis();
            System.out.println("Copied in " + (end - start) + " ms");
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

}
