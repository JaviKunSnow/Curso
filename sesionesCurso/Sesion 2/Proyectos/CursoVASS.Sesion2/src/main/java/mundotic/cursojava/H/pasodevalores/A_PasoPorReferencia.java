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
public class A_PasoPorReferencia {

    public static void main(String[] args) {
        
        IntWrapper entero1 = new IntWrapper(30);
        IntWrapper entero2 = new IntWrapper(45);      
        
        System.out.println("Antes de intercambiar, a = " + entero1.a + "  b = " + entero2.a +"\n");
        
        //llamamos a intercambiar
        intercambiar(entero1, entero2);
        System.out.println("\n**Ahora, antes y despues los valores de intercambio seran diferentes aquí**:");
        System.out.println("Depues del intercambio, a = " + entero1.a + " y b es " + entero2.a);
    }

    public static void intercambiar(IntWrapper entero1, IntWrapper entero2) {
        System.out.println("Antes del intercambio (dentro de la funcion), a = " + entero1.a + " b = " + entero2.a);
        // Declaramos un contendor auxiliar para almacenar el valor de entero1
        IntWrapper auxiliar = new IntWrapper(entero1.a);
        //asignamos el valor de entero2 a entero1
        entero1.a = entero2.a;
        //asignamos el valor de auxiliar a entero2
        entero2.a = auxiliar.a;
        //ya tendriamos hecho el cmabio
        System.out.println("Despues del intercambio(dentro de la funcion), a = " + entero1.a + " b = " + entero2.a);
    }
}

class IntWrapper {

    public int a;

    public IntWrapper(int a) {
        this.a = a;
    }
}
