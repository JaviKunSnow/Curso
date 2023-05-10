/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundotic.cursojava.G.contextoEstatico;

/**
 *
 * @author Javi
 */
//Java Program to demonstrate the use of static variable
class A_EjemploVariableEstatica {

    int id;//variable de instancia
    String nombre;
    static String uni = "ITS";//variable estaticca
    //constructor

    A_EjemploVariableEstatica(int r, String n) {
        id = r;
        nombre = n;
    }

    void mostrar() {
        System.out.println(id + " " + nombre + " " + uni);
    }
}
//Test class to show the values of objects

class TestStaticVariable1 {

    public static void main(String args[]) {
        A_EjemploVariableEstatica s1 = new A_EjemploVariableEstatica(111, "Karan");
        A_EjemploVariableEstatica s2 = new A_EjemploVariableEstatica(222, "Aryan");

        //we can change the uni of all objects by the single line of code
        A_EjemploVariableEstatica.uni = "BBDIT";

        s1.mostrar();
        s2.mostrar();

        System.out.println(A_EjemploVariableEstatica.uni);
    }
}
