/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundotic.cursojava.A.herencia;

/**
 *
 * @author Javi
 */
public class B_HerenciaSimple {

   private float salary;
   private String nombre;
   private String apellido;

    protected B_HerenciaSimple() {
        salary = 10000;
        nombre = "A";
        apellido = "B";
    }

    protected float getSalary() {
        return salary;
    }

    protected void setSalary(float salary) {
        this.salary = salary;
    }

    protected String getNombre() {
        return nombre;
    }

    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }

    protected String getApellido() {
        return apellido;
    }

    protected void setApellido(String apellido) {
        this.apellido = apellido;
    }

}

class Programador extends B_HerenciaSimple {

    private int bonus;

    public Programador(int bonus) {
        this.bonus = bonus;
    }

    public Programador() {
        bonus = 100;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }    
    

}

class Administrativo extends B_HerenciaSimple {

   private int extra;
   private String otroDato;

    public Administrativo(int bonus) {
        this.extra = bonus;
    }

    public Administrativo() {
        extra = 0;
    }

    public int getExtra() {
        return extra;
    }

    public void setExtra(int extra) {
        this.extra = extra;
    }

    public String getOtroDato() {
        return otroDato;
    }

    public void setOtroDato(String otroDato) {
        this.otroDato = otroDato;
    }
      

}

class Principal {

    public static void main(String args[]) {
        Programador p = new Programador();
        float salario = p.getSalary();
        System.out.println("Programmer salary is:" + p.getSalary());
        System.out.println("Bonus of Programmer is:" + p.getBonus());

    }
}
