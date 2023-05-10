/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ztic.colecciones.tiempo.colleccionSet;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Javi
 */
public class CollectionsSet {
    
    
    //Podemos declarar variables de la collecion SET de la siguiente manera, el problema es que instanciar de este modo no garantiza 
    //la sincronizacion de acceso al objeto en caso de multihilo
    HashSet HashSet1 = new HashSet();
    Set sortedSet1 = new TreeSet(); //Sorted set no se puede instanciar directamente porque es una clase Abstracta
    LinkedHashSet linkedHashSet1 = new LinkedHashSet();
    
    //Como no se puede garantizar la sincronizacion de acceso mediante hilos,
    //se puede dotar de un wrapper a estos objetos para que sean sincronizados a la hora de construirlos
    Set HashSet2 = Collections.synchronizedSet(new HashSet());
    Set sortedSet2 = Collections.synchronizedSortedSet(new TreeSet());
    Set LinkedHashSet2= Collections.synchronizedSet(new LinkedHashSet());

}
