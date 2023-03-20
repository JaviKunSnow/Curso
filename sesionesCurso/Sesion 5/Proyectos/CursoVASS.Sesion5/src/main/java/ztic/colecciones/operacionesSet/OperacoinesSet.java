/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ztic.colecciones.operacionesSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;

/**
 *
 * @author Javi
 */
public class OperacoinesSet {

    //tipos de SET
    Set setA = new HashSet();
    Set setB = new HashSet();
    Set setC = new LinkedHashSet();
    Set setD = new TreeSet();

    public void Añadir() {
        Set setA = new HashSet();

        setA.add("element 1");
        setB.add("element 2");
        setC.add("element 3");
        //De esta manera añadimos al final de la lista
    }

    public void AñadirEnPosicion(int posicion) {

    }

    //Copia todos los elementos de un set en otro
    public void CopiarSet(List listaOriginal) {
        Set set = new HashSet();
        set.add("one");
        set.add("two");
        set.add("three");

        Set set2 = new HashSet();
        set2.add("four");

        set2.addAll(set);

    }

    public void eleminarRepetidosDesdeOtraColeccion() {
        Set set = new HashSet();
        set.add("one");
        set.add("two");
        set.add("three");

        Set set2 = new HashSet();
        set2.add("three");

        set.removeAll(set2);
    }

    public void existeElemento(String elemento) {

        Set set = new HashSet();

        set.add("123");
        set.add("456");

        boolean contains123 = set.contains("123");

        //Comprobar que existe un valor null
        set.add(null);

        boolean containsElement = set.contains(null);

        System.out.println(containsElement);
    }

    public void eleminarElemento(Object elemento) {
        setA.remove(elemento);

    }

    public void vaciarSet() {
        setA.clear();

    }

    public void esVacio() {
        Set set = new HashSet();

        boolean isEmpty = set.isEmpty();
    }

    public void setTamano() {
        Set set = new HashSet();

        set.add("123");
        set.add("456");
        set.add("789");

        int size = set.size();
    }

    public void mezclarSet(List unaLista) {

        Set set = new HashSet();
        set.add("one");
        set.add("two");
        set.add("three");

        Set set2 = new HashSet();
        set2.add("three");
        set2.add("four");

        set.retainAll(set2);
    }

    public void tamañoSet() {
        setA.size();
    }

    public void crearSubSet() {

    }

    public void convertListToSet() {
        Set set = new HashSet();
        set.add("123");
        set.add("456");

        List list = new ArrayList();
        list.addAll(set);

    }

    public void recorrerSetIterator() {

        Iterator iterator = this.setA.iterator();
        while (iterator.hasNext()) {
            String element = (String) iterator.next();
        }

    }

    public void recorerrSetForEach() {
        for (Object object : setA) {
            String element = (String) object;
        }
    }

    public void recorrerSetStreamAPI() {
        Set set = new HashSet();

        set.add("one");
        set.add("two");
        set.add("three");

        Stream stream = set.stream();

        stream.forEach((element) -> {
            System.out.println(element);
        });

    }

    public void extraerElemento(int posicion) {
      
    }

    public void encontrarPrimeraPosicionObjeto(String elemento) {

    }

    public void encontrarUltimaPosicionObjeto(String elemento) {

    }

    public void recorrerListaBucle() {

    }

    public void recorrerSetGenericaIterator() {

    }

    public void recorrerSetAbstracta() {

    }

    public void ordenarSet() {

    }

    public void ordenarSetComparator() {

    }

}
