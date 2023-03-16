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
interface Imprimir {

    void print();
}

interface Enseñar {   

    static void print()
    {
        System.out.println("asf");
    }
}

class F_SimularHErenciaMultipleConInterfaces2 implements Imprimir, Enseñar {

    @Override
    public void print() {
        System.out.println("Hello");
    }

    public static void main(String args[]) {
        F_SimularHErenciaMultipleConInterfaces2 obj = new F_SimularHErenciaMultipleConInterfaces2();
        obj.print();
        
        Enseñar.print();
        
    }
}
