/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundotic.cursojava.E.sintaxis;

/**
 *
 * @author Javi
 */
public class C_TiposDatosPrimitivos {

    public static void main(String[] args) {

        //Si imprimimos los datos sin haber asignado valores, obtendremos sus valores por defecto
        DatosPrimitivos d = new DatosPrimitivos();
        System.out.println(d.getEntero());
        System.out.println(d.getCorto());
        System.out.println(d.getLargo());
        System.out.println(d.getDecimalDoblePrecision());
        System.out.println(d.getDecimalSimple());
        System.out.println(d.getCaracter());
        System.out.println(d.getB());
        System.out.println(d.isBooleano());
        
        //asignamos un valor a cada variable
        d.setB((byte)12);
        d.setBooleano(true);
        d.setCaracter('c');
        d.setCorto((short)225);
        d.setDecimalDoblePrecision(5.26654879465);
        d.setDecimalSimple((float)5.658);
        d.setEntero(5);
        d.setLargo(654665487);
        
        //volvemos a imprimir los valores
        System.out.println(d.getEntero());
        System.out.println(d.getCorto());
        System.out.println(d.getLargo());
        System.out.println(d.getDecimalDoblePrecision());
        System.out.println(d.getDecimalSimple());
        System.out.println(d.getCaracter());
        System.out.println(d.getB());
        System.out.println(d.isBooleano());
        
    }

}

class DatosPrimitivos {

    private int entero;
    private short corto;
    private long largo;
    private double decimalDoblePrecision;
    private float decimalSimple;
    private char caracter;
    private byte b;
    private boolean booleano;

    /*getters y setters*/


    public short getCorto() {
        return corto;
    }

    public void setCorto(short corto) {
        this.corto = corto;
    }

    public long getLargo() {
        return largo;
    }

    public void setLargo(long largo) {
        this.largo = largo;
    }

    public double getDecimalDoblePrecision() {
        return decimalDoblePrecision;
    }

    public void setDecimalDoblePrecision(double decimalDoblePrecision) {
        this.decimalDoblePrecision = decimalDoblePrecision;
    }

    public float getDecimalSimple() {
        return decimalSimple;
    }

    public void setDecimalSimple(float decimalSimple) {
        this.decimalSimple = decimalSimple;
    }

    public char getCaracter() {
        return caracter;
    }

    public void setCaracter(char caracter) {
        this.caracter = caracter;
    }

    public byte getB() {
        return b;
    }

    public void setB(byte b) {
        this.b = b;
    }

    public boolean isBooleano() {
        return booleano;
    }

    public void setBooleano(boolean booleano) {
        this.booleano = booleano;
    }

    public int getEntero() {
        return entero;
    }

    public void setEntero(int entero) {
        this.entero = entero;
    }
    
    

}
