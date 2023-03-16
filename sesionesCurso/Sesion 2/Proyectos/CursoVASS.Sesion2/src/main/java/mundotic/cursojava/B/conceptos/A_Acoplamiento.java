/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundotic.cursojava.B.conceptos;

/**
 *
 * @author Javi
 */
class DoTaxes {

    float rate;

    float doColorado() {
        SalesTaxRates str = new SalesTaxRates();
        rate = str.salesRate;   // Esto deería ser la llamada a un método
        //rate = str.getSalesRate(&quot;CO&quot;);
        return rate;
    }
}

class SalesTaxRates {

    public float salesRate;         // debería ser private
    public float adjustedSalesRate; // debería ser private

    public float getSalesRate(String region) {
        salesRate = new DoTaxes().doColorado();
        // Calculos
        return adjustedSalesRate;
    }
}
