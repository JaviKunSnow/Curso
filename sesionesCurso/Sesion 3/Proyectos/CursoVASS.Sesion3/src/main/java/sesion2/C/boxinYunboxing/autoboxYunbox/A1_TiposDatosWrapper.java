/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion2.C.boxinYunboxing.autoboxYunbox;

/**
 *
 * @author Javi
 */
class DatosWrapper {

    private Integer entero;
    private Short corto;
    private Long largo;
    private Double decimaDoblePrecision;
    private Float decimalSimple;
    private Character caracter;
    private Byte b;
    private Boolean booleano;

    public Integer getEntero() {
        this.entero = 6; //Auto-boxing
        return entero;
    }

    public void setEntero(Integer entero) {
        this.entero = entero;
    }

    public Short getCorto() {
        return corto;
    }

    public void setCorto(Short corto) {
        this.corto = corto;
    }

    public Long getLargo() {
        return largo;
    }

    public void setLargo(Long largo) {
        this.largo = largo;
    }

    public Double getDecimaDoblePrecision() {
        return decimaDoblePrecision;
    }

    public void setDecimaDoblePrecision(Double decimaDoblePrecision) {
        this.decimaDoblePrecision = decimaDoblePrecision;
    }

    public Float getDecimalSimple() {
        return decimalSimple;
    }

    public void setDecimalSimple(Float decimalSimple) {
        this.decimalSimple = decimalSimple;
    }

    public Character getCaracter() {
        return caracter;
    }

    public void setCaracter(Character caracter) {
        this.caracter = caracter;
    }

    public Byte getB() {
        return b;
    }

    public void setB(Byte b) {
        this.b = b;
    }

    public Boolean getBooleano() {
        return booleano;
    }

    public void setBooleano(Boolean booleano) {
        this.booleano = booleano;
    }

}//fin de clase

public class A1_TiposDatosWrapper {

    public static void main(String[] args) {

        //todos los wrapper heredan directamente de la clase Object
        //gracias a esto podemos utilizar todos sus metodos a traves de nuestras variables definidas
        Object obj = new Object();

        obj.hashCode();
        obj.getClass();

        obj.toString();

        //como vemos spodemos acceder a todos los metodos disponibles de la clase object ademas de los propios del objeto
        DatosWrapper d = new DatosWrapper();

        int num = 568;
        short corto = 126;
        long largo = 564648799;
        double decimalDoble = 465.14123421342134;
        float decimalSimple = 32.214f;
        char unChar = 'f';
        byte unByte = 1;
        boolean unBooleno = false;

        d.setB(unByte);
        d.setBooleano(unBooleno);
        d.setCaracter(unChar);
        d.setCorto(corto);
        d.setDecimaDoblePrecision(decimalDoble);
        d.setDecimalSimple(decimalSimple);
        d.setEntero(num);
        d.setLargo(largo);

        //CREAMOS CLASES
        Boolean bool = true;
        Byte b = unByte;
        Integer entero = 6;
        Long unLargo = new Long(79879874);
        Character caracter;
        caracter = 'c';
        Float unDecimal = new Float(8.36);

        //A TRAVES DE LAS CLASES WRAPPER PODEMOS TRABAJAR CON DIFERENTES TIPOS DE METODOS PARA HACER CONVERSIONES ENTRE TIPOS.
        boolean booleano = Boolean.parseBoolean("false");

        //CONVERSI√ìN DE ENTEROS
        int numero = Integer.parseInt("15");
        Integer numero2 = Integer.parseInt("16");
        String numero3 = numero2.toString(); //mientras que numero no tendr√≠a disponible ese m√©todo.     
        
        

        String s = Character.toString('|');

        //algunos tipos no se pueden convertir de forma directa
        String se = (String) true; //ESTO NO SE PODR√?A HACER PERO SI PODR√?AMOS HACERLO A LA INVERSA

        se = Boolean.toString(true);

    }
}
