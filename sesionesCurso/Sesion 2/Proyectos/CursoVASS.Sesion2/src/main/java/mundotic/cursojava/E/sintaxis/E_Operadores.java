/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundotic.cursojava.E.sintaxis;

/**
 *
 * @author Javi
 */
public class E_Operadores {

    public static void main(String args[]) {
        int a = 10;
        int b = 5;
        System.out.println(a + b); //15  
        System.out.println(a - b); // 5  
        System.out.println(a * b); // 50  
        System.out.println(a / b); // 2  
        System.out.println(a % b); // 0  

        Ejemplo2 e = new Ejemplo2();

        //Ejemplo de operador unario
        e.ejemplo();
        
        //Ejemplo de operadores aritmeticos
        e.ejemplo1();
        
        //Ejemplo de expresion artimetica
        e.ejemplo2();
        
        //Ejemplo de operador desplazamiento izquierda
        e.ejemplo3();
        
        //Ejemplo de operador desplazamiento derecha
        e.ejemplo4();
        
        //Operador desplazamiento izquierda vs operador desplazmiento derecha
        e.ejemplo5();
        
        //Operador && and &
        e.ejemplo7();
        
        //Operador && and &
        e.ejemplo8();
        
        //Operador || & |
        e.ejemplo9();
        
        //operador ternario
        e.ejemplo10();
        e.ejempl1();
        
        //operador asignacion
        e.ejemplo12();
  
        
    }

}

class Ejemplo2 {
    
    
    
    //ejemplo operador unario
    public void ejemplo()
    {
        int a = 0;
        System.out.println("Ejemplo de operador unario ++: " + ++a);
        System.out.println("Ejemplo de operador unario ++: " + a++);
        System.out.println("Ejemplo de operador unario ++: " + a);
        
        System.out.println("Ejemplo de operador unario --: " + --a);
        System.out.println("Ejemplo de operador unario --: " + a--);
        System.out.println("Ejemplo de operador unario ++: " + a);
    }
    
    

//    Ejemplo de operador aritmético +,-,*,/,%
    public void ejemplo1() {
        int a = 10;
        int b = 5;
        System.out.println(a + b); //15  
        System.out.println(a - b); // 5  
        System.out.println(a * b); // 50  
        System.out.println(a / b); // 2  
        System.out.println(a % b); // 0 
    }

//    Operador aritmético de Java Ejemplo: expresión
    public void ejemplo2() {

        System.out.println(10 * 10 / 5 + 3 - 1 * 4 / 2);

    }

//    Ejemplo de operador de desplazamiento a la izquierda de Java
    public void ejemplo3() {

        System.out.println(10 << 2); // 10 * 2 ^ 2 = 10 * 4 = 40  
        System.out.println(10 << 3); // 10 * 2 ^ 3 = 10 * 8 = 80  
        System.out.println(20 << 2); // 20 * 2 ^ 2 = 20 * 4 = 80  
        System.out.println(15 << 4); // 15 * 2 ^ 4 = 15 * 16 = 240  
    }

//    Ejemplo de operador de desplazamiento a la derecha de Java 
    public void ejemplo4() {
        System.out.println(10 >> 2); // 10/2 ^ 2 = 10/4 = 2  
        System.out.println(20 >> 2); // 20/2 ^ 2 = 20/4 = 5  
        System.out.println(20 >> 3); // 20/2 ^ 3 = 20/8 = 2  

    }

//    Operador Java Shift Ejemplo: >> vs >>>
    public void ejemplo5() {
        // Para un número positivo, >> y >>> funciona igual  
        System.out.println(20 >> 2);
        System.out.println(20 >>> 2);
        // Para un número negativo, >>> cambia el bit de paridad (MSB) a 0  
        System.out.println(- 20 >> 2);
        System.out.println(- 20 >>> 2);
    }

//    Ejemplo de Java AND Operator: Logical && 
    public void ejemplo7() {

        int a = 10;
        int b = 5;
        int c = 20;
        System.out.println(a < b && a++ < c); // false && true = false  
        System.out.println(a); // 10 porque la segunda condición no está evaluada  


    }

//    Operador Java OR Ejemplo: Lógico ||
    public void ejemplo8() {

        int a = 10;
        int b = 5;
        int c = 20;
        System.out.println(a > b || a < c); // verdadero || verdadero = verdadero  
      
        
        // || vs |  
        System.out.println(a > b || a++ < c); // verdadero || verdadero = verdadero  
        System.out.println(a); // 10 porque la segunda condición no está evaluada  


    }

//    operador ternario de Java
    public void ejemplo9() {

        int a = 2;
        int b = 5;
        int min = (a < b) ? a : b;
        System.out.println(min);

    }

//    operador ternario de Java
    public void ejemplo10() {

        int a = 10;
        int b = 5;
        int min = (a < b) ? a : b;
        System.out.println(min);

    }

//   Ejemplo de operador de asignación de Java
    public void ejempl1() {
        int a = 10;
        int b = 20;
        a += 4; // a = a + 4 (a = 10 + 4)  
        b -= 4; // b = b-4 (b = 20-4)  
        System.out.println(a);
        System.out.println(b);

    }

//    Ejemplo de operador de asignación de Java
    public void ejemplo12() {

        int a = 10;
        a += 3; // 10 + 3  
        System.out.println(a);
        a -= 4; // 13-4  
        System.out.println(a);
        a *= 2; // 9 * 2  
        System.out.println(a);
        a /= 2; // 18/2  
        System.out.println(a);
    }


    

}
