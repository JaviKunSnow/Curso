/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ztic.colecciones.otrasColecciones;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author Javi
 */
public class OperacionesQueue {

    private Queue queueA = new LinkedList();
    private Queue queueB = new PriorityQueue();

    public void operaciones() {

        // Add Element to Queue
        //To add elements to a Java Queue you call its add() method.This method is inherited from the Collection interface. Here is an example of adding elements to a Java Queue:
        queueA = new LinkedList();

        queueA.add("element 1");
        queueA.add("element 2");
        queueA.add("element 3");

//        //Get Element From Queue
//        The order in which the elements added to a Java Queue are stored internally, depends on the implementation.The same is true for the order  in which  {
//            elements 
//        }
//        are retrieved from the queue
//        . You should consult the JavaDoc for the concrete  Java Queue  {
//            implementation 
//        }
//        for more information  about the  {
//            order 
//        }
//        in which elements are stored internally.Peek at the Queue
//        You can peek at the element at the head of a Queue without taking the element out of the Queue
//        . This is done via the element() or the peek() method.The element
//        () method returns the first element in the Queue
//        . If the Queue is empty
//        , the element() method throws a NoSuchElementException
//        . Here is an example of peeking at the first element of a Java Queue using the element() method:
        queueA = new LinkedList();

        queueA.add("element 1");
        queueA.add("element 2");
        queueA.add("element 3");

        Object firstElement = queueA.element();
//   

//The peek
//        () works like the element
//        () method except it does not throw an exception if the    Queue         
//        is empty.Instead it just returns null. Here is an example of peeking at the first element of a Queue using the peek
//        () method:
        Queue queue = new LinkedList();

        queue.add("element 1");
        queue.add("element 2");
        queue.add("element 3");

//        Object firstElement = queue.peek();
//        Object firstElement = queueA.element();
//        Iterate All Elements in Queue You can also iterate all elements of a Java Queue
//        , instead of just processing one at a time
//        . Here is an example of iterating all elements in a Java Queue
//        :
        Queue queueA = new LinkedList();

        queueA.add("element 0");
        queueA.add("element 1");
        queueA.add("element 2");

//access via Iterator
        Iterator iterator = queueA.iterator();
        while (iterator.hasNext()) {
            String element = (String) iterator.next();
        }

//access via new for-loop
        for (Object object : queueA) {
            String element = (String) object;
        }
//        When iterating a Queue via its Iterator or via the for -each   loop(which   also   {
//            uses 
//        }
//        the Iterator behind the scene
//        ), the sequence in which the elements are iterated depends on the queue implementation.Remove Element From Queue
//        To remove elements from a Java Queue
//        , you call the remove
//        () method.This method removes the element at the head of the Queue.In most Queue implementations the head and tail of the queue are at opposite ends.It is possible, however
//        , to implement the Queue interface so that the head and tail of the queue is in the same end.In that 

//case you would have a stack.
//
//Here is an example of removing an element from a Java Queue:
//
//Object firstElement = queue.remove();
//Generic Queue
//By default you can put any Object into a Queue, but from Java 5, Java Generics makes it possible to limit the types of object you can insert into a Queue. Here is an example:
//
//Queue<MyObject> queue = new LinkedList<MyObject>();
//This Queue can now only have MyObject instances inserted into it. You can then access and iterate its elements without casting them. Here is how it looks:
        Object myObject = queue.remove();

        for (Object anObject : queue) {
            //do someting to anObject...   
        }
    }

}
