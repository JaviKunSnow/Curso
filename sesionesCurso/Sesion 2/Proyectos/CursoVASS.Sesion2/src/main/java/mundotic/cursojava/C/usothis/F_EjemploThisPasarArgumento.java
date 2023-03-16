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
class F_EjemploThisPasarArgumento {

    void m(F_EjemploThisPasarArgumento obj) {
        System.out.println("metodo llamado " + obj.toString());
    }

    void p() {
        m(this);
    }

    public static void main(String args[]) {
        F_EjemploThisPasarArgumento s1 = new F_EjemploThisPasarArgumento();
        s1.p();
    }
}
