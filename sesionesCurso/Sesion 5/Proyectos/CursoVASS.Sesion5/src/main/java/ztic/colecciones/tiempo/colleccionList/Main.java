/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ztic.colecciones.tiempo.colleccionList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Javi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         //PIDELES QUE HAGAN LO MISMO CON LOS TIEMPOS DE INSERCION

        final List<Integer> arrayList = new ArrayList<Integer>(1_000_000);
        final List<Integer> linkedList = new LinkedList<Integer>();

        final Long startArrayTime = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            arrayList.add(i);
        }
        final Long endHashSetTime = System.currentTimeMillis();
        System.out.println("Time spent by ArrayList: " + (endHashSetTime - startArrayTime));

        final Long startLinkedListTime = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            linkedList.add(i);
        }
        final Long endTreeSetTime = System.currentTimeMillis();
        System.out.println("Time spent by LinkedList: " + (endTreeSetTime - startLinkedListTime));

    }

}
