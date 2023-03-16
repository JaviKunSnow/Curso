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
public class E_Substring {

    public static void main(String... args) {
        subString();
    }

    static void subString() {

        String s = "MartinMartinez";
        String apellido1 = s.substring(0, 6);
        String apellido2 = s.substring(6);
        System.out.println(s.substring(6));
        System.out.println(s.substring(0, 6));
    }

}
