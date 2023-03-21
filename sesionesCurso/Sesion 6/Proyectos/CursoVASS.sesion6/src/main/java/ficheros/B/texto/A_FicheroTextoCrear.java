/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheros.B.texto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 *
 * @author Javi
 */
public class A_FicheroTextoCrear {

    public void main(String[] args) throws FileNotFoundException, IOException {

        FileReader reader = new FileReader("MyFile.txt");
        FileWriter writer = new FileWriter("YourFile.txt");

        InputStreamReader reader2 = new InputStreamReader(
                new FileInputStream("MyFile.txt"), "UTF-16");

        OutputStreamWriter writer2 = new OutputStreamWriter(
                new FileOutputStream("YourFile.txt"), "UTF-8");

        InputStreamReader reader3 = new InputStreamReader(
                new FileInputStream("MyFile.txt"), "UTF-16");

        BufferedReader bufReader3 = new BufferedReader(reader);

        OutputStreamWriter writer4 = new OutputStreamWriter(
                new FileOutputStream("YourFile.txt"), "UTF-8");

        BufferedWriter bufWriter4 = new BufferedWriter(writer);

    }

}
