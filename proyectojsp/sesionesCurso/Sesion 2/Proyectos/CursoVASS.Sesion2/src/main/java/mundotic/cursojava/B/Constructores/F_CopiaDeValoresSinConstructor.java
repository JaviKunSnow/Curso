/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundotic.cursojava.B.Constructores;

/**
 *
 * @author Javi
 */
class F_CopiaDeValoresSinConstructor {

    int id;
    String name;

    F_CopiaDeValoresSinConstructor(int i, String n) {
        id = i;
        name = n;
    }

    F_CopiaDeValoresSinConstructor() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String args[]) {
        F_CopiaDeValoresSinConstructor s1 = new F_CopiaDeValoresSinConstructor(111, "Luis");
        F_CopiaDeValoresSinConstructor s2 = new F_CopiaDeValoresSinConstructor();
        s2.setId(s1.getId());
        s2.setName(s1.getName());
        s2.name = s1.name;
        s1.display();
        s2.display();
    }
}
