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
class Studiant {

    int id;
    String nombre, curso;
    float tarifa;

    Studiant(int id, String name, String curso) {
        this.id = id;
        this.nombre = name;
        this.curso = curso;
    }

    Studiant(int rollno, String name, String course, float fee) {
        this(rollno, name, course);//reusamoe el constructor de dos parametros
        this.tarifa = fee;
    }

    void mostrar() {
        System.out.println(id + " " + nombre + " " + curso + " " + tarifa);
    }
}

public class E_EjemploRealUsoThis {

    public static void main(String args[]) {
        Studiant s1 = new Studiant(111, "Estudiante1", "java");
        Studiant s2 = new Studiant(112, "Estudiante2", "java", 6000f);
        s1.mostrar();
        s2.mostrar();
    }

}
