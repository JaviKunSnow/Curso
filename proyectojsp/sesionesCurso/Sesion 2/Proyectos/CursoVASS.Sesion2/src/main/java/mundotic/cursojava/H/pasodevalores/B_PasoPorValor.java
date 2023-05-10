/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundotic.cursojava.H.pasodevalores;

/**
 *
 * @author Javi
 */
public class B_PasoPorValor {

    public static void main(String[] args) {
        int entero1 = 30;
        int entero2 = 45;
        System.out.println("Antes de intercambiar, entero1 = " + entero1 + "  entero2 = " + entero2 + "\n");

        
        intercambiar(entero1, entero2);
        
        System.out.println("\n**Ahora, antes y despues los valores de intercambio seran diferentes aquí**:");
        System.out.println("Depues del intercambio, a = " + entero1 + " y b es " + entero2);
    }

    public static void intercambiar(int entero1, int entero2) {
        System.out.println("Antes de intercambiar (dentro de la funcion) = " + entero1 + " b = " + entero2);
        // utilizamos una variable para el cambio
        int c = entero1;
        entero1 = entero2;
        entero2 = c;
        //en cuanto salgamos del metodo tendremos los valores originales
        System.out.println("Despues de intercambiar (dentro de la funcion), a = " + entero1 + " b = " + entero2);
    }
}
