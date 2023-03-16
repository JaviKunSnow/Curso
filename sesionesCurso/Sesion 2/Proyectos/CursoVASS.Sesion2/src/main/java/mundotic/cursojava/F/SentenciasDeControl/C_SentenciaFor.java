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
public class C_SentenciaFor {

    public static void main(String[] args) {

        EjemploFor ejem = new EjemploFor();
        ejem.ejemploFor();

    }
}

class EjemploFor {

    public void ejemploFor() {

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

    }

    //for anidado
    public void forAnidado() {

        for (int i = 1; i <= 3; i++) {

            for (int j = 1; j <= 3; j++) {
                System.out.println(i + " " + j);
            }// fin i 
        }//fin j 
    }//fin metodo forAnidado

    //for anidado
    public void piramide() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        int term = 6;
        for (int i = 1; i <= term; i++) {
            for (int j = term; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //ejemplo for each
    public void forEachEjemplo() {

        int arr[] = {12, 23, 44, 56, 78};

        for (int i : arr) {
            System.out.println(i);
        }
    }

    
    //Ejemplo labeled for
    public void labeledFor() {
        aa:
        for (int i = 1; i <= 3; i++) {
            bb:
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    break aa;
                }
                System.out.println(i + " " + j);
            }
        }
    }

     //Ejemplo de bucle infinito
    public void bucleInfinito() {
        //Ctrl + d O Ctrl + c para salir 
        for (;;) {

        }
    }
}//fin de la clase
