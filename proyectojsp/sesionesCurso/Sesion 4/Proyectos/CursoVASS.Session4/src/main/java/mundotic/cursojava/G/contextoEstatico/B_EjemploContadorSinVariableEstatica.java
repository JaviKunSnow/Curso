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
class B_EjemploContadorSinVariableEstatica {

    int count = 0;//will get memory each time when the instance is created  

    B_EjemploContadorSinVariableEstatica() {
        count++;//incrementing value  
        System.out.println(count);
    }

    public static void main(String args[]) {
//Creating objects  
        B_EjemploContadorSinVariableEstatica c1 = new B_EjemploContadorSinVariableEstatica();
        B_EjemploContadorSinVariableEstatica c2 = new B_EjemploContadorSinVariableEstatica();
        B_EjemploContadorSinVariableEstatica c3 = new B_EjemploContadorSinVariableEstatica();
    }
}
