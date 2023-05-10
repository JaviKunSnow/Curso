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
class Estudiante {

    int id;
    String nombre;
    float tarifa;

    Estudiante(int id, String nombre, float tarifa) {
        id = id;
        nombre = nombre;
        tarifa = tarifa;
    }

    void mostrar() {
        System.out.println(id + " " + nombre + " " + tarifa);
    }
}

class Estudiant {

    int id;
    String nombre;
    float tarifa;

    Estudiant(int id, String nombre, float tarifa) {
        this.id = id;
        this.nombre = nombre;
        this.tarifa = tarifa;
    }

    void mostrar() {
        System.out.println(id + " " + nombre + " " + tarifa);
    }
}


class A_EjemploUsoThis {

    public static void main(String args[]) {
        Estudiante s1 = new Estudiante(111, "Estudiante1", 5000f);
        Estudiante s2 = new Estudiante(112, "Estudiante2", 6000f);
        s1.mostrar();
        s2.mostrar();

        Estudiant s3 = new Estudiant(111, "Estudiante3", 5000f);
        Estudiant s4 = new Estudiant(112, "Estudiante4", 6000f);
        s1.mostrar();
        s2.mostrar();
    }
}

