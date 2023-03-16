/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundotic.cursojava.I.abstraccion.interfaz;

/**
 *
 * @author Javi
 */
interface Dibuja {
    //AL SER FINAL SIEMPRE DEBERIAN DE ESTAR ESCRITOS EN MAYUSCULAS
    int NUMERO = 9;
    void draw();
}

class Rectangulo implements Dibuja {

    @Override
    public void draw() {        
        System.out.println("Rectangulo");
    }
}

class Circulo implements Dibuja {

    @Override
    public void draw() {
        System.out.println("Circulo");
    }
}
//Using interface: by third user  

class B_EjemploBasicoInterfaz {

    public static void main(String args[]) {
        Dibuja d = new Circulo();//In real scenario, object is provided by method e.g. getDrawable()  
        d.draw();
        d = new Rectangulo();
        d.draw();
    }
}
