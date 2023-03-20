package ztic.A.enumerados;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Desarrollo
 */
public class EjemploEnum {

    enum Day {
        Lun, Mar, Mier, Jueve, Vier, Saba, domi
    };
    
    
    enum Transporte{
    COCHE, CAMION, AVION, TREN, BARCO;
}

    public static void main(String... args)  {

       Day opcion = Day.Jueve;     
        
        switch (opcion) {

            case Lun:
                System.out.println("10");
                break;
            case Mar:
                System.out.println("20");
                break;
            case Mier:
                System.out.println("30");
                break;

            default:
                System.out.println("Not in 1, 2 or 3");
        }
        
        Transporte tp;
        tp=Transporte.AVION;

        System.out.println("Valor de tp: "+tp);
        System.out.println();

        tp=Transporte.TREN;

        //Comparación de 2 valores enum
        if (tp==Transporte.TREN)
            System.out.println("tp tiene el valor de TREN\n");
    }
}
