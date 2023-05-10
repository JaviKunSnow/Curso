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
interface Interfaz {

    void a();

    void b();

    void c();

    void d();
}

abstract class ClaseAbstracta implements Interfaz {

    @Override
    public void c() {
        System.out.println("I am c");
    }    
}

class Hija1 extends ClaseAbstracta {

    @Override
    public void a() {
        System.out.println("I am a");
    }

    @Override
    public void b() {
        System.out.println("I am b");
    }

    @Override
    public void d() {
        System.out.println("I am d");
    }
}

class Hija2 extends ClaseAbstracta {

    @Override
    public void a() {
        System.out.println("I am a2");
    }

    @Override
    public void b() {
        System.out.println("I am b2");
    }

    @Override
    public void d() {
        System.out.println("I am d");
    }
}

abstract class Clase implements Interfaz
{
    
}

class I_InterfazYClaseAbstracta {

   public static void main(String... varargs) {
        Interfaz a = new Hija();
        a.a();
        a.b();
        a.c();
        a.d();
    }
}
