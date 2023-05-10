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
class B_ConstructorPorDefectoOtroEjemplo {

    int id;
    String nombre;

    B_ConstructorPorDefectoOtroEjemplo() {
        System.out.println(id + " " + nombre);
        System.out.println(id + " " + nombre);

        
    }
 
   
    void mostrar() {
        System.out.println(id + " " + nombre);
        System.out.println(id + " " + nombre);
    }

    public static void main(String args[]) {
 
        B_ConstructorPorDefectoOtroEjemplo s1 = new B_ConstructorPorDefectoOtroEjemplo();
        B_ConstructorPorDefectoOtroEjemplo s2 = new B_ConstructorPorDefectoOtroEjemplo();

        s1.mostrar();
        s2.mostrar();
    }
}
