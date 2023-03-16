/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundotic.cursojava.F.finalkeyword;

/**
 *
 * @author Javi
 */
class B_EjemploFinalMetodo {

    final void correr() {
        System.out.println("corriendo");
    }
}

class Honda extends B_EjemploFinalMetodo {
    
    //Un metodo final no se puede ser sobreescrito, por lo que dara un error

   /*void correr() {
        System.out.println("ciruculando a 100kmph");
    }*/

    public static void main(String args[]) {
        Honda honda = new Honda();
        honda.correr();
    }
}


