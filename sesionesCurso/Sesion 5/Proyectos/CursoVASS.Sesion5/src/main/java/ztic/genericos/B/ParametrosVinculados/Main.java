/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ztic.genericos.B.ParametrosVinculados;

import static ztic.genericos.B.ParametrosVinculados.MaxinumTest.maximum;

/**
 *
 * @author Javi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.printf("Max of %d, %d and %d is %d\n\n",
                3, 4, 5, maximum(3, 4, 5));

        System.out.printf("Max of %.1f,%.1f and %.1f is %.1f\n\n",
                6.6, 8.8, 7.7, maximum(6.6, 8.8, 7.7));

        System.out.printf("Max of %s, %s and %s is %s\n", "pear",
                "apple", "orange", maximum("pear", "apple", "orange"));
    }

}
