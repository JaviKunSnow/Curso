/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundotic.cursojava.D.Variables;

/**
 *
 * @author Javi
 */
class Clase {

    //INICIALIZAMOS LAS VARIABLES ESTATICAS AQUÍ Y SOLO TOMARÁN EL VALOR LA PRIMERA VEZ
    static int variableEstatica = 0;

    Clase() {
        variableEstatica++;
    }

}

class Clase2 {

    void metodo() {

        System.out.println("Valor de UnaClase.variableEstatica:" + Clase.variableEstatica);
    }
}

public class D_VariablesEstaticas {

    public static void main(String[] args) {
        Clase2 c = new Clase2();
        Clase2 c2 = new Clase2();
        Clase.variableEstatica = 0;
        c.metodo();
        System.out.println(Clase.variableEstatica);
        c2.metodo();
        System.out.println(Clase.variableEstatica);
        Clase.variableEstatica = 2;
        c.metodo();
        c2.metodo();
    }

}
