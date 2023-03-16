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

class Estudiante2{  
 int id;  
 String nombre;   
}  


class C_InicializarObjetoXReferencia {
    
    
    int id;

    public static void main(String args[]) {
        Estudiante2 s1 = new Estudiante2();// Al inicializar se crea la referencia del objeto
        //asignamos valores de aquella manera.
        s1.id = 101;        
        s1.nombre = "Sonoo";
        System.out.println(s1.id + " " + s1.nombre);//imprimir miembros de la clase
    }
}
