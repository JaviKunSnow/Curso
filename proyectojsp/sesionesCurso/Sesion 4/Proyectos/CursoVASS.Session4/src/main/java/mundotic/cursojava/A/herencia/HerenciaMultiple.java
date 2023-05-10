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
class A {

    void msg() {
        System.out.println("Hello");
    }
}

class B {

    void msg() {
        System.out.println("Welcome");
    }
}

interface Ainter
{
    
}

interface Binter
{
    
}


public class HerenciaMultiple extends A implements Ainter, Binter { //si pudiera ser

    public  static void main(String args[]) {
        HerenciaMultiple obj = new HerenciaMultiple();
        obj.msg();//Now which msg() method would be invoked?  
    }
}
