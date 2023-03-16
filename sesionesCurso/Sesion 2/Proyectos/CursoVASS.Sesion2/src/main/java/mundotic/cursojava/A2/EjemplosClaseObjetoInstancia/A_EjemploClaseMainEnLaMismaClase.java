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
class A_EjemploClaseMainEnLaMismaClase {

    //miembros de la clase
    int id;
    String nombre;

    //metodo main en la misma clase
    public static void main(String args[]) {
        //Creamos un objeto
        A_EjemploClaseMainEnLaMismaClase s1 = new A_EjemploClaseMainEnLaMismaClase();

        //De aquella manera imprimimos los valores del objeto
        System.out.println(s1.id);//El operador . lo utilizamos para acceder tanto a los miembros como a sus metodos 
        System.out.println(s1.nombre);
    }
}

