/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundotic.cursojava.D.Variables;

/**
 *
 * @author Javi
 */
public class A_TiposVariable {

    int data = 50;//variable de instancia  
    static int m = 100;//variable estatica o de clase  
    

    void unMetodo() {
        int n = 90;//variable local al metodo. SOLO SE PUEDE UTILIZAR DENTRO DE ESE METODO!.
    }

    
    //Frase que hay que recordar si o si. EL AMBITO DE LAS VARIABLES DECLARADAS DEBE DE SER EL MAS REDUCIDO POSIBLE.
}
