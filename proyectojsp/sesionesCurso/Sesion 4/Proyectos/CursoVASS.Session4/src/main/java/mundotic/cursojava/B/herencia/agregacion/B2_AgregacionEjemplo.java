/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundotic.cursojava.B.herencia.agregacion;

/**
 *
 * @author Javi
 */



class Empresa 
{
    B2_AgregacionEjemplo listaEmpleados[];
    
    Empresa()
    {
        
    }
}


public class B2_AgregacionEjemplo {

    int id;
    String name;
    //Agregamos el objeto
    B1_AgregaciónEjemplo address;

    public B2_AgregacionEjemplo(int id, String name, B1_AgregaciónEjemplo address) {
        this.id = id;
        this.name = name;
        //NO LO INSTANCIAMOS DENTRO
        this.address = address;
    }

    void display() {
        System.out.println(id + " " + name);
        System.out.println(address.city + " " + address.state + " " + address.country);
    }

    public static void main(String[] args) {
        B1_AgregaciónEjemplo address1 = new B1_AgregaciónEjemplo("gzb", "UP", "india");
        B1_AgregaciónEjemplo address2 = new B1_AgregaciónEjemplo("gno", "UP", "india");

        B2_AgregacionEjemplo e = new B2_AgregacionEjemplo(111, "varun", address1);
        B2_AgregacionEjemplo e2 = new B2_AgregacionEjemplo(112, "arun", address2);

        e.display();
        e2.display();

    }
}
