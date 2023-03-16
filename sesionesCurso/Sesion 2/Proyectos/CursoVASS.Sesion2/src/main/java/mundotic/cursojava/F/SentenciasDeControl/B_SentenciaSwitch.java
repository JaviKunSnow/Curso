/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundotic.cursojava.F.SentenciasDeControl;

/**
 *
 * @author Javi
 */
public class B_SentenciaSwitch {
    // Programa Java para demostrar el uso de la declaración if.

    public static void main(String[] args) {

        Ejemplo2 ejem = new Ejemplo2();
        ejem.ejemploSwitch7();

    }

}

class Ejemplo2 {

    enum Day {
        Lun, Mar, Mier, Jueve, Vier, Saba, domi
    };

    public void ejemploSwitch() {

        int number = 20;

        switch (number) {

            case 10:
                System.out.println("10");
                break;
            case 20:
                System.out.println("20");
                break;
            case 30:
                System.out.println("30");
                break;

            default:
                System.out.println("Not in 10, 20 or 30");
        }

        //
    }

    public void ejemploSwithc2() {

        int mes = 7;
        String cadenaMes = "";

        switch (mes) {

            case 1:
                cadenaMes = "1 - Enero";
                break;
            case 2:
                cadenaMes = "2 - Febrero";
                break;
            case 3:
                cadenaMes = "3 - Marzo";
                break;
            case 4:
                cadenaMes = "4 - Abril";
                break;
            case 5:
                cadenaMes = "5 - Mayo";
                break;
            case 6:
                cadenaMes = "6 - Junio";
                break;
            case 7:
                cadenaMes = "7 - Julio";
                break;
            case 8:
                cadenaMes = "8 - Agosto";
                break;
            case 9:
                cadenaMes = "9 - Septiembre";
                break;
            case 10:
                cadenaMes = "10 - Octubre";
                break;
            case 11:
                cadenaMes = "11 - Noviembre";
                break;
            case 12:
                cadenaMes = "12 - Diciembre";
                break;
            default:
                System.out.println("Dato no valido!");
        }

        System.out.println(cadenaMes);
    }

    public void EjemploSwitch3() {
        char ch = 'O';
        switch (ch) {
            case 'a':
                System.out.println("Vocal");
                break;
            case 'e':
                System.out.println("Vocal");
                break;
            case 'i':
                System.out.println("Vocal");
                break;
            case 'o':
                System.out.println("Vocal");
                break;
            case 'u':
                System.out.println("Vocal");
                break;
            case 'A':
                System.out.println("Vocal");
                break;
            case 'E':
                System.out.println("Vocal");
                break;
            case 'I':
                System.out.println("Vocal");
                break;
            case 'O':
                System.out.println("Vocal");
                break;
            case 'U':
                System.out.println("Vocal");
                break;
            default:
                System.out.println("Consonante");
        }
    }

    public void ejemploSwitch4() {
        int number = 20;

        switch (number) {

            case 10:
                System.out.println("10");
            case 20:
                System.out.println("20");
            case 30:
                System.out.println("30");
            default:
                System.out.println("Not in 10, 20 or 30");
        }
    }

    public void ejemploSwitch5() {

        String levelString = "Experto";
        int level = 0;

        switch (levelString) {

            case "Inicial":
                level = 1;
                break;
            case "Intermedio":
                level = 2;
                break;
            case "Experto":
                level = 3;
                break;
            default:
                level = 0;
                break;
        }
        System.out.println("Tu nivel es: " + level);
    }

    public void EjemploSwitch() {

        char branch = 'C';
        int collegeYear = 4;
        switch (collegeYear) {
            case 1:
                System.out.println("Ingles, Mates, Ciencia");
                break;
            case 2:
                switch (branch) {
                    case 'C':
                        System.out.println("Sistemas Opertaivos , Java, Estructuras de datose");
                        break;
                    case 'E':
                        System.out.println("MicroProcesadores, Logica Matematica");
                        break;
                    case 'M':
                        System.out.println("Dibujo, Ingenieria");
                        break;
                }
                break;
            case 3:
                switch (branch) {
                    case 'C':
                        System.out.println("Computacion, MultiMedia");
                        break;
                    case 'E':
                        System.out.println("Fundamentos de Logica, Microelectronica");
                        break;
                    case 'M':
                        System.out.println("Combustion interna, Vibracion mecanica");
                        break;
                }
                break;
            case 4:
                switch (branch) {
                    case 'C':
                        System.out.println("Redes, MultiMedia");
                        break;
                    case 'E':
                        System.out.println("Sistemas Embebidos, Procesamiento de imagenes");
                        break;
                    case 'M':
                        System.out.println("Tecnologia, Ingenieria Termal");
                        break;
                }
                break;
        }
    }

    @SuppressWarnings("empty-statement")
    public void ejemploSwitch7() {

        Day[] DayNow = Day.values();
        for (Day Now : DayNow) {
            switch (Now) {
                case Lun:
                    System.out.println("Lunes");
                    break;
                case Mar:
                    System.out.println("Martes");
                    break;
                case Mier:
                    System.out.println("Miercoles");
                    break;
                case Jueve:
                    System.out.println("Jueves");
                    break;
                case Vier:
                    System.out.println("Viernes");
                    break;
                case domi:
                    System.out.println("Sabado");
                    break;
                case Saba:
                    System.out.println("Domingo");
                    break;
            }

        }
    }

    public void ejemploSwitch9() {
        Integer age = 18;
        switch (age) {
            case (16):
                System.out.println("Eres menor de 18.");
                break;
            case (18):
                System.out.println("Apto para votar.");
                break;
            case (65):
                System.out.println("Eres de mediana edad.");
                break;
            default:
                System.out.println("Introduce una edad valida.");
                break;
        }

    }

}
