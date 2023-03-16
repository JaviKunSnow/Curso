/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundotic.cursojava.H.abstraccion.claseabstracta;

/**
 *
 * @author Javi
 */
abstract class A_ClaseAbstractaBasica {

    //PUEDE LLEVAR VARIABLES MIEMBRO
    
    //PUEDE LLEVAR CONSTRUCTOR
    A_ClaseAbstractaBasica()
    {
        
    }
        
    //METODO ABSTRACTO
    abstract void run();

    //UN METODO CUALQUIERA
    final public void unMetodo() {
        System.out.println("Un metodo");
    }
    
    static public void metodoEstatico()
    {
        
    }
}

class Yamaha extends A_ClaseAbstractaBasica {

    //SI HEREDAMOS EL METODO ESTAMOS OBLIGADOS A SOBREESCRIBIR EL METODO ABSTRACTO
    @Override
    void run() {
        System.out.println("Circulando Seguro");
    }   
    
    
   
    

    public static void main(String args[]) {
      
        A_ClaseAbstractaBasica obj = new Yamaha();
        obj.run();
        obj.unMetodo();
    }
}
