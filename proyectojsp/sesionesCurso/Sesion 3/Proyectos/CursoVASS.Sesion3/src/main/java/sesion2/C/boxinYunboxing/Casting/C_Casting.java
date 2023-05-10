/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion2.C.boxinYunboxing.Casting;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Javier
 */
public class C_Casting {

    //DEFINIMOS LA VARIABLA MÃ?S GENERICA DE TODAS
    Object obj = new String();    
    

    //DEFINIMOS UNA LISTA DE OBJETOS
    List<Object> lista;

    //CONSTRUCTOR
    public C_Casting() {
        this.lista = new ArrayList<Object>();        
    }

    //UN METODO CUALQUIERA PARA HACER SINTAXIS. NO VA A FUNCIONAR
    public void main() {
        lista.add(obj);

        String cadena = (String) lista.get(0);
        Integer entero = (Integer) lista.get(0);
        
    }

}
