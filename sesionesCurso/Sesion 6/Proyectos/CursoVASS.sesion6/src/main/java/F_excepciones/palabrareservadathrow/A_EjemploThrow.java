/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F_excepciones.palabrareservadathrow;

/**
 *
 * @author Javi
 */
public class A_EjemploThrow {

    //Con throw podemos decidir cuando lanzar una excepcion
    static void validate(int age) {

    	int dividendo = 0;
    	int divisor = 0;
    	
        if (divisor == 0) {
            throw new ArithmeticException("not valid");

        } else {
            //throw new NullPointerException();
            System.out.println("Realizamos la operacion");
        }
    }

    public static void main(String args[]) {
        validate(13);
        System.out.println("rest of the code...");
    }

}
