/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ztic.colecciones.otrasColecciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.stream.Stream;

/**
 *
 * @author Javi
 */
public class OperacionesStack {

    Stack stack = new Stack();

    public void operaciones() {
//        Create a Stack
//To use a Java Stack you must first create an instance of the Stack class. Here is an example of creating a Java Stack instance:

//Push Element on Stack
//Once you have a Java Stack instance, you can push elements to the top of the Stack. The elements you push onto the Stack must be Java objects. Thus, you actually push objects to the Stack.
//
//You push elements onto a Java Stack using its push() method. Here is an example of pushing an element (object) onto a Java Stack:
        stack.push("1");
//This Java example pushes a Java String with the text 1 onto the Stack. The String 1 is then stored at the top of the Stack.
//
//Pop Element From Stack
//Once an element has been pushed onto a Java Stack, you can pop that element from the Stack again. Once an element is popped off the Stack, the element is removed from the Stack. The top element of the Stack is then whatever element that was pushed onto the Stack just before the element just popped.
        stack.pop();
//You pop an element off a Java Stack using the pop() method. Here is an example of popping an element off a Stack using the pop() method:

        stack = new Stack();

        stack.push("1");

        String topElement = (String) stack.pop();
//Once an element is popped off a Stack, the element is no longer present on the Stack.
//
//Peek at Top Element of Stack
//The Java Stack class has a method called peek() which enables you to see what the top element on the Stack is, without popping off the element. Here is an example of peeking at the top of a Java Stack:
        stack = new Stack();

        stack.push("1");

        topElement = (String) stack.peek();
//After running this Java example the topElement variable will contain the String object 1 which was pushed onto the Stack just before peek() was called. The String object is still present on the Stack after calling peek().
//
//Search the Stack
//You can search for an object on the stack to get it's index, using the search() method. The object's equals() method is called on every object on the Stack to determine if the searched-for object is present on the Stack. The index you get is the index from the top of the Stack, meaning the top element on the Stack has index 1.
//
//Here is how you search a Stack for an object:

        stack = new Stack();

        stack.push("1");
        stack.push("2");
        stack.push("3");

        int index = stack.search("3");     //index = 1

//Iterate Elements of Stack
//You can iterate the elements of a Java Stack by obtaining a Java Iterator from the Stack. You obtain an Iterator by calling the Stack iterator() method. Here is an example of obtaining an Iterator from a Java Stack and iterating it:
        stack = new Stack();

        stack.push("123");
        stack.push("456");
        stack.push("789");

        Iterator iterator = stack.iterator();
        while (iterator.hasNext()) {
            Object value = iterator.next();
        }
//Process Stack Using Stream
//It is also possible to process the elements on a Java Stack via the Java Stream API. You do so by first obtaining a Stream from the Stack via the stream() method.
//
//Once you have obtained a Stream from the Stack, you can process the elements in the stream. Here is an example of obtaining a Stream from a Stack and processing the elements:

        Stack stack = new Stack();
        stack.push("A");
        stack.push("B");
        stack.push("C");

        Stream stream = stack.stream();

        stream.forEach((element) -> {
            System.out.println(element);  // print element
        });
//Notice, that this example uses a Java Lambda as parameter to the Stream.forEach() method. The lambda just prints out the element to System.out
//
//Reverse List Using Stack
//You can use a Java Stack to reverse a Java List. You do so by pushing all the elements from the List onto the Stack, starting with the element with index 0, then 1 etc. Each element is removed from the List, then pushed onto the Stack. Once all the elements are on the Stack, you pop the elements off one by one and add them back to the empty list. Here is an example of reversing a Java List using a Java Stack:

        List list = new ArrayList();
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println(list);

        stack = new Stack();
        while (list.size() > 0) {
            stack.push(list.remove(0));
        }

        while (stack.size() > 0) {
            list.add(stack.pop());
        }

        System.out.println(list);
//Stack Use Cases
//A Stack is really handy for some types of data processing, for instance if you are parsing an XML file using either SAX or StAX. For an example, see my Java SAX Example in my Java XML tutorial.
    }

}
