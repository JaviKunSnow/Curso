/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundotic.cursojava.C.polimorfismo.sobrecargar;

/**
 *
 * @author Javi
 */
//Java Program to demonstrate why we need method overriding  
//Here, we are calling the method of parent class with child  
//class object.  
//Creating a parent class  

class Vehicle {

    //METODO SIN PARAMETROS
    public void run() {
        System.out.println("Vehicle is running");
    }
    
    //MISMO METODO CON UN PARAMETRO
    public void run(int unParametro)
    {
        System.out.println("Vehicle is running WITH ONE PARAMETER");
    }
    
    public void run(double unParametro)
    {
        System.out.println("Vehicle is running WITH ONE PAREMETER, DIFFERENT TYPE");
    }
    
    //MISMO MÉTODO CON DOS PARAMETROS
    public void run(double parametro1, int parametro2)
    {
        System.out.println("Vehicle is running WITH TWO PARAMETERS");
    }
    
}



class OtraClase extends Vehicle
{
    
}

class A_SobreCargaCambiandoNumeroArgamuentos extends Vehicle {

    public static void main(java.lang.String... args) {
        OtraClase obj = new OtraClase();
        
        obj.run();
        obj.run(2);
        obj.run(3.1,4);
        
               
    }
}
