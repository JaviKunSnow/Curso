/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundotic.cursojava.A2.EjemplosClaseObjetoInstancia;

/**
 *
 * @author Javi
 */
//Java Program to demonstrate the working of a banking-system  
//where we depositar and retirada cantidad from our account.  
//Creating an Cuenta class which has depositar() and retirada() methods 

class Cuenta {

    int n_cuenta;
    String nombre;
    float cantidad;

    //metodo para inicializar el objeto
    void insertar(int a, String n, float amt) {
        n_cuenta = a;
        nombre = n;
        cantidad = amt;
    }
    
    //depositar dinero
    void depositar(float amt) {
        cantidad = cantidad + amt;
        System.out.println(amt + " deposited");
    }
    
//withdraw method  
    void retirada(float amt) {
        if (cantidad < amt) {
            System.out.println("Insufficient Balance");
        } else {
            cantidad = cantidad - amt;
            System.out.println(amt + " withdrawn");
        }
    }
  
    //metodo para comprobar el saldo
    void comprobarSaldo() {
        System.out.println("Balance is: " + cantidad);
    }


    //metodo para mostrar la informacion
    void mostrarInfo() {
        System.out.println(n_cuenta + " " + nombre + " " + cantidad);
    }
}

//Clase para probar  
class J_EjemploCuentasBancarias {

    public static void main(String[] args) {
        Cuenta a1 = new Cuenta();
        a1.insertar(832345, "Sara", 1000);
        a1.mostrarInfo();
        a1.comprobarSaldo();
        a1.depositar(40000);
        a1.comprobarSaldo();
        a1.retirada(15000);
        a1.comprobarSaldo();
    }
}
