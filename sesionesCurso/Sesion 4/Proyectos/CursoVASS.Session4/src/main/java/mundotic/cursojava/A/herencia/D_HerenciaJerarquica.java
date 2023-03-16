/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundotic.cursojava.A.herencia;

/**
 *
 * @author Javi
 */
class Animl  {

    void comer() {
        System.out.println("como");
    }
}

class Pez extends Animl {

    void nadar() {
        System.out.println("nado");
    }
}

class Gato extends Animl {

    void maullar() {
        System.out.println("maullo.");
    }
}

class D_HerenciaJerarquica {

    public static void main(String args[]) {
        Gato c = new Gato();
        c.comer();
        c.maullar();
//c.bark();//C.T.Error  
    }
}
