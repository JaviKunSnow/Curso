/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ztic.colecciones.tiempo.colleccionList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Javi
 */
public class CollectionsList {

    //Podemos declarar variables de la collecion LIST de la siguiente manera, el problema es que instanciar de este modo no garantiza 
    //la sincronizacion de acceso al objeto en caso de multihilo
    ArrayList aList = new ArrayList();
    LinkedList lList = new LinkedList(); 

    //Como no se puede garantizar la sincronizacion de acceso mediante hilos,
    //se puede dotar de un wrapper a estos objetos para que sean sincronizados a la hora de construirlos
    List listaSync1 = Collections.synchronizedList(new ArrayList());
    List listaSync2 = Collections.synchronizedList(new LinkedList());

}
