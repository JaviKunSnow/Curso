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
class D_EjemploDowncastingInstanceOf {
	
	  public static void main(String[] args) {
	        D_EjemploDowncastingInstanceOf a = new Lagarto(); //upcasting
	        Lagarto.method(a);
	    }
}

class Lagarto extends D_EjemploDowncastingInstanceOf {

    static void method(D_EjemploDowncastingInstanceOf a) {
        if (a instanceof Lagarto) {
            Lagarto d = (Lagarto) a;
            System.out.println("ok downcasting performed");
        }       
        
    }

  

}
