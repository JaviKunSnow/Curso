/*
/*
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_excepciones.bloquefinally;

/**
 *
 * @author Javi
 */
public class A_ExcepcionesBloqueFinally2 {

    public static void main(String args[]) {

        //el bloque finally se ejecuta cando hay excepcion  y no corresponde con el tipo de excepcion que se produce. Luego muestra el error
        try {
            int data = 25 / 0;
            System.out.println(data);
        } catch (NullPointerException e) {
            System.out.println(e);
        } finally {
            System.out.println("finally block is always executed");
        }
        System.out.println("rest of the code...");
    }

}
