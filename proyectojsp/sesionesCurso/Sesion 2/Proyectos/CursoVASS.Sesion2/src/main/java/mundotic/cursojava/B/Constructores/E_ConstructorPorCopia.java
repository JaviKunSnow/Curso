/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundotic.cursojava.B.Constructores;

/**
 *
 * @author Javi
 */
//Java program to initialize the values from one object to another object.  
class E_ConstructorPorCopia {

    int id;
    String nombre;

    //constructor to initialize integer and string  
    E_ConstructorPorCopia(int i, String n) {
        id = i;
        nombre = n;
    }

    //constructor to initialize another object  
    E_ConstructorPorCopia(E_ConstructorPorCopia s) {
        id = s.id;
        nombre = s.nombre;
    }

    void mostrar() {
        System.out.println(id + " " + nombre);
    }

    public static void main(String args[]) {
        E_ConstructorPorCopia s1 = new E_ConstructorPorCopia(111, "Luis");
        E_ConstructorPorCopia s2 = new E_ConstructorPorCopia(s1);
        s1.mostrar();
        s2.mostrar();
    }
}
