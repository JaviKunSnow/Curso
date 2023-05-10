/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundotic.cursojava.I.abstraccion.interfaz;

/**
 *
 * @author Javi
 */
interface Bank {
    float rateOfInterest();
}

class CuentaCorriente implements Bank {

    @Override
    public float rateOfInterest() {
        return 9.15f;
    }
}

class CuentaNomina implements Bank {
    @Override
    public float rateOfInterest() {
        return 9.7f;
    }
}

class C_EjemploBasicoInterfaz {

    public static void main(String[] args) {
        Bank b = new CuentaCorriente();
        System.out.println("ROI: " + b.rateOfInterest());
        Bank c = new CuentaNomina();
        System.out.println("ROI:" + c.rateOfInterest());
    }
}
