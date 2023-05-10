/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundotic.cursojava.modificadoresdeacceso.A.VisionEnPaquete;

/**
 *
 * @author Javi
 */
public class Ar {

    private int dato1 = 40;
    int dato2;
    
    //el constructor por defecto al ser privador no podrá ser llamado
    private Ar() {}
     
    //podríamos utilizar este
    public Ar(int d) {

        dato1 = 32;
        dato2 = 23;

    }


    protected void msg() {
        System.out.println("Hello java");       
        
    }
}