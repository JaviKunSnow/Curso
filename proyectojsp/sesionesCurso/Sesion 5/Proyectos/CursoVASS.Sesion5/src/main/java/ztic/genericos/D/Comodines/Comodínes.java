/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ztic.genericos.D.Comodines;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Desarrollo
 */
public class Comodínes {
   public static void main(String args[]) {
        List<Rectangle> list1 = new ArrayList<Rectangle>();
        list1.add(new Rectangle());

        List<Circle> list2 = new ArrayList<Circle>();
        list2.add(new Circle());
        list2.add(new Circle());

        GenericTest.drawShapes(list1);
        GenericTest.drawShapes(list2);
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
