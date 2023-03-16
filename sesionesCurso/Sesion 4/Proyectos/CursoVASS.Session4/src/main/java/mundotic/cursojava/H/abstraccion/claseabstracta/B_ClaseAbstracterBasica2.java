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
abstract class Forma {

    abstract void draw();

    abstract Forma getForma();    
    
    static Forma getForma2(String tipo)
    {
        if(tipo.equals("Circulo"))
        {
            return new Circulo();
        }
        
        
        if(tipo.equals("Rectangulo"))
        {
            return new Rectangulo();
        }       
        
        
        return null;
    }

}

class Rectangulo extends Forma {

    @Override
    void draw() {
        System.out.println("Rectangulo");
    }

    @Override
    Forma getForma() {
        return this;
    }
}

class Circulo extends Forma {

    @Override
    void draw() {
        System.out.println("Circulo");
    }

    @Override
    Forma getForma() {
        return this;
    }
}

class B_ClaseAbstracterBasica2 {

    public static void main(String args[]) {
       
        Forma s = Forma.getForma2("Circulo");
        s.draw();
        
        s = new Circulo();//En un caso real, tendriamos que implementar un metodo por ejemplo que fuera getShape y que nos devolviera return new Circulo()
        s.draw();
        
        
       

        s = new Rectangulo();//En un caso real, tendriamos que implementar un metodo por ejemplo que fuera getShape y que nos devolviera return new Rectangulo()
        s.draw();
    }
}
