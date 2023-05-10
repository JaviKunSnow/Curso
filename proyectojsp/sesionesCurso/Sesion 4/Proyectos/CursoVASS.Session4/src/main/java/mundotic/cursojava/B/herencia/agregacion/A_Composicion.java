/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundotic.cursojava.B.herencia.agregacion;

/**
 *
 * @author Javi
 */
class Operation {

    int square(int n) {
        return n * n;
    }
}

//CLASE CIRCULO
class A_Composicion {

    Operation op;//composicion  
    double pi = 3.14;

    double area(int radius) {
        op = new Operation();//inicializamos dentro de la clase el objeto
        int rsquare = op.square(radius);
        return pi * rsquare;
    }

    public static void main(String args[]) {
        //Puedo utilizarlo a través de la clase contendora o directamente porque tiene independencia y sentido
        A_Composicion c = new A_Composicion();        
        double result = c.area(5);
        System.out.println(result);
        
        //Igualmente lo podemos utilizar de forma directa  clase Operation
        Operation operation = new Operation();
        System.out.println(operation.square(5));
        
        
    }
}
