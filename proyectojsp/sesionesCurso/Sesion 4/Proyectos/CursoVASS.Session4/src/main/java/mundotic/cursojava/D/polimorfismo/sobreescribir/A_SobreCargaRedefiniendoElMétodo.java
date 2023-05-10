/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundotic.cursojava.D.polimorfismo.sobreescribir;

/**
 *
 * @author Javi
 */
//Polimorfismo de INCLUSION o redefinicion o sobreescritura
class Bank {

    int getRateOfInterest() {
        return 0;
    }
}
  

//VAMOS A SOBREESCRIBIR LOS METODOS DE FORMA QUE SIMPLEMENTE DEVUELVAN VALORES DIFERENTES
class SBI extends Bank {

    @Override
    int getRateOfInterest() {
         return 8;
    }
}

class ICICI extends Bank {

    @Override
    int getRateOfInterest() {
        return 7;
    }
}

class AXIS extends Bank {


    @Override
    int getRateOfInterest() {
        return 9;
    }
}

class A_SobreCargaRedefiniendoElMétodo {

    public static void main(java.lang.String... args)  {
        SBI s = new SBI();
        ICICI i = new ICICI();
        AXIS a = new AXIS();
        System.out.println("SBI Rate of Interest: " + s.getRateOfInterest());
        System.out.println("ICICI Rate of Interest: " + i.getRateOfInterest());
        System.out.println("AXIS Rate of Interest: " + a.getRateOfInterest());
    }
}
