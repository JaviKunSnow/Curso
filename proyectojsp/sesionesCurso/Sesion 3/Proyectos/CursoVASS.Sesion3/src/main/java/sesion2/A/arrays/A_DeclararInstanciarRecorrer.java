/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion2.A.arrays;

/**
 *
 * @author Javi
 */
class A_DeclararInstanciarRecorrer {

    public static void main(String args[]) {
        MiArray array = new MiArray();

        array.rellenar();

    }
}

class MiArray {

    private int a[];

    MiArray() {

        int a[]; //declaracion
        a = new int[5];//instanciacion

        a[0] = 10;//Una forma de inicializar
        a[1] = 20;
        a[2] = 70;
        a[3] = 40;
        a[4] = 50;

        char b[];
        b = new char[4];
        b[0] = 'H';//Una forma de inicializar
        b[1] = 'o';
        b[2] = 'l';
        b[3] = 'a';

        boolean c[];
        c = new boolean[5];
        c[0] = true;//Una forma de inicializar
        c[1] = false;
        c[2] = true;
        c[3] = false;

    }

    public void recorrer() {
        //recorrer
        for (int i = 0; i < this.a.length; i++)// length es una propiedad de la clase que nos devuelve el numero de elementos
        {
            System.out.println(a[i]);
        }
    }

    public void rellenar() {
        int miArray[];
        miArray = new int[25];

        //rellenar el array con numeros del 1 al 15
        for (int i = 0; i < 15; i++) {
            if (miArray[i] == 0) {
                miArray[i] = i + 1;
            }
        }

        //Mostrar el contenido del array
        for (int i = 0; i < 15; i++) {
            System.out.println(miArray[i]);
        }
        

        //Alamacenar otra vez valores en posiciones del array
        for (int i = 0; i < 10; i++) {
            miArray[i] = i * i + miArray[i];
        }

        
        //Mostrar el contenido del array
        for (int i = 0; i < 15; i++) {
            System.out.println(miArray[i]);
        }

        
        //Acceder a posiciones concretas
        System.out.println(miArray[0]);
        System.out.println(miArray[3]);
        System.out.println(miArray[5]);
        System.out.println(miArray[9]);

        //Array de Cadenas
        String[] array = null;
        array = new String[6];

        //rellenar en las posiciones impares y pares
        for (int i = 0; i < 6; i++) {
            if (i % 2 != 0) {
                array[i] = "Hola, que tal?";
            } else {
                array[i] = "bien";
            }
        }

        
        //Mostrar el contenido del array
        for (int i = 0; i < 6; i++) {
            System.out.println(array[i]);
        }

    }

}
