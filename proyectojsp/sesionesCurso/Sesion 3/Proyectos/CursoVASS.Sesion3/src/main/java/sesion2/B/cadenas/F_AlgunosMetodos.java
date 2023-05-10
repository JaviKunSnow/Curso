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
public class F_AlgunosMetodos {

    public static void main(String... args) {
        algunosMetodos();

    }

    static void algunosMetodos() {

        //startsWith, endWith
        String s = "Martin";
        String s2 = "valor";
        System.out.println(s.startsWith("Sa"));//false
        System.out.println(s.endsWith("n"));//true

        //contains
        System.out.println(s.contains("art")); //true

        //charAt
        s = "Martin";
        System.out.println(s.charAt(0));//M
        System.out.println(s.charAt(3));//t

        //format
        System.out.println(String.format("|%30.7s|", "Hola Mundo"));

        //length()
        s = "Martin";
        System.out.println(s.length());//6

        //indexOf
        System.out.println(s.indexOf(3));
        System.out.println(s.indexOf("r"));
        System.out.println(s.indexOf("rt", 3));

        //lastIndexOf
        System.out.println(s.lastIndexOf(3));
        System.out.println(s.lastIndexOf(0));
        System.out.println(s.lastIndexOf("hola", 0));
        System.out.println(s.lastIndexOf(0, 0));

        //isEmpty
        System.out.println(s.isEmpty());

        //replace
        s = "Java es un lenguaje de programación. Java es una plataforma. Java es para todo.";
        s2 = "no es";
        System.out.println(s.replace("es", s2));
        System.out.println(s.replaceAll("es", s2));
        System.out.println(s.replaceFirst("es", s2));
        String s1 = "Java es un lenguaje de programación. Java es una plataforma. Java es para todo.";
        String replaceString = s1.replace("Java", "Lava");//reemplazar ocurrencias de Java por Lava
        System.out.println(replaceString);

        //Lower o upperCase
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());

        //trim
        s = "  hola    ";
        System.out.println(s);
        System.out.println(s.trim());

        //valueOf //Cambiar valores practicamente cualquier tipo de dato a cadena
        int a = 10;
        int b = 1;
        s = String.valueOf(a);
        System.out.println(s + 10);

    }

}
