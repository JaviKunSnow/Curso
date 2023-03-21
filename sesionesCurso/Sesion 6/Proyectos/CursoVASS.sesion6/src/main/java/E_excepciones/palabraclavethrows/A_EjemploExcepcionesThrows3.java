/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E_excepciones.palabraclavethrows;

import java.io.IOException;

/**
 *
 * @author Javi
 */
public class A_EjemploExcepcionesThrows3 {
	
	//No puedo lanzar la excepcion mas alla del primer metodo que comienza la pila de llamadas
    public static void main(String args[]) throws IOException {//declare exception
        S m = new S();
        m.method();

        System.out.println("normal flow...");
    }

}

class S {

    void method() throws IOException {

        throw new IOException("device error");//checked exception
    }
}
