/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ztic.colecciones.operacionesSet;

import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author Javi
 */
public class OperacionesSortedSet {

//Create a TreeSet
//Here is an example of creating a Java TreeSet instance:
    private SortedSet sortedSet = new TreeSet();
//Create a TreeSet With a Comparator
//It it possible to pass a Comparator, java.util.Comparator implementation to the constructor of the TreeSet. This Comparator will then decide the ordering of the elements in the TreeSet. Here is an example of creating a Java SortedSet with a Comparator:

 private Comparator comparator = new MyComparator();    

    public void Operaciones() 
    {
      
        sortedSet = new TreeSet(comparator);

        //Sort Order
        SortedSet sortedSet = new TreeSet(comparator);

        //Ascending vs Descending Sort Order 
        TreeSet treeSet = new TreeSet();

        treeSet.add("one");
        treeSet.add("two");
        treeSet.add("three");

        Iterator iterator = treeSet.descendingIterator();
        while (iterator.hasNext()) {
            String element = (String) iterator.next();
            System.out.println(element);
        }

        //Get Comparator Used
        comparator = sortedSet.comparator();
        
        

        //Add Elements
        sortedSet = new TreeSet();
        sortedSet.add("one");

        //Remove Elements
        sortedSet.remove("one");

        //Get First Element
        Object firstElement = sortedSet.first();

        //Get Last Element
        Object lastElement = sortedSet.last();

        //Iterate a SortedSet
        sortedSet = new TreeSet();

        sortedSet.add("one");
        sortedSet.add("two");
        sortedSet.add("three");

        iterator = sortedSet.iterator();
        while (iterator.hasNext()) {
            String element = (String) iterator.next();
            System.out.println(element);
        }

        //Get Head Set
        sortedSet = new TreeSet();

        sortedSet.add("a");
        sortedSet.add("b");
        sortedSet.add("c");
        sortedSet.add("d");
        sortedSet.add("e");

        SortedSet headSet = sortedSet.headSet("c");

        //Get Tail Set
        sortedSet = new TreeSet();

        sortedSet.add("a");
        sortedSet.add("b");
        sortedSet.add("c");
        sortedSet.add("d");
        sortedSet.add("e");

        SortedSet tailSet = sortedSet.tailSet("c");

        //Get Subset
        sortedSet = new TreeSet();

        sortedSet.add("a");
        sortedSet.add("b");
        sortedSet.add("c");
        sortedSet.add("d");
        sortedSet.add("e");

        SortedSet subSet = sortedSet.subSet("c", "e");

    }

}
