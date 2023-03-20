/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ztic.colecciones.tiempo.colleccionMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 *
 * @author Javi
 */
public class ColeccionesMap {

    //Podemos declarar variables de la collecion LIST de la siguiente manera, el problema es que instanciar de este modo no garantiza 
    //la sincronizacion de acceso al objeto en caso de multihilo
    HashMap hMap = new HashMap();
    SortedMap sMap = new TreeMap();
    LinkedHashMap lhMap = new LinkedHashMap();

    //Como no se puede garantizar la sincronizacion de acceso mediante hilos,
    //se puede dotar de un wrapper a estos objetos para que sean sincronizados a la hora de construirlos
    Map mapSync1 = Collections.synchronizedMap(new HashMap());
    SortedMap mortedMap = Collections.synchronizedSortedMap(new TreeMap());
    Map mapSync2 = Collections.synchronizedMap(new LinkedHashMap());

}
