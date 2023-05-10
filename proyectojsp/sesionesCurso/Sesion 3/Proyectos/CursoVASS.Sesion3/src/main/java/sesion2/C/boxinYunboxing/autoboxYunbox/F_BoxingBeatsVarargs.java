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
class F_BoxingBeatsVarargs {

    static void m(Integer i) {
        System.out.println("Integer");
    }

    static void m(Integer... i) {
        System.out.println("lista...");
    }

    public static void main(String args[]) {
        int a = 30;
        m(a);
        m(a,2,5,7,a,a);
        
    }
}
