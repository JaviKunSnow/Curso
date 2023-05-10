/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundotic.cursojava.modificadoresdeacceso.B.VisionFueradePaquete;

import mundotic.cursojava.modificadoresdeacceso.C.paqueteauxiliardemo.B_EjemploProtectedDefiniciones;

/**
 *
 * @author Javi
 */
class B_EjemploProtectedFueraPaquete extends B_EjemploProtectedDefiniciones {

    public static void main(String args[]) {
        B_EjemploProtectedFueraPaquete obj = new B_EjemploProtectedFueraPaquete(); //podemos utilizarlo fuera del paquete sin problema por estar definido como protected
        obj.msg();
    }
}
