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
public class H_WideningBeatsBoxing {

    static void m(int i) {
        System.out.println("int");
    }

    static void m(Integer i) {
        System.out.println("Integer");
    }

    public static void main(String args[]) {
        Integer s = 30;        
        m(s);
    }
}
