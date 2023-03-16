/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundotic.cursojava.F.SentenciasDeControl;

/**
 *
 * @author Javi
 */
public class A_SentenciaIf {

    // Programa Java para demostrar el uso de la declaración if.
    public static void main(String[] args) {

        Ejemplo ejem = new Ejemplo();
        ejem.edad();

    }

}

class Ejemplo {

    public void edad() {

        // definiendo una variable 'age'
        int edad = 20;
        // comprobando la edad
        if (edad > 18) {
            System.out.print("La edad es mayor a 18");
        }
    }

    public void mayorOmenor() {
        // definiendo una variable
        int número = 8;
        // Comprueba si el número es divisible por 2 o no
        if (número % 2 == 0) {
            System.out.println("número par");
        } else {
            System.out.println("número impar");
        }
    }

    public void bisiesto() {
        int anno = 2020;
        if (((anno % 4 == 0) && (anno % 100 == 0)) || (anno % 400 == 0)) {
            System.out.println("AÑO BISIESTO");
        } else {
            System.out.println("AÑO COMÚN");
        }
    }

    public void Nota() {

        int nota = 65;

        if (nota < 50) {
            System.out.println("suspenso");
        } else if (nota >= 50 && nota < 60) {
            System.out.println("D");
        } else if (nota >= 60 && nota < 70) {
            System.out.println("C");
        } else if (nota >= 70 && nota < 80) {
            System.out.println("B");
        } else if (nota >= 80 && nota < 90) {
            System.out.println("A");
        } else if (nota >= 90 && nota < 100) {
            System.out.println("A+");
        } else {
            System.out.println("Invalid!");
        }

    }

    public void positivoONegativo() {
        int number = -13;

        if (number > 0) {
            System.out.println("POSITIVO");
        } else if (number < 0) {
            System.out.println("NEGATIVO");
        } else {
            System.out.println("ZERO");
        }
    }

    public void donante() {
        // Creando dos variables para edad y peso
        int edad = 20;
        int peso = 80;

        // aplicando condición de edad y peso
        if (edad >= 18) {

            if (peso > 50) {
                System.out.println("Usted es elegible para donar sangre");
            } else {
                System.out.println("No apto");
            }

        }
    }

    public void donante2() {
        //Creating two variables for age and weight
        int edada = 25;
        int peso = 48;

        //evaluamos las dos condiciones con un if anidado
        if (edada >= 18) {
            if (peso > 50) {
                System.out.println("Usted es elegible para donar sangre");
            } else {
                System.out.println("Usted no es elegible para donar sangre");
            }
        } else {
            System.out.println("Debe ser mayor de 18");
        }
    }

    //Operador Ternario
    public void parOImpar() {
        int número = 13;
        // Usando operador ternario
        String cadena = (número % 2 == 0) ? "número par" : "número impar";
        System.out.println(cadena);
    }//fin del metodo

}//fin de la clase
