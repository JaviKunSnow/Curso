/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.e
 */
package sesion2.B.cadenas;
/**
 *
 * @author Javi
 */
public class G_StringBuffer {

    public static void main(String args[]) {

        metodoAppend();
        metodoInsert();
//        metodoReplace();
//        metodoDelete();
//        metodoReverse();
//        metodoCapacity();
        metodoEnsureCapacity();
        metodoEnsureCapacity2();

    }

    static void metodoAppend() {
        StringBuffer sb = new StringBuffer("Hello ");
        sb.append("Java");//añadir una cadena a la original 
        System.out.println(sb);
    }

    static void metodoInsert() {
        StringBuffer sb = new StringBuffer("Hello ");
        sb.insert(1, "Java");// 
        System.out.println(sb);//Imprimir HJavaello  
    }

    static void metodoReplace() {
        StringBuffer sb = new StringBuffer("Hello");
        sb.replace(1, 3, "Java");
        System.out.println(sb);//Imprimir  HJavalo    
    }

    static void metodoDelete() {
        StringBuffer sb = new StringBuffer("Hello");
        sb.delete(1, 3);
        System.out.println(sb);//Imprimir Hlo  
    }

    static void metodoReverse() {
        StringBuffer sb = new StringBuffer("Hello");
        sb.reverse();
        System.out.println(sb);//Imprir olleH  
    }

    static void metodoCapacity() {
        StringBuffer sb = new StringBuffer("a");
        System.out.println(sb.capacity());//defecto 16  
        sb.append("Hello");
        System.out.println(sb.capacity());//ahora 16  
        sb.append("java is my favourite language");
        System.out.println(sb.capacity());//ahora (16*2)+2=34 i.e (oldcapacity*2)+2   
    }

    static void metodoEnsureCapacity() {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());//default 16  
        sb.append("Hello");
        System.out.println(sb.capacity());//now 16  
        sb.append("java is my favourite language");
        System.out.println(sb.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2  
        sb.ensureCapacity(10);//now no change  
        System.out.println(sb.capacity());//now 34  
        sb.ensureCapacity(50);//now (34*2)+2  
        System.out.println(sb.capacity());//now 70  
    }

    static void metodoEnsureCapacity2() {

        StringBuilder str1 = new StringBuilder("12");
        System.out.println("string1 = " + str1);

        // returns the current capacity of the string Builder 1
        System.out.println("Old Capacity = " + str1.capacity());
        /* increases the capacity, as needed, to the specified amount in the 
         given StringBuilder object */

        // returns twice the capacity plus 2
        str1.ensureCapacity(24);
        System.out.println("New Capacity = " + str1.capacity());

        StringBuilder str2 = new StringBuilder("compile online");
        System.out.println("string2 = " + str2);

        // returns the current capacity of string Builder 2
        System.out.println("Old Capacity = " + str2.capacity());
        /* returns the old capacity as the capacity ensured is less than the
         old capacity */
        str2.ensureCapacity(31);
        System.out.println("New Capacity = " + str2.capacity());
    }
}
