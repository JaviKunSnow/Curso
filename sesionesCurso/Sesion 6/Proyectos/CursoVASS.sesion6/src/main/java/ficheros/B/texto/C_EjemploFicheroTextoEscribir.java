/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheros.B.texto;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 *
 * @author Javi
 */
public class C_EjemploFicheroTextoEscribir {

    public static void main(String[] args) {

        EscribirFichero.escribirFichero1();
        EscribirFichero.escribirFichero2();
        EscribirFichero.escribirFichero3();
    }

}

class EscribirFichero {

    public static void escribirFichero1() {
        try {
            FileWriter writer = new FileWriter("MyFile.txt", true);
            writer.write("Hello World");
            writer.write("\r\n");   // write new line
            writer.write("Good Bye!");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void escribirFichero2() {
        try {
            FileWriter writer = new FileWriter("MyFile.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);

            bufferedWriter.write("Hello World");
            bufferedWriter.newLine();
            bufferedWriter.write("See You Again!");

            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void escribirFichero3() {
        try {
            FileOutputStream outputStream = new FileOutputStream("MyFile.txt", true);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, "UTF-16");
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

            bufferedWriter.write("Xin chào");
            bufferedWriter.newLine();
            bufferedWriter.write("Hẹn gặp lại!");

            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
