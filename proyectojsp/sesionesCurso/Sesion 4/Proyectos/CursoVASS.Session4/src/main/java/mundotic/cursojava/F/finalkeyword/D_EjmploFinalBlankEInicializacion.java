/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundotic.cursojava.F.finalkeyword;

/**
 *
 * @author Javi
 */
class D_EjmploFinalBlankEInicializacion {

    int id;
    String name;
    //final String C_UNIVERSIDAD; //Debe de ser inicializada en el constructor para evitar el error

}

class Bicicleta {

    final int C_VELOCIDAD_LIMITE;//blank final variable

    Bicicleta() {
        C_VELOCIDAD_LIMITE = 70;
        System.out.println(C_VELOCIDAD_LIMITE);
    }

    public static void main(String args[]) {
        new Bicicleta();
    }
}
