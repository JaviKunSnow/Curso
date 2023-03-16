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

class Estudiante3{  
 int id;  
 String nombre;  
} 


class D_InicializarMultiplesObjetosxReferencia {
    
    

    public static void main(String args[]) {
        
       //Creamos objetos 
        Estudiante3 s1 = new Estudiante3();
        Estudiante3 s2 = new Estudiante3();
        
        //Inicilizamos 
        s1.id = 101;
        s1.nombre = "Luis";
        s2.id = 102;
        s2.nombre = "Juan";
        
        //Imprimimos 
        System.out.println(s1.id + " " + s1.nombre);
        System.out.println(s2.id + " " + s2.nombre);
    }
}
