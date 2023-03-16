/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundotic.cursojava.G.EntradaSalida;

/**
 *
 * @author Javi
 */
public class ProgramaPrincipal {

    public static void main(String[] args) {
        //Creamos el objeto para controlar la entrada de datos
        EntradaDatos entrada = new EntradaDatos();
        //Cremoa el objeto para controlar el menu
        Menu menu = new Menu();

        //utilizamos este bucle para mantener el menu funcionando mientras el usuario elige salir
        do {
            menu.mostrarOpciones();
            entrada.leerEnteroSeguro();
            //Llamamos al menu siempre que el usuario no quiera salir.
            if (entrada.getDatoEntero() != 0) {
                menu.controlarMenu(entrada.getDatoEntero());
                //aqui van los submenus
                
            } else {
                System.out.println("Operaciones de cierre de la aplicacion");
            }

        } while (entrada.getDatoEntero() != 0);
    }

}//fin de la clase
