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
public class A_Widdening {

    public static void main(String[] args) {
        int x = 7;  
        long y = x;   // convierte automáticamente el tipo entero en tipo largo  
        float z = y; // convierte automáticamente el tipo largo en tipo flotante 
        System.out.println("Antes de la conversión, valor int " +  x);
        System.out.println("Después de la conversión, valor largo " + y);
        System.out.println("Después de la conversión, valor flotante " + z);
    }
}
