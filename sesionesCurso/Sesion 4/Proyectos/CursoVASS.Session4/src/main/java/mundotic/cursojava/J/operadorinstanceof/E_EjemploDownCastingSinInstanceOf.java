/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundotic.cursojava.J.operadorinstanceof;

/**
 *
 * @author Javi
 */
class E_EjemploDownCastingSinInstanceOf {
}

class Aguila extends E_EjemploDownCastingSinInstanceOf {

    static void method(E_EjemploDownCastingSinInstanceOf a) {
        Aguila d = (Aguila) a;//downcasting  
        System.out.println("ok downcasting performed");
        
    }

    public static void main(String[] args) {
        E_EjemploDownCastingSinInstanceOf a = new Aguila(); //upcasting
        Aguila.method(a);
        

        E_EjemploDownCastingSinInstanceOf b = new E_EjemploDownCastingSinInstanceOf();
        Aguila.method(b); // Dara un error en tiempo de ejecucion, pero no si lo hubieramos hecho con instanceof. Podriamos lanzar y recoger la excepcion, pero seguiria estando mal
    }

}
