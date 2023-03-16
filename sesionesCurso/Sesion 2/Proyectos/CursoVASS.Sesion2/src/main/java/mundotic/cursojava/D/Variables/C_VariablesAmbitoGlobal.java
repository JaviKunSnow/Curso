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
public class C_VariablesAmbitoGlobal {

    int variableGlobal; //miembro

    int getVariableGlobal() {
        return variableGlobal = 6;
    }
    
    void setVariableLocal(int valor) {
        variableGlobal = valor;
    }

    public static void main(String[] args) {

        OtraClase otra = new OtraClase();
        otra.otroMetodo();
    }
}

class OtraClase {

    void otroMetodo() {
        
        C_VariablesAmbitoGlobal ejemplo = new C_VariablesAmbitoGlobal();
        System.out.println("Valor de variableGlobal: " + ejemplo.getVariableGlobal());
        ejemplo.setVariableLocal(4); 
        System.out.println("Valor de variableGlobal despues de modfiicar: " + ejemplo.getVariableGlobal());
        
    }
}
