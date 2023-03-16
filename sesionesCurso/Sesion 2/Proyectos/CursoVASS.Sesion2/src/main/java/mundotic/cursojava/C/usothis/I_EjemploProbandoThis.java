/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundotic.cursojava.C.usothis;

/**
 *
 * @author Javi
 */
class I_EjemploProbandoThis {

    void m() {
        System.out.println(this);//imprime la referencia
    }

    public static void main(String args[]) {
        I_EjemploProbandoThis obj = new I_EjemploProbandoThis();
        System.out.println(obj);//imprime la misma referencia 
        obj.m();
    }
}
