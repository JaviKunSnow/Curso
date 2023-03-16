/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundotic.cursojava.C.polimorfismo.sobrecargar;

/**
 *
 * @author Javi
 */

public class D_PolimorfismoDeAsignacion {
	 public static void main(java.lang.String... args) {
	        Coche j = new Coche();
	        Vehiculo z = new Coche();

	        //No se puede
	       // z.unMetodo();
	         //DownCasting
	         z = (Coche)j;
	         //DownCasting directo
	        ((Coche) z).unMetodo();
	        //PARA CONVERTIR J 
	    }
}

abstract class Vehiculo {

    abstract public void iniciar();
    
}

class Coche extends Vehiculo {

    @Override
    public void iniciar() {
        System.out.println("asdf");
    }

    public void unMetodo() {
        System.out.println("Estamos en un metodo");
    }

}


