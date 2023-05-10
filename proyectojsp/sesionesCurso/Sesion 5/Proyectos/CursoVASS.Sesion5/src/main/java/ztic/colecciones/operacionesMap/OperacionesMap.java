/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ztic.colecciones.operacionesMap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.*;

import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Stream;

/**
 *
 * @author Javi
 */
public class OperacionesMap {

    private Map mapA = new HashMap();
    private Map mapB = new TreeMap();
    private Map<Integer, String> mapC = new HashMap();

    public void operaciones() {

        // Inserting Elements Into a Java Map
        mapA = new HashMap();

        mapA.put("key1", "element 1");
        mapA.put(1, new HashMap());
        mapA.put(7.6, "element 1");
        
        mapC.put(5, "sdf");
        
        HashMap lista = new HashMap();

//Solo podemos insertar objetos como clave
//en el caso en el que pasemos valores primitivos ocurrira autoBox antes de pasar los parametros.
        mapA.put("key", 123);
//No se permiten valores nulos para la clave
//Pero si para el par valor correspondiente
//asi que podemos tener claves con par valor nulo

        mapA.put("D", null);

        Object value = mapA.get("D");

//Insertar todos los elementos de un mapa en otro
        mapA = new HashMap();
        mapA.put("key1", "value1");
        mapA.put("key2", "value2");

        mapB = new HashMap();
        mapB.putAll(mapA);

//Obtener elementos de java map
        String element1 = (String) mapA.get("key1");

//Get or Default Value
        Map map = new HashMap();

        map.put("A", "1");
        map.put("B", "2");
        map.put("C", "3");

        value = map.getOrDefault("E", "default value");

//comprobar si existe una clave en el mapa
        boolean hasKey = mapA.containsKey("123");

//Comprobar si un mapa tiene un valor
        boolean hasValue = mapA.containsValue("value 1");

//Iterando las claves de un java map  
//Existen varias maneras de iterar:
//Key Iterator
//Bucle for Each
//Via Stream
//Ejemplo de cada una de las formas
//Usando un iterator
        Iterator iterator = mapA.keySet().iterator();
        while (iterator.hasNext()) {
            Object key = iterator.next();
            value = mapA.get(key);           
            
        }

//Usando un bloque for-each y una clave
        for (Object key2 : mapA.keySet()) {
            value = mapA.get(key2);
        }

//Usando un Stream
        Map<String, String> map2 = new HashMap<>();

        map.put("one", "first");
        map.put("two", "second");
        map.put("three", "third");

        Stream<String> stream2 = map.keySet().stream();
        stream2.forEach((Object value2) -> {
            System.out.println(value2);
        });

//Iterando los valores de map
//Usando un iterador
//Usando for each
//Usando un stream
//usando iterator
        iterator = map.values().iterator();

        while (iterator.hasNext()) {
            Object nextValuen = iterator.next();
        }

//usando un valor en For-Each Loop
        for (Object value3 : mapA.values()) {
            System.out.println("Queremos ver los valores del mapa:" + value3);
        }

//usando un stream
        Map<String, String> map3 = new HashMap<>();

        map3.put("one", "first");
        map3.put("two", "second");
        map3.put("three", "third");

        Stream<String> stream = map.values().stream();
        stream.forEach((Object value4) -> {
            System.out.println(value4);
        });

//Iterando entradas the Entries of a Java Map
//Se pueden recorrer las entradas de un map, por entradas, nos referimos a una clave + valor de forma conjunta
//Existen dos formas de iterar las entradas de un map
//Usando un entry iterator 
//usando  for-each 
//Usando un iterador de entradas
//La primera manera de iterar las entradas de map es mediante un iterador obtenido del EntrySet. Here is an example of iterating the entries of Java Map:
        Set entries = map.entrySet();
        iterator = entries.iterator();
        while (iterator.hasNext()) {
            Entry entry = (Entry) iterator.next();
            Object key = entry.getKey();
            Object value5 = entry.getValue();
        }

//La siguiente manera es una forma mas eficiente de usar un Map, y es con genericos. Lo veremos mas adelante
//Using an Entry For-Each Loop
//La segunda manera es un for-each
        for (Object entryObj : map.entrySet()) {
            Map.Entry entry = (Map.Entry) entryObj;
            Object key = entry.getKey();
            Object value6 = entry.getValue();
        }


//Eliminando Entries
       mapA.remove("key1");


//Eliminando todas las entradas
//You can remove all entries in a Java Map using the clear() method. Here is how that looks:
        mapA.clear();
        
//Modificando un Entrie
        map = new HashMap();
        map.replace("key", "new value");  //nothing is replaced, no mapping to "key"
        map.put("key", "value");           //now the map contains an entry on "key"
        map.replace("key", "newer value"); //now the entry is replaced


//Podemos saber el numero de entradas a partir de la siguiente funcion
        int entryCount = mapA.size();
        
//Checking if a Java Map is Empty
//The Java Map interface has a special method for checking if a Map is empty. This method is called isEmpty() and it returns either true or false. The isEmpty() method will return true if the Map instance contains 1 or more entries. If the Map contains 0 entries, isEmpty() will return false.
        boolean empty = mapA.isEmpty();
    
//Mapas Genericos
//Por defecto nosotros podemos poner cualquier tipo de objeto en la parte de la clave o el valor, pero con el uso de genericos
//podemos restringir el tipo de datos que va en cada en cada par
        Map<String, Object> map4 = new HashMap<String, Object>();

        for (Object anObject : map.values()) {
            //do someting with anObject...
        }

        for (Object key : map.keySet()) {
            Object value6 = map.get(key);
            //do something to value
        }


//SORTED MAP
//Ejemplo de sortedMap
        mapA = new TreeMap();

        Comparator comparator = new MyComparator();
        mapB = new TreeMap(comparator);       
       
    }

}


//OTROS EJEMPLOS


