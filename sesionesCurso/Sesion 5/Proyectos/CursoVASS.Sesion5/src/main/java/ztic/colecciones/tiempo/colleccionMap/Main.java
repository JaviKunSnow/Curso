/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ztic.colecciones.tiempo.colleccionMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Javi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    //PIDELES QUE HAGAN LO MISMO CON LOS TIEMPOS DE INSERCION
    public static void main(String[] args) {

        List<String> listaArray = new ArrayList<>();

        final Map<Integer, List<String>> hashMap = new HashMap<>(1_000_000);
        final Long startHashMaptTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            listaArray.add("cadena de prueba");
            hashMap.put(i, listaArray);
        }

        final Long endHashMapTime = System.currentTimeMillis();
        System.out.println("Time spent by HashMap: " + (endHashMapTime - startHashMaptTime));

        listaArray = new ArrayList<>();
        final Map<Integer, List<String>> treeMap = new TreeMap<>();
        final Long startTreeMapTime = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            listaArray.add("cadena de prueba");
            treeMap.put(i, listaArray);
        }
        final Long endTreeMapTime = System.currentTimeMillis();
        System.out.println("Time spent by TreeMap: " + (endTreeMapTime - startTreeMapTime));

        listaArray = new ArrayList<>();
        final Map<Integer, List<String>> linkedHashMap = new LinkedHashMap<>();
        final Long startLinkedHashMapTime = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            listaArray.add("cadena de prueba");
            linkedHashMap.put(i,listaArray);
        }
        final Long endLinkedHashMapTime = System.currentTimeMillis();
        System.out.println("Time spent by LinkedHashMap: " + (endLinkedHashMapTime - startLinkedHashMapTime));
    }

}
