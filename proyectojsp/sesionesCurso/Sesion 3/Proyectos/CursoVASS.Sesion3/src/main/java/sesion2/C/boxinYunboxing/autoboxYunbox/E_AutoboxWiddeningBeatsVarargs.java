/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion2.C.boxinYunboxing.autoboxYunbox;

/**
 *
 * NO INCLUIR EN LOS EJEMPLOS!!!! MALO MALO
 */
class E_AutoboxWiddeningBeatsVarargs {

    static void m(int i, int i2) { //autoboxing
        System.out.println("int int");
    }

    static void m(int... i) //Esta forma de pasar los paramertos es que pueden llegar, 0 o n objetos de ese tipo o un array de ese tipo.
                               // Es como simular los vargas del main
    {
        System.out.println("lista...");
    }

    public static void main(String... args) {
        //ESTOS VAN A SER NUESTROS ARGUMENTOS
        int s1 = 30, s2 = 40;
        
        //LLAMAMOS AL MÉTODO Y COMO EL AUTOBOXING VA TIENE PREFERENCIA SOBRE LA LISTA DE PARAMETROS SE LLAMARA AL METODO SOBRECARGADO CON DOS PARAMETROS ENTEROS.
        m(s1, s2);
        m(s1,s2,s1);
    }
}
