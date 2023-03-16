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
class A_EjemploVariableFinal {

    final int C_VELOCIDAD_LIMITE;//final variable  

    public A_EjemploVariableFinal() {
        this.C_VELOCIDAD_LIMITE = 400;
    }    

   void correr() {
//        C_VELOCIDAD_LIMITE = 400;// Esta linea daria error ya que una vez asignado el valor no se podra modificar
  }

    public static void main(String args[]) {
        A_EjemploVariableFinal obj = new A_EjemploVariableFinal();
        obj.correr();
    }
}
