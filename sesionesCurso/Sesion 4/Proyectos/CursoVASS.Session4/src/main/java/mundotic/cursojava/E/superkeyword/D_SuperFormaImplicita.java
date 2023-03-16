/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundotic.cursojava.E.superkeyword;

/**
 *
 * @author Javi
 */
class Animal4 {

    Animal4()
    {
    	System.out.println("llamado constructor padre");
    }
}

class Dog4 extends Animal4 {

    Dog4() {
    	
        System.out.println("dog is created");
    }
}

class D_SuperFormaImplicita {

    public static void main(String args[]) {
        Dog4 d = new Dog4();
    }
}
