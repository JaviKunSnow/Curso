/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundotic.cursojava.F.SentenciasDeControl;

/**
 *
 * @author Javi
 */
public class D_SentenciaWhile {

    public static void main(String[] args) {

        BucleWhile ejem = new BucleWhile();
        ejem.ejemploWhile();

    }
}


class BucleWhile {

    public void ejemploWhile() {
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }

    public void whileInfinito() {
        while (true) {
            System.out.println("Bucle infinito");
        }
    }
}
