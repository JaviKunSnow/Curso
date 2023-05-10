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
class Animales {

    protected String color = "white";
}



class Perro extends Animales {

    String color = "black";

    void printColor() {
        System.out.println(this.color);//prints color of Dog class  
        System.out.println(super.color);//prints color of Animal class  
    }
}



class A_SuperLLamarVariableClasePadre {

    public static void main(String args[]) {
        Perro d = new Perro();
        d.printColor();
    }
}
