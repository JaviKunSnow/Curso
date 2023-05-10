/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundotic.cursojava.G.contextoEstatico;

/**
 *
 * @author Javi
 */
class F_EjemploBloqueEstatico {

    static {
        System.out.println("static block is invoked");
    }

    public static void main(String args[]) {
        System.out.println("Hello main");
    }
}
