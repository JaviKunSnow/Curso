/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ztic.colecciones.tiempo.colleccionSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Javi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
     //PIDELES QUE HAGAN LO MISMO CON LOS TIEMPOS DE INSERCION
    //Este ejemplo nos muestra cuanto tiempo tarda en procesar el mismo tipo de informacion cada una de las estructuras de la coleccion tipo SET
    public static void main(String[] args) {
        
        final Set<Integer> hashSet = new HashSet<Integer>(1_000_000);
        final Long startHashSetTime = System.currentTimeMillis();
        
        for (int i = 0; i < 1000000; i++) {
            hashSet.add(i);
        }
        
        final Long endHashSetTime = System.currentTimeMillis();
        
        System.out.println("Time spent by HashSet: " + (endHashSetTime - startHashSetTime));

        final Set<Integer> treeSet = new TreeSet<Integer>();
        final Long startTreeSetTime = System.currentTimeMillis();
        
        for (int i = 0; i < 1000000; i++) {
            treeSet.add(i);
        }
        
        final Long endTreeSetTime = System.currentTimeMillis();
        System.out.println("Time spent by TreeSet: " + (endTreeSetTime - startTreeSetTime));

        final Set<Integer> linkedHashSet = new LinkedHashSet<Integer>(1_000_000);
        final Long startLinkedHashSetTime = System.currentTimeMillis();
        
        for (int i = 0; i < 1000000; i++) {
            linkedHashSet.add(i);
        }
        
        final Long endLinkedHashSetTime = System.currentTimeMillis();
        System.out.println("Time spent by LinkedHashSet: " + (endLinkedHashSetTime - startLinkedHashSetTime));

    }

}
