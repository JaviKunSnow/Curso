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
class D_EjemploMetodoEstatico {

    int id;
    String nombre;
    static String uni = "ITS";
    
    //metodo estatico para cambiar el valor de la variable estatica
    static void change() {
        uni = "BBDIT";
        
    }
    

    D_EjemploMetodoEstatico(int r, String n) {
        id = r;
        nombre = n;
    }
    
    void mostrar() {
        System.out.println(id + " " + nombre + " " + uni);
    }
}
//Test class to create and mostrar the values of object  

class TestStaticMethod2 {

    public static void main(String args[]) {
        D_EjemploMetodoEstatico.change();//calling change method  
        //creating objects  
        A_EjemploVariableEstatica s1 = new A_EjemploVariableEstatica(111, "Karan");
        A_EjemploVariableEstatica s2 = new A_EjemploVariableEstatica(222, "Aryan");
        A_EjemploVariableEstatica s3 = new A_EjemploVariableEstatica(333, "Sonoo");
        //calling mostrar method  
        s1.mostrar();
        s2.mostrar();
        s3.mostrar();
        
    }
    
    
    
    
}
