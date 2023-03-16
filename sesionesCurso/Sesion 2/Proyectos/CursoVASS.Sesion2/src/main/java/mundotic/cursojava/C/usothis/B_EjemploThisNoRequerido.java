/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundotic.cursojava.C.usothis;

/**
 *
 * @author Javi
 */
class Studiante {

    int id;
    String nombre;
    float tarifa;

    Studiante(int r, String n, float f) {
        id = r;
        nombre = n;
        tarifa = f;
    }

    void display() {
        System.out.println(id + " " + nombre + " " + tarifa);
    }
}

class B_EjemploThisNoRequerido {

    int rollno;
    String name, course;
    float fee;

    public static void main(String args[]) {
        Studiante s1 = new Studiante(111, "ankit", 5000f);
        Studiante s2 = new Studiante(112, "sumit", 6000f);
        s1.display();
        s2.display();
    }
}
