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
public class H_StringBuilder {

    public static void main(String args[]) {

        metodoAppend();
        metodoInsert();
        metodoReplace();
        metodoDelete();
        metodoReverse();
        metodoCapacity();
        metodoEnsureCapacity();
    }

    static void metodoAppend() {
        StringBuilder sb = new StringBuilder("Hello ");
        sb.append("Java");// 
        System.out.println(sb);// Hello Java
    }

    static void metodoInsert() {
        StringBuilder sb = new StringBuilder("Hello ");
        sb.insert(1, "Java");//
        System.out.println(sb);//imprimir HJavaello  
    }

    static void metodoReplace() {
        StringBuilder sb = new StringBuilder("Hello");
        sb.replace(1, 3, "Java");
        System.out.println(sb);//imprimir HJavalo   
    }

    static void metodoDelete() {
        StringBuilder sb = new StringBuilder("Hello");
        sb.delete(1, 3);
        System.out.println(sb);//imprime Hlo  
    }

    static void metodoReverse() {
        StringBuilder sb = new StringBuilder("Hello");
        sb.reverse();
        System.out.println(sb);//imprime olleH  
    }

    static void metodoCapacity() {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity());//default 16  
        sb.append("Hello");
        System.out.println(sb.capacity());//ahora 16  
        sb.append("java is my favourite language");
        System.out.println(sb.capacity());//ahora (16*2)+2=34 i.e (oldcapacity*2)+2    
    }

    static void metodoEnsureCapacity() {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity());//defecto 16  
        sb.append("Hello");
        System.out.println(sb.capacity());//ahora 16  
        sb.append("java is my favourite language");
        System.out.println(sb.capacity());//ahora (16*2)+2=34 i.e (oldcapacity*2)+2  
        sb.ensureCapacity(10);//ahora no cambia  
        System.out.println(sb.capacity());//ahora 34  
        sb.ensureCapacity(50);//ahora (34*2)+2  
        System.out.println(sb.capacity());//ahora 70  
    }
}
