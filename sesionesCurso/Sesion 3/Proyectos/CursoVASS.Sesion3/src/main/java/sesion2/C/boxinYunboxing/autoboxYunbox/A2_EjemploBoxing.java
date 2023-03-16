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
class A2_EjemploBoxing {

    public static void main(String args[]) {
        int a = 50;
        Integer a2 = new Integer(a);//Boxing, //CREAMOS EXPLICITAMENTE EL OBJETO A TRAVES DEL VALOR A  

        Integer a3 = 5;//auto-Boxing, EL COMPILADOR NO NECESITA LO ANTERIOR, LO DETECTA DE FORMA AUTOMÃ?TICA  

        System.out.println(a2 + " " + a3);
    }
}
