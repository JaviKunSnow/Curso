/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ztic.colecciones.operacionesListas;

import java.util.ArrayList;

/**
 *
 * @author Javi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        OperacionesListas operaciones = new OperacionesListas();
        
        operaciones.Añadir();
        operaciones.AñadirEnPosicion(0);
        ArrayList listaOriginal = new ArrayList(); listaOriginal.add(2);listaOriginal.add("Hola"); listaOriginal.add(null);listaOriginal.add("hola"); listaOriginal.add("adios");
//        operaciones.CopiarLista(listaOriginal);
//        operaciones.convertArrayToList();
        operaciones.convertListToArray();
//        operaciones.convertListToSet();
//        operaciones.crearSubLista();
//        operaciones.eleminarElemento("Hola");
//        operaciones.eleminarElementoPorPosicion(0);
//        operaciones.encontrarPrimeraPosicionObjeto(null);
//        operaciones.encontrarUltimaPosicionObjeto("Hola");
//        operaciones.existeElemento(null);
//        operaciones.extraerElemento(1);
 //       operaciones.mezclarListas(listaOriginal);
//        operaciones.vaciarLista();
//        operaciones.tamañoLista();
//        operaciones.recorrerListaStreamAPI();
//        operaciones.recorrerListaIterator();
//        operaciones.recorrerListaGenericaIterator();
//        operaciones.recorrerListaBucle();
//        operaciones.recorrerListaAbstracta();
//        operaciones.recorerrListaForEach();
//        operaciones.ordenarListaComparator();
//        operaciones.ordenarLista();  
        
    }
    
}
