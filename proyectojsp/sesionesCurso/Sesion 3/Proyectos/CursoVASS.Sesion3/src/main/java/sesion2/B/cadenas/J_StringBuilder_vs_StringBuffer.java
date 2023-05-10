/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion2.B.cadenas;

/**
 *
 * @author Javi
 */
public class J_StringBuilder_vs_StringBuffer {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer("Java");
        for (int i = 0; i < 300000; i++) {
            sb.append("Tutorial");
        }
        System.out.println("Tiempo tomado por StringBuffer " + (System.currentTimeMillis() - startTime) + "ms");
        startTime = System.currentTimeMillis();
        StringBuilder sb2 = new StringBuilder("Java");
        for (int i = 0; i < 300000; i++) {
            sb2.append("Tutorial");
        }
        System.out.println("Tiempo tomado por StringBuilderr: " + (System.currentTimeMillis() - startTime) + "ms");
    }

}
