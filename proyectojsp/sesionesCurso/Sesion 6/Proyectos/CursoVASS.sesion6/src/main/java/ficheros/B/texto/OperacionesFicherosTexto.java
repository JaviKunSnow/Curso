/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheros.B.texto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Javi
 */
public class OperacionesFicherosTexto {

    public static void main(String... args) {

        String fichero = "fichero.txt";

        escribirUsandoBuffer();
        escribirAñadiendoAlFinal();
        leerFicheroconBuffer(fichero);
        cambiarVocales("Vamos a hacer una prueba con esta linea que tiene todo tipo de vocales Aureliano");

    }

    static void leerFicheroconBuffer(String fileName) {

        BufferedReader br = null;
        try {

            br = new BufferedReader(new FileReader(fileName));
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(OperacionesFicherosTexto.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(OperacionesFicherosTexto.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                br.close();
            } catch (IOException ex) {
                Logger.getLogger(OperacionesFicherosTexto.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    static void escribirUsandoBuffer() {
        BufferedWriter bw = null;
        try {
            String fileContent = "Esta es la línea que vamos a escribir\r\n";
            bw = new BufferedWriter(new FileWriter("fichero.txt"));
            bw.write(fileContent);
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(OperacionesFicherosTexto.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                bw.close();
            } catch (IOException ex) {
                Logger.getLogger(OperacionesFicherosTexto.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    static void escribirAñadiendoAlFinal() {
        BufferedWriter bw = null;
        try {
            String textToAppend = "Este es el texto que vamos a añadir\r\n";
            //Set true for append mode
            bw = new BufferedWriter(new FileWriter("fichero.txt", true));
            bw.write(textToAppend);
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(OperacionesFicherosTexto.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                bw.close();
            } catch (IOException ex) {
                Logger.getLogger(OperacionesFicherosTexto.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    static String cambiarVocales(String lineaE) {
        String lineaS = "";
        int i = 0;
        String caracter;

        lineaE = lineaE.toLowerCase().replace("a", "");
        lineaE = lineaE.replace("e", "");
        lineaE = lineaE.replace("i", "");
        lineaE = lineaE.replace("o", "");
        lineaE = lineaE.replace("u", "");

        System.out.println(lineaE);
        return (lineaS);
    }

}
