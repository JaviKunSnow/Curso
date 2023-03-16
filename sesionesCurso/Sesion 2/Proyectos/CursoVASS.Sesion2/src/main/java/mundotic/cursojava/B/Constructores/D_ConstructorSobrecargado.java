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
class D_ConstructorSobrecargado {

    int id;
    String nombre;
    int edad;

    //Constructor de dos parametros 
    D_ConstructorSobrecargado(int i, String n) {
        id = i;
        nombre = n;
    }

    //Constructor de un parametro  
    D_ConstructorSobrecargado(int i, String n, int a) {
        id = i;
        nombre = n;
        edad = a;
    }

    void mostrar() {
        System.out.println(id + " " + nombre + " " + edad);
    }

    public static void main(String args[]) {
        D_ConstructorSobrecargado s1 = new D_ConstructorSobrecargado(111, "Clara");
        D_ConstructorSobrecargado s2 = new D_ConstructorSobrecargado(222, "Hugo", 25);
        s1.mostrar();
        s2.mostrar();
    }
}
