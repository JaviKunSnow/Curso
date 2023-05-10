/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ztic.colecciones.otrasColecciones;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author Javi
 */
public class OperacionesDeque {
    
     private Deque deque = new LinkedList();
     private Deque deque2 = new ArrayDeque();

    public void operaciones() {


        

//add()
//You add elements to the beginning end of a Deque using the add() method. Here is an example of adding an element to the end of a Java Deque:

        deque = new ArrayDeque();
        deque.add("element 1");

//The add() method is actually inherited from the Queue interface.
//addLast()
//The addLast() method also adds an element to the end (tail) of a Java Deque. This is the Deque interface's equivalent of the add() method inherited from the Queue interface. Here is an example of adding an element to a Java Deque instance using the addLast() method:
         deque = new ArrayDeque();
        deque.addLast("element 1");

//addFirst()
//To add an element at the beginning instead of the end of a Java Deque you call the addFirst() method instead. Here is an example of adding an element to the beginning (head) of a Java Deque:
         deque = new ArrayDeque();
        deque.addFirst("element 1");
        

//Peek at Element in Deque
//You can peek at the first and last elements of a Java Deque. Peeking at an element means obtaining a reference to the element without removing the element from the Deque. You can peek at the first and last element of a Java Deque using these methods:
//
//peekFirst()
//peekLast()
//Both of these methods will be covered in the following sections.
//
//peekFirst()
//To peek at the first element of a Deque using the peekFirst() method. Here is an example of peeking at the first element of a Java Deque using the peekFirst() method:
         deque = new ArrayDeque();
        deque.add("first element");
        Object firstElement = deque.peekFirst();

//peekLast()        
//To peek at the last element of a Java Deque you can use the peekLast() method. Here is an example of peeking at the last element of a Java Deque using the peekLast() method:
         deque = new ArrayDeque();
        deque.add("first element");
        deque.add("last element");
        Object lastElement = deque.peekLast();

//After running this Java example, the variable lastElement will point to the String last element - since that String was the last element added to the Deque.
//
//Remove Element From Deque
//To remove elements from a Java Deque, you can use one of the following methods:
//
//remove()
//removeFirst()
//removeLast()
//Each of these methods will be explained in the following sections.
//
//remove()
//The remove() method removes the first element of a Java Deque. That is the element at the head of the Deque. The remove() method is actually inherited from the Queue interface. The remove() method returns the element that is removed from the Deque. Here is an example of removing the first element a Java Deque using the remove() method:
         deque = new LinkedList();
        deque.add("element 0");
        Object removedElement = deque.remove();

//removeFirst()
//The removeFirst() method also removes the first element from a Deque - the element at the head of the Deque. Here is an example of removing the first element of a Java Deque using the removeFirst() method:
         deque = new LinkedList();
        deque.add("element 0");
         removedElement = deque.removeFirst();

//removeLast()
//The removeLast() method removes the last element of a Deque - meaning the element at the tail of the Deque. Here is an example of removing the last element of a Java Deque using the removeLast() method:
        deque = new LinkedList();

        deque.add("element 0");
        deque.add("element 1");
        deque.add("element 2");
        removedElement = deque.removeLast();

//        After running this Java example the removedElement variable will point to the String object element 2 - since that element was the last element of the Deque when removeLast
//        () was called
//        .

//Generic Deque
//By default you can put any Object into a Java Deque. However, using Java Generics it is possible to limit the types of object you can insert into a Deque. Here is an example:
//
//Deque<MyObject> deque = new LinkedList<MyObject>();
//This Deque can now only have MyObject instances inserted into it. You can then access and iterate its elements without casting them. Here is how it looks:

Object myObject = deque.remove();

        for (Object anObject : deque) {
            //do someting to anObject...   
        }
//For more information about Java Generics, see the Java Generics Tutorial.
//
//Iterate Elements of Deque
//You can also iterate all elements of a Java Deque, instead of just processing the elements one at a time. You can iterate the elements of a Deque in two ways:
//
//Using an Iterator.
//Using the for-each loop.
//Both of these options will be explained in the following sections. Note, that the sequence in which the elements are obtained during iteration depends on the concrete Deque implementation. However, the method to iterate the elements is the same regardless of implementation.
//
//Iterate Elements via Iterator
//The first way of iterating the elements of a Deque is to obtain an Iterator from the Deque and iterate the elements via that. Here is an example of iterating the elements of a Java Deque via an Iterator:

        deque = new LinkedList();
        deque.add("element 0");
        deque.add("element 1");
        deque.add("element 2");

        Iterator iterator = deque.iterator();
        while (iterator.hasNext()) {
            String element = (String) iterator.next();
        }

//Iterate Elements via For-Each Loop
//The second way to iterate the elements of a Deque is to use the for-each loop in Java. Here is an example of iterating the elements of a Java Deque via the for-each loop:
        deque = new LinkedList();
        deque.add("element 0");
        deque.add("element 1");
        deque.add("element 2");

        for (Object object : deque) {
            String element = (String) object;
        }

    }

}
