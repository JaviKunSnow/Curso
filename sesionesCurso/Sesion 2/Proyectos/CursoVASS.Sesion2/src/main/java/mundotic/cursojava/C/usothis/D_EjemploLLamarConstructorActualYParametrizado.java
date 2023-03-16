package mundotic.cursojava.C.usothis;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Javi
 */
//constructor actual
class A {

    A() {
        System.out.println("Constructo a");
    }

    A(int x) {
        //llamada al constructor por defecto de la clase
        this();
        System.out.println("Valor de x desde A: " + x);
    }
}


class B {

    B() {
        //llamada al constructor parametrizado
        this(5);
        System.out.println(" Constructor b");
    }

    B(int x) {
        System.out.println("Valor de x desde B: " + x);
    }
}

class D_EjemploLLamarConstructorActualYParametrizado {

    public static void main(String args[]) {
        A a = new A(10);
        B b = new B();
    }
}
