/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ztic.colecciones.operacionesListas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;
import java.util.stream.Stream;

/**
 *
 * @author Javi
 */
public class OperacionesListas {

    private List listA = new ArrayList();
    private List listB = new LinkedList();
    private List listC = new Vector();
    private List listD = new Stack();
    
    //declaracion de una lista generica
    List<Object> list;
    List<Integer> listaEnteros = new ArrayList<>();
    List<String> listaCadenas = new ArrayList<>();
    List<Scanner> listaScanner = new ArrayList<>();

    List lista2 = new ArrayList<>();

    public OperacionesListas() {
        this.list = new ArrayList<>();
    }

    public void Añadir() {

        //para añadir solo tenemos que utilizar el metodo Add
        listA.add("Un ejemplo");
        listB.add(1);
        listC.add(null); //Es posible insertar valores null
        listD.add(new Object());
        
        

        //De esta manera añadimos al final de la lista
    }

    public void AñadirEnPosicion(int posicion) {
        //llevaran la logica previa a la inserción
        listA.add(posicion, "Un ejemplo");
        listC.add(posicion, null);
    }

    public void CopiarLista(List listaOriginal) {

        listaOriginal.add(12);
        listaOriginal.add(15);
        this.listA.addAll(listaOriginal);

        System.out.println("Tamaño lista original" + listaOriginal.size());
        System.out.println("Tamaño de la lista Copia " + listA.size());
    }

    public void extraerElemento(int posicion) {
        listA.add(posicion, "Hola");
        Object o = (Object) listA.get(posicion);
        String s = (String) listA.get(posicion);

        System.out.println(s);
    }

    public void encontrarPrimeraPosicionObjeto(String elemento) {
        listA.add(021);
        int posicion = listA.indexOf(021);

        if (posicion != -1) {
            System.out.println("El elemento se encuentra en la posicion " + posicion);
        } else {
            System.out.println("El elemento no se ha encontrado");
        }
    }

    public void encontrarUltimaPosicionObjeto(String elemento) {

        listA = new ArrayList();

        listA.add(021);
        listA.add(022);
        listA.add(021);

        int posicion = listA.lastIndexOf(021);

        if (posicion != -1) {
            System.out.println("El elemento se encuentra en la posicion " + posicion);
        } else {
            System.out.println("El elemento no se ha encontrado");
        }

    }

    public void existeElemento(String elemento) {
        listA = new ArrayList();

        listA.add(021);
        listA.add(022);

        boolean existe = listA.contains(elemento);

        if (existe) {
            System.out.println("El elemento esta en la lista");
        } else {
            System.out.println("El elemento no esta en la lista");
        }
    }

    public void eleminarElemento(String elemento) {
        if (listA.remove(elemento)) {
            System.out.println("El elemento se ha eleminado correctamente");
        } else {
            System.out.println("El elemento no se ha eliminado correctamente");
        }
    }

    public void eleminarElementoPorPosicion(int posicion) {

        System.out.println(listA.remove(posicion));
    }

    public void vaciarLista() {
        listA.clear();
    }

    public void mezclarListas(List unaLista) {
        List list = new ArrayList();
        List otherList = new ArrayList();

        String element1 = "element 1";
        String element2 = "element 2";
        String element3 = "element 3";
        String element4 = "element 4";

        list.add(element1);
        list.add(element2);
        list.add(element3);

        otherList.add(element1);
        otherList.add(element3);
        otherList.add(element4);

        list.addAll(otherList);
    }

    public void tamañoLista() {

        System.out.println(this.listA.size());
    }

    public void crearSubLista() {
        List list = new ArrayList();

        list.add("element 1");
        list.add("element 2");
        list.add("element 3");
        list.add("element 4");

        List sublist = list.subList(1, 3);
    }

    public void convertListToSet() {
        List list = new ArrayList();

        list.add("element 1");
        list.add("element 2");
        list.add("element 3");
        list.add("element 3");

        Set set = new HashSet();
        set.addAll(list);
    }

    public void convertListToArray() {
        List list = new ArrayList();

        list.add("element 1");
        list.add("element 2");
        list.add("element 3");
        list.add("element 3");

        Object[] objects = list.toArray();

        List<Integer> list2 = new ArrayList<>();

        list2.add(1);
        list2.add(3);
//        list2.add("element 3");
//        list2.add("element 3");

        Integer[] objects1 =  (Integer[]) list2.toArray(new Integer[0]);
        
        Integer[] objects2 = new Integer[0];
        
        objects2[0]=0;
        
        
        
        System.out.println("");
        
    }

