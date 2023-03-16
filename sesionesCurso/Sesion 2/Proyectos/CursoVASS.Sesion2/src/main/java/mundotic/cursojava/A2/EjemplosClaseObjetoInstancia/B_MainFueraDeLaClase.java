/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundotic.cursojava.A2.EjemplosClaseObjetoInstancia;

/**
 *
 * @author Javi
 */
class Estudiante {

    int id;
    String nombre;
}

//instanciamos el objeto de la clase creada dentro de la clase con el metodo main.
class B_MainFueraDeLaClase {

    public static void main(String args[]) {
        Estudiante s1 = new Estudiante();
        System.out.println(s1.id);
        System.out.println(s1.nombre);
    }
}
