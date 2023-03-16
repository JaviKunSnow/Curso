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
public class I_String_vs_StringBuffer {

    public static String concatWithString() {
        String t = "Java";

        for (int i = 0; i < 100000; i++) {
            t = t + "Ejemplo";
        }

        return t;
    }

    public static String concatWithStringBuffer() {
        StringBuffer sb = new StringBuffer("Java");
        for (int i = 0; i < 100000; i++) {
            sb.append("Ejemplo");
        }
        return sb.toString();
    }

    
    //Test de concatenacion entre String & String Builder    
    public static void main(String[] args) {
        
        long startTime = System.currentTimeMillis(); 
        concatWithString();
        System.out.println("TTiempo en concatenar String: " + (System.currentTimeMillis() - startTime) + "ms");
      
        startTime = System.currentTimeMillis();
        concatWithStringBuffer();
        System.out.println("Tiempo en concatenar con StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");
    }
    
    /* DESCOMENTAR ESTE METODO Y COMENTAR EL DE ARRIBA PARA EJECUTAR EL TEST HASHCODE ENTRE LAS DOS CLASES
    public static void main(String args[]){  
        System.out.println("Hashcode test of String:");  
        String str="java";  
        System.out.println(str.hashCode());  
        str=str+"tpoint";  
        System.out.println(str.hashCode());  
   
        System.out.println("Hashcode test of StringBuffer:");  
        StringBuffer sb=new StringBuffer("java");  
        System.out.println(sb.hashCode());  
        sb.append("tpoint");  
        System.out.println(sb.hashCode());  
    }*/
}




