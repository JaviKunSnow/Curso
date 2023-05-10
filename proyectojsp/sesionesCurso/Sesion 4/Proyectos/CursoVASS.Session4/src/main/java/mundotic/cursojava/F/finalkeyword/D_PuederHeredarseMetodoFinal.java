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
class Ejemplo {

    final void correr() {

        System.out.println("circulando...");
    }

}

class D_PuederHeredarseMetodoFinal  extends Ejemplo {

    public static void main(String args[]) {
    	D_PuederHeredarseMetodoFinal honda = new D_PuederHeredarseMetodoFinal();
        honda.correr();
        
        //OBJETO ANONIMO
        //PORQUE NO EXISTE LA NECESIDAD DE DECLARAR UNA VARIABLE  EXPLICITAMENTE YA QUE EL OPERADOR NEW SE ENCARGA DE RESERVAR LA MEMORIA
        new D_PuederHeredarseMetodoFinal().correr();
        
    }
}
