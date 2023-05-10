
package mundotic.cursojava.A2.EjemplosClaseObjetoInstancia;

/**
 *
 * @author Javi
 */
class Estudiante4 {

    //miembros
    int id;
    String nombre;

    
    void insertarRegistro(int r, String n) {
        id = r;
        nombre = n;
    }

    void displayInformation() {
        System.out.println(id + " " + nombre);
    }
}

class E_InicializacionPorMetodo {

    public static void main(String args[]) {
        Estudiante4 s1 = new Estudiante4();
        Estudiante4 s2 = new Estudiante4();
        s1.insertarRegistro(111, "Luis");
        s2.insertarRegistro(222, "Juan");
        s1.displayInformation();
        s2.displayInformation();
    }
}
