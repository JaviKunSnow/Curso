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
interface Printable3 {

    void print();
}

interface Showable3  extends Printable3{

    void show();    
}

class E_SimularHerenciaMultipleConInterfaces implements Showable3 {

    @Override
    public void print() {
        System.out.println("Hello");
    }

    @Override
    public void show() {
        System.out.println("Welcome");
    }

    public static void main(String args[]) {
        E_SimularHerenciaMultipleConInterfaces obj = new E_SimularHerenciaMultipleConInterfaces();
        obj.print();
        obj.show();
    }
}
