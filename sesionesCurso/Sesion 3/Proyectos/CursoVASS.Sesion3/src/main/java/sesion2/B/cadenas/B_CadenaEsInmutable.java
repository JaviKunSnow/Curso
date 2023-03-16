package sesion2.B.cadenas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Javi
 */
public class B_CadenaEsInmutable {

    public static void main(String args[]) {

        noCambia();
        cambia();

    }

    static void noCambia() {
        String s = "Martin";
        System.out.println(s.concat("Martinez")); // el método concat () agrega la cadena al final
        System.out.println(s); // imprimirá Martin porque las cadenas son objetos inmutables y aunque se asigne el valor, esta quedará creada en la memoria
    }

    static void cambia() {
        String s = "Martin";
        s = s.concat("Martinez"); // el método concat () agrega la cadena al final
        System.out.println(s); // imprimirá todo porque se ha asignado previamente el valor a la variables pero se habra creado una variable nueva en la memoria
    }

}
