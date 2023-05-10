
package mundotic.cursojava.A2.EjemplosClaseObjetoInstancia;

/**
 *
 * @author Javi
 */

class Rectangulo {

    int longitud;
    int anchura;

    void insertar(int l, int w) {
        longitud = l;
        anchura = w;
    }

    void calcularArea() {
        System.out.println(longitud * anchura);
    }
}

class G_CrearMultiplesObjetosMismoTipo {

    public static void main(String args[]) {
        
        Rectangulo r1 = new Rectangulo();
        Rectangulo r2 = new Rectangulo();
        //Creamos los dos objetos
        r1.insertar(11, 5);
        r2.insertar(3, 15);
        r1.calcularArea();
        r2.calcularArea();
    }
}
