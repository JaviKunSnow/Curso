/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundotic.cursojava.D.Variables;

import java.util.Random;

/**
 *
 * @author Javi
 */
public class B_VariablesLocales {

    private int variableMiembro; //global para uso en toda la clase

    int getVariableMiembro() {
        return variableMiembro;
    }

    void miMetodo(int parametro) {

        //variableLocal en el metodo
        int variableLocal;
        variableLocal = parametro;
        System.out.println("El valor de variableLocal es: " + variableLocal);

    }

    void otroMetodo(int parametro) {

        //variableLocal en el metodo
        int variableLocal = new Random().nextInt();

        System.out.println("El valor de variableLocal es: " + variableLocal);
        System.out.println("EL valor de parámetro es: " + parametro);

        variableMiembro = parametro;
    }

    public static void main(String args[]) {
        B_VariablesLocales variable = new B_VariablesLocales();
        variable.miMetodo(5);
        variable.otroMetodo(3);
        System.out.println("el valor de variableGlobal al final de las operaciones es: " + variable.getVariableMiembro());
    }
}
