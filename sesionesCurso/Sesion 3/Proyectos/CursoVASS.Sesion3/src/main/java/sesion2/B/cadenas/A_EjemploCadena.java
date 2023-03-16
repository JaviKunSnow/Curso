/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion2.B.cadenas;

/**
 *
 * @author Javi
 */
public class A_EjemploCadena {

    public static void main(String args[]) {

        String s1 = "java";//crear una cadena a partir de un literal

        char ch[] = {'s', 't', 'r', 'i', 'n', 'g', 's'}; //crear una cadena como un array de char

        String s2 = new String(ch);//convertir la cadena en un String

        String s3 = new String("Hola");//creando un String con el operador New

        String s4 = s1;

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }

}
