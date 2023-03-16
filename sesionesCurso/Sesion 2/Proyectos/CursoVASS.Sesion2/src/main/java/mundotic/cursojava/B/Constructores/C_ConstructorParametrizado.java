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
class C_ConstructorParametrizado {

    int id;
    String nombre;
    
    //constructor parametrizado
    C_ConstructorParametrizado(int i, String n) {
        id = i;
        nombre = n;
    }
    //method to display the values  

    void mostrar() {
        System.out.println(id + " " + nombre);
    }

    public static void main(String args[]) {
        
        C_ConstructorParametrizado s1 = new C_ConstructorParametrizado(111, "Oscar");
        C_ConstructorParametrizado s2 = new C_ConstructorParametrizado(222, "Laura");
       
        s1.mostrar();
        s2.mostrar();
    }
}

