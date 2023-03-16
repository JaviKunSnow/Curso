/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion2.C.boxinYunboxing.Casting;

/**
 *
 * @author Javier
 */
public class B_Narrowing {

    public static void main(String args[]) {
        double d = 166.66 ;   // convertir un tipo de datos doble en un tipo de datos largo  
        long l = (long) d;  // convertir un tipo de datos largo en un tipo de datos int  
        int i =  (int) l;
        System.out.println("Antes de la conversión:" + d);  // parte fraccionaria perdida  
        System.out.println("Después de la conversión a tipo largo:" + l);  // parte fraccionaria perdida  
        System.out.println("Después de la conversión a tipo int:" + i);
    }

}
