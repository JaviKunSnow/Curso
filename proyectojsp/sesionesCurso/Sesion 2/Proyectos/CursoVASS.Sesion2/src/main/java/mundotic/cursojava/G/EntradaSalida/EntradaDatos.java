/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundotic.cursojava.G.EntradaSalida;

import java.util.Scanner;

/**
 *
 * @author Javi
 */
public class EntradaDatos {

    private Scanner entrada;
    private int datoEntero;
    private String datoCadena;

    EntradaDatos() {
        this.entrada = new Scanner(System.in);
        this.datoEntero = 0;
        this.datoCadena = "";
    }

    public int leerEntero() {
        this.setDatoEntero((int) this.entrada.nextInt());
        return this.getDatoEntero();
    }

    public boolean leerEnteroSeguro() {

            String cadenaEntrada = this.entrada.nextLine();

       
            this.setDatoEntero(Integer.parseInt(cadenaEntrada));
            return true;
        
    }

    public int leerCadena() {
        this.setDatoCadena(this.entrada.nextLine());
        return this.getDatoEntero();
    }

    public boolean devolverToken() {

        String cadenaEntrada = this.entrada.nextLine();

        try {
            this.setDatoEntero(Integer.parseInt(cadenaEntrada));
            return true;
        } catch (NumberFormatException exception) {
            System.out.println("El valor introducido no es un entero");
            return false;
        }
    }

    public String getDatoCadena() {
        return datoCadena;
    }

    public void setDatoCadena(String datoCadena) {
        this.datoCadena = datoCadena;
    }

    public int getDatoEntero() {
        return this.datoEntero;
    }

    public void setDatoEntero(int datoEntero) {
        this.datoEntero = datoEntero;

    }

    public Scanner getScanner() {
        return this.entrada;
    }

    public void limpiarBuffer() {
        this.entrada.reset();
    }

}//fin de la clase
