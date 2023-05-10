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
public class E_SentenciaDoWhile {

    public static void main(String[] args) {

        BucleDoWhile ejem = new BucleDoWhile();
        ejem.ejemploWhile();

    }
}

class BucleDoWhile {

    //Ejemplo while
    public void ejemploWhile() {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
        //Ejemplo while infinito

    }

    public void doWhileInfinito() {
        do {
            System.out.println("infinitive do while loop");
        } while (true);
    }
}
