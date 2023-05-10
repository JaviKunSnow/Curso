/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundotic.cursojava.I.abstraccion.interfaz;

import java.io.IOException;
import java.util.Iterator;

/**
 *
 * @author Javi
 */
interface Dibujo {

    void print();
}

interface Mostrar extends Dibujo, Appendable {

    void show();
}

class Clase2{
    
}

class D_EjemploImplementarHerenciaMultiple extends Clase2 implements Dibujo, Mostrar, Cloneable,Iterable<Object> {

    @Override
    public void print() {
        System.out.println("Hello");
    }

    @Override
    public void show() {
        System.out.println("Welcome");
    }

    public static void main(String args[]) {
        D_EjemploImplementarHerenciaMultiple obj = new D_EjemploImplementarHerenciaMultiple();
        obj.print();
        obj.show();
    }

    @Override
    public Iterator<Object> iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Appendable append(CharSequence cs) throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Appendable append(CharSequence cs, int i, int i1) throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Appendable append(char c) throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
