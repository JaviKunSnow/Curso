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
public class C_Comparacion {

    
    
    public static void main(String... args)
    {
    	comparacion1();
    	comparacion2();
    	comparacionCompareTo();
        comparacionOperadorIgualIgual();
    }
    
    
    
    //Comparacion utilizando el metodo Equals por valores
    static void comparacion1() {
        String s1 = "Martin";
        String s2 = "Martin";

        String s3 = new String("Martin");

        String s4 = "Laura";

        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equals(s3));//true
        System.out.println(s1.equals(s4));//false

    }

    //Comparacion utilizando el metodo equals por valores
    static void comparacion2() {
        String s1 = "Martin";
        String s2 = "MARTIN";

        System.out.println(s1.equals(s2));//falso
        System.out.println(s1.equalsIgnoreCase(s2));//verdadero

    }

    //Este forma sirve para comparar referencias y no valores. Operador ==
    static void comparacionOperadorIgualIgual() {
        String s1 = "Sachin";
        String s2 = "Sachin";
        String s3 = new String("Sachin");
        System.out.println(s1 == s2);//verdadero porque se refiere a la misma instancia
        System.out.println(s1 == s3);//falso, la instancia esta creada fuera del pool       
        
        
    }

    //Este forma sirve para comparar lexicograficamente, traduccion numerica de la cadena.
    static void comparacionCompareTo() {
        String s1 = "Sachin";
        String s2 = "Sachin";
        String s3 = "Ratan";
        System.out.println(s1.compareTo(s1));//0
        System.out.println(s1.compareTo(s3));//1(because s1>s3)
        System.out.println(s3.compareTo(s1));//-1(because s3 < s1 )
    }
}
