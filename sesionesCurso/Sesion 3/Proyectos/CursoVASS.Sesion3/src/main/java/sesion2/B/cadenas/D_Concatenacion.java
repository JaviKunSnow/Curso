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
public class D_Concatenacion {

    public static void main(String... args) {
    //   concatenar1();
    //   concatenar2();
    //   concatenar3();
    //        crearVariablesCadena();
        concatenar5();
    }

    static void concatenar1() {

        String s = "Martin" + " Martinez";
        System.out.println(s);//Martin Martinez
    }

    static void concatenar2() {

        String s = 50 + 30 + "Martin" + 40 + 40;
        System.out.println(s);//80Sachin4040

    }

    static void crearVariablesCadena() {
        long tiempo = System.nanoTime();
        for (int i = 0; i < 10000; i++) {

            String cadena = new String("hola");

        }

        long tiempo2 = System.nanoTime();

        for (int i = 0; i < 10000; i++) {

            String cadena = "hola";

        }

        long tiempo3 = System.nanoTime();

        System.out.println(tiempo2 - tiempo);
        System.out.println(tiempo3 - tiempo2);
    }

    static void concatenar3() {
        String s1 = "Martin Martinez ";
        String s2 = "Tendulkar";
        String s3 = s1.concat(s2);
        System.out.println(s3);//Martin Martinez Tendulkar
    }

    static void concatenar5() {
        long tiempo = System.currentTimeMillis();
        String cadena = new String("hola");

        for (int i = 0; i < 10000; i++) {
            cadena += "hola";
        }

        long tiempo2 = System.currentTimeMillis();

        String cadena2 = new String("hola");
        for (int i = 0; i < 100000; i++) {
            cadena2.concat("hola");
        }

        long tiempo3 = System.currentTimeMillis();

        System.out.println("salida");
        System.out.println(tiempo2 - tiempo + "ms");
        System.out.println(tiempo3 - tiempo2 + "ms");
    }

}
