/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion2.C.boxinYunboxing.autoboxYunbox;

/**
 *
 * @author Javi
 */
class UnboxingExample1 {

    public static void main(String args[]) {
        
        //OPERACIONES EXPLICITAS DE UNBOXING
        Integer i = new Integer(50);        
        int b = i.intValue();
        
        //ACTUALMENTE HAY QUE HACERLO AS�?, ES DECIR, DEJAR QUE SE HAGA INTERNAMENTE, PERO NECESITAMOS ENTENDER LO QUE EST�? PASANDO, POR SI CAEMOS EN PROYECTOS M�?S VIEJOS.
        int a = i;//auto-unbox
        
        

        System.out.println(a);
    }
}
