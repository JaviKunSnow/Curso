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
class D_AutoboxBeatsWiddening {

    //SE LLAMARÃ? EN EL MOMENTO QUE SE PASE UN PARAMETRO PRIMITIVO QUE PUEDA SER CONVERTIDO POR ENSANCHAMIENTO
    static void m(int i) {
        System.out.println("int");
    }

    //ESTE METODO NO SE LLAMARÃ? A MENOS QUE SE PASE EL PARAMETRO DE TIPO OBJETO INTEGER
    static void m(Integer i) {
        System.out.println("Integer");
    }

    //HEMOS DECLARADO LOS METODOS DE ARRIBA ESTATICOS PARA PODER LLAMARLOS EN EL MAIN
    public static void main(String args[]) {
        int s = 30;
        m(s);
    }
}
