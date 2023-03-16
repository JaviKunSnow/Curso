/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundotic.cursojava.E.superkeyword;

/**
 *
 * @author Javi
 */
class Persona {

    int id;
    String nombre;

    Persona(int id, String name) {
        this.id = id;
        this.nombre = name;
    }
}

class Empleado extends Persona {

    float salary;

    Empleado(int id, String name, float salary) {
        super(id, name);//reusing parent constructor  
        this.salary = salary;
    }

    void mostrar() {
        System.out.println(id + " " + nombre + " " + salary);
    }
}

class E_SuperEjemploReal {

    public static void main(String[] args) {
        Empleado e1 = new Empleado(1, "ankit", 45000f);
        e1.mostrar();
    }
}
