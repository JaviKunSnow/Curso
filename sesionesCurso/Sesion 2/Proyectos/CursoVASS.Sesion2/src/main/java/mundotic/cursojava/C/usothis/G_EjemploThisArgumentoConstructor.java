/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundotic.cursojava.C.usothis;

/**
 *
 * @author Javi
 */
class Bdos {

    G_EjemploThisArgumentoConstructor obj;

    Bdos(G_EjemploThisArgumentoConstructor obj) {
        //rellenamos el miembro de la clase a traves del parametro recibido
        this.obj = obj;
    }

    void mostrar() {
        System.out.println(obj.dato);//using dato member of A4 class  
    }
}

public class G_EjemploThisArgumentoConstructor {

    int dato = 10;

    G_EjemploThisArgumentoConstructor() {
        
        //instanciamos el objeto al que pasamos el objeto actual como parametro
        Bdos b = new Bdos(this);
        b.mostrar();
    }

    public static void main(String args[]) {
        G_EjemploThisArgumentoConstructor a = new G_EjemploThisArgumentoConstructor();
    }

}
