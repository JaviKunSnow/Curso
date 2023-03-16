/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundotic.cursojava.modificadoresdeacceso.A.VisionEnPaquete;

/**
 *
 * @author Javi
 */


 class A_EjemploModificadorPrivate {

    public static void main(String args[]) {
        Ar obj2; //error de compilacion
        Ar obj = new Ar(4);
        System.out.println(obj.dato2);//Permitido
        obj.msg(); //no podemos acceder desde fuera por ser privado 
       //System.out.println(obj.dato1);//No permitidoPermitido
        //obj2 = new Ar();
    }
}
