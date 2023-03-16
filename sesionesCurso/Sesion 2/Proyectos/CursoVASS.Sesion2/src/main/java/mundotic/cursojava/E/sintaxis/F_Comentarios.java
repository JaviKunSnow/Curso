/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundotic.cursojava.E.sintaxis;

/**
 *
 * @author Javi
 */
public class F_Comentarios {

    public static void main() {
    
    	//LINEA
    	int i = 10; // Aquí, i es una variable  
        System.out.println(i);

        
        //BLOQUE
        /* Declaremos y 
 variable de impresión en java. */
        i = 10;
        System.out.println(i);
    }
    
    
    
//JAVADOC
    /**
     * La clase Calculadora proporciona métodos para obtener sumas y restas de 2
     * números dados.
     */
    class Calculadora {

        /**
         * El método add () devuelve la suma de números dados.
         */
        public int add(int a, int b) {
            return a + b;
        }

    }

    /**
     * El método sub () devuelve la resta de números dados.
     */
    public int sub(int a, int b) {
        return a-b;
    }

}
