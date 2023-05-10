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
interface Drawable4 {

    void draw();

    static int cube(int x) {     
        return x * x * x;
    }
}

class Rectangle4 implements Drawable4 {

    public void draw() {
        System.out.println("");
    }
}

class H_MetodoEstaticoInterfaz {

    public static void main(String args[]) {
        Drawable4 d = new Rectangle4();
        d.draw();
        System.out.println(Drawable4.cube(3));
    }
}
