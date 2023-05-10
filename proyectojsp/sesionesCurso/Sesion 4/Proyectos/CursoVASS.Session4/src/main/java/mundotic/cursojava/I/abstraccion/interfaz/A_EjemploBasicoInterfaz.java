/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundotic.cursojava.I.abstraccion.interfaz;

/**
 *
 * @author Javi
 */
interface printable {
    void print();    
}


class A_EjemploBasicoInterfaz implements printable {

    @Override
    public void print() {
        System.out.println("Hello");
    }
    
    public static void main(String args[]) {
        A_EjemploBasicoInterfaz obj = new A_EjemploBasicoInterfaz();
        obj.print();
    }
}
