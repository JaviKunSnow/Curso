/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheros.C.binarios;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Javi
 */
class Estudiante {

    String nombre;
    boolean genero; // true is male, false is female
    int edad;
    float grado;

}

public class OperacionesFicherosBinariosDatos {

    static String outputFile = "FicheroAlumnos.dat";
    static DataOutputStream salida;

    public static void main(String[] args) throws FileNotFoundException {

        Estudiante lista[] = new Estudiante[3];

        salida = new DataOutputStream(new FileOutputStream(outputFile));

        Estudiante estudiante = new Estudiante();
        estudiante.nombre = "Un nombre";
        estudiante.genero = false;
        estudiante.edad = 35;
        estudiante.grado = 3;

        lista[0] = estudiante;

        estudiante = new Estudiante();
        estudiante.nombre = "Un nombre";
        estudiante.genero = false;
        estudiante.edad = 34;
        estudiante.grado = 3;

        lista[1] = estudiante;

        estudiante = new Estudiante();
        estudiante.nombre = "Un nombre";
        estudiante.genero = false;
        estudiante.edad = 33;
        estudiante.grado = 3;

        lista[2] = estudiante;

        try {

            for (Estudiante student : lista) {
                escribir(student);
            }

            salida.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    static void escribir(Estudiante student) throws IOException {

        salida.writeUTF(student.nombre);
        salida.writeBoolean(student.genero);
        salida.writeInt(student.edad);
        salida.writeFloat(student.grado);

    }

}

class LectorFicheroEstudiante {

    DataInputStream dataInput;

    public Estudiante[] leerTodo() throws IOException {

        Estudiante[] lista = new Estudiante[3];

        dataInput = new DataInputStream(new FileInputStream("FicheroAlumnos.dat"));

        try {
            int contador = 0;

            while (true) {

                //recuperamos los datos del fichero
                String name = dataInput.readUTF();
                boolean gender = dataInput.readBoolean();
                int age = dataInput.readInt();
                float grade = dataInput.readFloat();

                //Compongo la variable estudiante desde las variables que acabo de recoger
                Estudiante estudiante = new Estudiante();
                estudiante.nombre = name;
                estudiante.genero = gender;
                estudiante.edad = age;
                estudiante.grado = grade;

                lista[contador] = estudiante;
                contador++;
            }

        } catch (EOFException ex) {
            System.out.println("Hemos llegado al fin del fichero");
        }

        dataInput.close();

        return lista;
    }

    public static void main(String[] args) {

        try {
            LectorFicheroEstudiante lector = new LectorFicheroEstudiante();

            Estudiante lista[] = lector.leerTodo();

            for (Estudiante estudiante : lista) {
                System.out.print(estudiante.nombre + "\t");
                System.out.print(estudiante.genero + "\t");
                System.out.print(estudiante.edad + "\t");
                System.out.println(estudiante.grado);
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
