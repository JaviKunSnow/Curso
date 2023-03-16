/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundotic.cursojava.A.herencia;

import java.util.ArrayList;

/**
 *
 * @author Javi
 */
class Animales {

    int patas;
    ArrayList lista;

    Animales() {
              patas = 5;
    }

    void comer() {
        System.out.println("eating...");
    }
}

class Perro extends Animales {

    void ladrar() {
        System.out.println("barking...");
    }
}

class Cachorro extends Perro {

    void llorar() {
        System.out.println("weeping...");
    }
}

class C_HerenciaMultinivel {

    public static void main(String args[]) {
        Cachorro d = new Cachorro();
        
        d.llorar();
        d.ladrar();
        d.comer();

    }
}
