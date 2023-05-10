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
class G_OverloadingWideningYBoxing {

    static void m(int l) {
        System.out.println("int");
    }
    
//    static void m(short l)
//    {
//    	System.out.println("short");
//    }

    public static void main(String args[]) {
        
       //ESTA LLAMADA PRODUCIRÃ?A ENSANCHAMIENTO DEL DATO Y AUTOBOXING A LA VEZ
       short numero = 30;
       G_OverloadingWideningYBoxing.m(numero); 
    }
}
