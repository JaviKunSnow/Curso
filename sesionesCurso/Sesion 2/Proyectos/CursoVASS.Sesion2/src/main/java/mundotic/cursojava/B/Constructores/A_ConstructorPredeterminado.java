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
public class A_ConstructorPredeterminado {

    // crear un constructor predeterminado  
    A_ConstructorPredeterminado() {
        mensaje();        
    }
    
    private void mensaje()
    {
        System.out.println("Se crea el objeto bici");
    }


    public static void main(String args[]) {
    //llamando a un constructor predeterminado  
        A_ConstructorPredeterminado b = new A_ConstructorPredeterminado();
        b.mensaje();
    }

}
