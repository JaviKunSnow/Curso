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
public class Menu {
    
    private int opcion;
    
    Menu()
    {
        this.opcion =  -1;
    }

    public int getOpcion() {
        return opcion;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }
    
    public void controlarMenu(int opcion)
    {
         switch (opcion){
             
            case 1:
                System.out.println("Hariamos las operaciones y llamadas que hiciera falta desde 1");
                break;
            case 2:
                System.out.println("Hariamos las operaciones y llamadas que hiciera falta desde 2");
                break;
            case 3:
                System.out.println("Hariamos las operaciones y llamadas que hiciera falta desde 3");
                 break;
            default:
                System.out.println("No has introducido la opcion correcta");
        }        
    }
    
    public void mostrarOpciones()
    {
        System.out.println("Introduzca cualquiera de las opciones del menu.\n");
        System.out.println("1.- Operaciones");
        System.out.println("2.- Copia de seguridad");
        System.out.println("3.- Limpieza de memoria");
        System.out.println("0.- Salir");
    }
    
}//fin de la clase
