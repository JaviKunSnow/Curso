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
class Ejemplo{

    protected void msg() {
        System.out.println("Hello java");
    }
}

class Simple3 extends Ejemplo {

    void mensaje(){
       this.msg(); 
    } 
    
    protected void msg()
    {
        System.out.println("llamamos al metodo escrito");
    }

   
}


public class B_EjemploModificadorProtected{
	
	
	 public static void main(String args[]) {
	        Ejemplo obj = new Ejemplo();
	        obj.msg();
	        Simple3 obj2 = new Simple3();
	        obj2.msg();
	    }
}
