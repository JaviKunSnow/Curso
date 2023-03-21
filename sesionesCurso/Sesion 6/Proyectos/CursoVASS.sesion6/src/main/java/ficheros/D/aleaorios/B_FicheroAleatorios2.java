package ficheros.D.aleaorios;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * El siguiente código, supuestamente crea un archivo de acceso aleatorio para guardar información de un máximo de 15 cursos (numerados del
 * 1 al 15), sobre los que se guardará la siguiente información: numero del curso (int) - 4 bytes nombre (máximo 15 caracteres) - 30 bytes
 * coste (double) - 8 bytes
 *
 * @author Nocturno
 */
public class B_FicheroAleatorios2 {

    private static final int[] numero = {10, 2, 1, 5};
    private static final String[] nombre = {"Curso10", "Curso2", "Curso1", "Curso5"};
    private static final double[] coste = {4000, 5000, 6000, 3000};
    private static final String ruta = "CursosAleatorio.dat";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1 se guarda en la variable n la cantidad de números del array numero
        int n = numero.length;
        int posicion = 0;

        //2 Crea un objeto de tipo File con la ruta al archivo de trabajo
        File fichero = new File(ruta);

        try {
            //3 Acceso tipo raf al fichero de trabajo
            RandomAccessFile file = new RandomAccessFile(fichero, "rw");
            //4 bucle que escribe un -1 en cada byte mútiplo de 42 quince veces
            // hace que el archivo tenga una longitud total disponible para 15 cursos
            for (int i = 0; i < 15; i++) {
                file.seek(posicion);

                file.writeInt(-1);

                posicion += 42;
            }
            //5 bucle for que ejecuta el método insertaCurso una vez por cada
            // elemento que compone el array "numero"
            // Este  método escribe los datos numero, nombre y coste en ese orden
            // en cada espacio destinado para ello. Esto es que comienza en el 0 y
            // sigue una vez cada 42 bytes
            for (int i = 0; i < n; i++) {
                insertaCurso(i, file);
            }

            file.close();
            System.out.printf("\n\nFichero %s creado exitosamente\n\n", ruta);
        } catch (IOException ex) {
            System.err.println("\nError de escritura\n");

        }
    }

    private static void insertaCurso(int index, RandomAccessFile file) throws IOException {

        StringBuffer buffer;
        int num = numero[index];
        //6 define un valor obtenido del valor del array "numero",
        // y lo posiciona uno antes porque el raf empieza en cero y el convenio de
        // numerar cursos empieza por 1
        int pos = (num - 1) * 42;

        //7 posiciona el puntero en el valor dado por la variable pos
        file.seek(pos);

        //8 escribe el número del curso como un entero, al principio del slot
        // de 42 bytes. este valor ocupa 4 bytes
        file.writeInt(num);

        //9 prepara un buffer tipo String con el nombre del curso y lo formatea
        // a una longitud de 15 bytes
        buffer = new StringBuffer(nombre[index]);
        buffer.setLength(15);

        //10 escribe el anterior buffer en el archivo, en formato tipo String
        file.writeChars(buffer.toString());

        //11 escribe en el archivo un valor tipo double que es el valor del
        // un elemento coste[] usando como índice el argumento dado al método
        file.writeDouble(coste[index]);

    }

}
