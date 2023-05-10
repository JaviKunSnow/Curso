/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundotic.cursojava.J.operadorinstanceof;

/**
 *
 * @author Javi
 */
class B_EjemploInstanceOfHerencia {
    
}

class ClaseQueHereda extends B_EjemploInstanceOfHerencia { 

    public static void main(String args[]) {
        ClaseQueHereda d = new ClaseQueHereda();
        System.out.println(d instanceof B_EjemploInstanceOfHerencia);//true  
    }
}
