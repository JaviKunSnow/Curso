
package ztic.genericos.C.claseGenerica;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author Javi
 */


class Generica2<A, B, C extends Collection> {

    private A obj1;
    private B obj2;
    private C coleccion;
    static Iterator it;

    public Generica2(A obj1, B obj2, C coleccion) {
        super();
        this.obj1 = obj1;
        this.obj2 = obj2;
        this.coleccion = coleccion;
    }

    //Creo que necesitas revisar el contexto estático.
    //El objetivo de los genéricos es no tener que utilizar Castings de ningún tipo porque se supone que ya viene restringido desde otro lugar
    //Porque voy a tener que castear si ya estoy diciendo que es una coleccion?
    public static <C extends Collection> void recorrerColeccion(C  coleccion) {
        
        while (coleccion.iterator().hasNext()) {
            System.out.println(it.next());
        }
    }

    public A getObj1() {
        return obj1;
    }

    public void setObj1(A obj1) {
        this.obj1 = obj1;
    }

    public B getObj2() {
        return obj2;
    }

    public void setObj2(B obj2) {
        this.obj2 = obj2;
    }

    public C getColeccion() {
        return coleccion;
    }

    public void setColeccion(C coleccion) {
        this.coleccion = coleccion;
    }

}


class Principal2 {

    public static void main(String... args) {
        ArrayList<Integer> array = new ArrayList<>();
        HashSet hash = new HashSet();
        
        
        hash.add(1);
        hash.add("h");
        
        array.add(1);
        array.add(2);
        
        Generica2.recorrerColeccion(hash);
        Generica2.recorrerColeccion(array);
        

    }
}
