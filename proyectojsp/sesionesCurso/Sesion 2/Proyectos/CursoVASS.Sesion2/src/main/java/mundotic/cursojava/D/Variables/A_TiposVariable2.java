/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundotic.cursojava.D.Variables;

/**
 *
 * @author Javi
 */
public class A_TiposVariable2 {

    int data = 50;//variable de instancia  
    static int m = 100;//variable estatica o de clase 

    A_TiposVariable2() {
        m++;
    }

    public void unMetodo() {

        int n = 90;//variable local al metodo. SOLO SE PUEDE UTILIZAR DENTRO DE ESE METODO!.
        this.data = 39;
        A_TiposVariable2.m++;

        if (n > 0) {
            String nombre = "hola";
        }

    }

    public void otroMetodo() {
        this.data = 0;
        this.m--;
    }

    public int devolverDato() {
        return this.data;
    }

    public void devolverVarStatic() {
        System.out.println(A_TiposVariable2.m);
    }

    //Frase que hay que recordar si o si. EL AMBITO DE LAS VARIABLES DECLARADAS DEBE DE SER EL MAS REDUCIDO POSIBLE.
}


class Ejemplo3 {

    public static void main(String[] args) {

        A_TiposVariable2 a = new A_TiposVariable2();
        a.devolverVarStatic();

        System.out.println(a.devolverDato());

        A_TiposVariable2 b = new A_TiposVariable2();
        System.out.println(b.devolverDato());

        a.devolverVarStatic();
        System.out.println(a.devolverDato());
        b.devolverVarStatic();

        a.unMetodo();
        System.out.println(a.devolverDato());
        b.devolverVarStatic();

//        a.otroMetodo();
//        a.unMetodo();
        System.out.println(A_TiposVariable2.m);
    }

}
