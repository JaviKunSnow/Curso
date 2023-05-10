/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheros.B.texto;

/**
 *
 * @author Javi
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This program demonstrates how to read characters from a text file.
 *
 * @author www.codejava.net
 *
 */
public class B_EjemploFicheroTextoLeer {

    public static void main(String[] args) {

        LeerFichero.leer1();
        LeerFichero.leer2();
        LeerFichero.leer3();
    }
}

/**
 * This program demonstrates how to read characters from a text file using a specified charset.
 *
 * @author www.codejava.net
 *
 */
class LeerFichero {

    public static void leer1() {
        try {
            File f = new File("MyFile.txt");
            f.createNewFile();
            FileInputStream inputStream = new FileInputStream("MyFile.txt");
            InputStreamReader reader = new InputStreamReader(inputStream, "UTF-16");
            int character;

            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void leer2() {
        try {
            File f = new File("MyFile.txt");
            f.createNewFile();
            FileReader reader = new FileReader("MyFile.txt");
            int character;

            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void leer3() {
        try {
            FileReader reader = new FileReader("MyFile.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;

            while ((line = bufferedReader.readLine()) != null) {
               // System.out.println(line);
            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
   
}
