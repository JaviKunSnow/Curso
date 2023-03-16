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
class C_EjemploContadorConVariableEstatica {

    static int count = 0;  

    C_EjemploContadorConVariableEstatica() {
        count++;  
        System.out.println(count);
    }

    public static void main(String args[]) {
//creating objects  
        C_EjemploContadorConVariableEstatica c1 = new C_EjemploContadorConVariableEstatica();
        C_EjemploContadorConVariableEstatica c2 = new C_EjemploContadorConVariableEstatica();
        C_EjemploContadorConVariableEstatica c3 = new C_EjemploContadorConVariableEstatica();
    }
}
