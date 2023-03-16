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
public class E_PolimorfismoPuro {

    public static void main(java.lang.String... args) {
        Comprable a = new Casa();
        PolimorfismoPuroTest.funcionPolimorfica(a);

        Comprable b = new Coche2();
        PolimorfismoPuroTest.funcionPolimorfica(b);
    }
}

interface Comprable {

    public void comprar();
}

class Casa implements Comprable {

    @Override
    public void comprar() {
        System.out.println("Comprar desde Casa");
    }

}

class Coche2 extends Vehiculo implements Comprable {

    @Override
    public void iniciar() {
    }

    @Override
    public void comprar() {
        System.out.println("Comprar desde coche");
    }
}

class PolimorfismoPuroTest {

    public static void funcionPolimorfica(Comprable ob) {
        // La función acepta cualquier "comprable", es decir, cualquier objeto que implemente esa interfaz
        // El tipo de objeto se determina en tiempo de ejecución. En nuestros ejemplos, puede ser una casa o coche.
        ob.comprar();
    }
}