    public void convertArrayToList() {
        String[] values = new String[]{"one", "two", "three"};

        List list = Arrays.asList(values);
        
        System.out.println(list.get(0));
    }

    public void recorrerListaAbstracta() {

        list.add(new Object());
        list.add("hola");
        list.add(1);
        Object myObject = list.get(0);

        for (Object anObject : list) {
            //do someting to anObject...
            System.out.println(anObject.toString());
        }
    }

    public void ordenarLista() {
        List<String> list = new ArrayList<String>();

        list.add("c");
        list.add("b");
        list.add("a");

        Collections.sort(list);

        System.out.println(list.get(0).toString());
    }

    public class Car {

        public String brand;
        public String numberPlate;
        public int noOfDoors;

        public Car(String brand, String numberPlate, int noOfDoors) {
            this.brand = brand;
            this.numberPlate = numberPlate;
            this.noOfDoors = noOfDoors;
        }
    }

    public void ordenarListaComparator() {
        List<Car> list = new ArrayList<>();

        list.add(new Car("Volvo V40", "XYZ 201845", 5));
        list.add(new Car("Citroen C1", "ABC 164521", 4));
        list.add(new Car("Dodge Ram", "KLM 845990", 2));

        Comparator<Car> carBrandComparator = new Comparator<Car>() {

            @Override
            public int compare(Car car1, Car car2) {
                return car1.brand.compareTo(car2.brand);
            }
        };

        Collections.sort(list, carBrandComparator);

        //otro ejemplo comparando por mas campos
        list = new ArrayList<>();

        list.add(new Car("Volvo V40", "XYZ 201845", 5));
        list.add(new Car("Citroen C1", "ABC 164521", 4));
        list.add(new Car("Dodge Ram", "KLM 845990", 2));

        Comparator<Car> carBrandComparatorLambda
                = (car1, car2) -> car1.brand.compareTo(car2.brand);

        Comparator<Car> carNumberPlatComparatorLambda
                = (car1, car2) -> car1.numberPlate.compareTo(car2.numberPlate);

        Comparator<Car> carNoOfDoorsComparatorLambda
                = (car1, car2) -> car1.noOfDoors - car2.noOfDoors;

        Collections.sort(list, carBrandComparatorLambda);
        Collections.sort(list, carNumberPlatComparatorLambda);
        Collections.sort(list, carNoOfDoorsComparatorLambda);
    }

    public void recorrerListaIterator() {
        List list = new ArrayList();

        list.add("first");
        list.add("second");
        list.add("third");

        Iterator iterator = list.iterator();
        
        while (iterator.hasNext()) {
            Object next = iterator.next();
            
            //el procesamiento vendria a continuacion
        }
    }

    public void recorrerListaGenericaIterator() {
        List<String> list = new ArrayList<>();

        list.add("first");
        list.add("second");
        list.add("third");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String obj = iterator.next();
            
            //todo lo que sea con cadenas
        }
    }

    public void recorerrListaForEach() {
        List list = new ArrayList();

        list.add("first");
        list.add("second");
        list.add("third");

        for (Object element : list) {
            System.out.println(element);
        }

        //lista Generica
        list = new ArrayList<String>();

        //add elements to list
        for (Object a : list) {
            System.out.println((String)a);
        }
    }

    public void recorrerListaBucle() {
        List list = new ArrayList();

        list.add("first");
        list.add("second");
        list.add("third");

        for (int i = 0; i < list.size(); i++) {
            Object element = list.get(i);
        }

        //LISTA GENERICA
        list = new ArrayList<String>();

        list.add("first");
        list.add("second");
        list.add("third");

        for (int i = 0; i < list.size(); i++) {
            String element = (String) list.get(i);
        }
    }

    public void recorrerListaStreamAPI() {

        List<String> stringList = new ArrayList<String>();

        stringList.add("abc");
        stringList.add("def");

        Stream<String> stream = stringList.stream();

        //RECORRER LISTA GENERICA
        stringList = new ArrayList<String>();

        stringList.add("one");
        stringList.add("two");
        stringList.add("three");

        stream = stringList.stream();
        stream.forEach(element -> {
                    System.out.println(element);
                });
    }

}
