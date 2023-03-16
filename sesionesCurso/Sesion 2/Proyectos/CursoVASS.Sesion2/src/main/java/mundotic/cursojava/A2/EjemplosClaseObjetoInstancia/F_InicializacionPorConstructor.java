package mundotic.cursojava.A2.EjemplosClaseObjetoInstancia;

/**
 *
 * @author Javi
 */
class Empleado {

    int id;
    String nombre;
    float salario;

    Empleado(int i, String n, float s) {
        id = i;
        nombre = n;
        salario = s;
    }

    void display() {
        System.out.println(id + " " + nombre + " " + salario);
    }
}

public class F_InicializacionPorConstructor {

    public static void main(String[] args) {
        Empleado e1 = new Empleado(101, "ajeet", 45000);
        Empleado e2 = new Empleado(101, "ajeet", 45000);
        Empleado e3 = new Empleado(101, "ajeet", 45000);

        e1.display();
        e2.display();
        e3.display();
    }
}
