/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ztic.genericos.C.claseGenerica;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import static ztic.genericos.C.claseGenerica.GenericTest.drawShapes;
import static ztic.genericos.C.claseGenerica.Main.Gen.printArray;

/**
 *
 * @author Javi
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    static class Gen<T> {
      
    	T obj;
        T obj2;
        int a;

        void insertar(T obj) {
            this.obj = obj;
        }
        
         void insertar(T obj, T obj2) {
            this.obj = obj;
        }

        T get() {
            return this.obj;
        }

        public <E> void devolver() {

        }

        public static <E> void printArray(E[] elements) {
            for (E element : elements) {
                System.out.println(element);
            }
            System.out.println();
        }
    }
    
    
    public static void main(String[] args) {
        
        
        Collection valores = new ArrayList();   
        
        
        Gen<Integer> generica;

        generica = new Gen<>();
        generica.insertar(15);

        System.out.println(generica.get());

        Gen<String> generica2;
        generica2 = new Gen<>();

        generica2.insertar("afs");
        System.out.println(generica2.get());

        Integer[] intArray = {10, 20, 30, 40, 50};
        Character[] charArray = {'J', 'A', 'V', 'A'};

        System.out.println("Printing Integer Array");
        printArray(intArray);

        System.out.println("Printing Character Array");
        printArray(charArray);

        List<Rectangle> list1 = new ArrayList<>();
        list1.add(new Rectangle());

        List<Circle> list2 = new ArrayList<>();
        list2.add(new Circle());
        list2.add(new Circle());

        drawShapes(list1);
        drawShapes(list2);

    }

}

abstract class Shape {

    abstract void draw();
}

class Rectangle extends Shape {

    void draw() {
        System.out.println("drawing rectangle");
    }
}

class Circle extends Shape {

    void draw() {
        System.out.println("drawing circle");
    }
}

class GenericTest {
//creating a method that accepts only child class of Shape  

    public static void drawShapes(List<? extends Shape> lists) {
        for (Shape s : lists) {
            s.draw();//calling method of Shape class by child class instance  
        }
    }
}
