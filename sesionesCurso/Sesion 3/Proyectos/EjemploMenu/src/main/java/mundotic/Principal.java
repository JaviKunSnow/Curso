package mundotic;

public class Principal {
	
	static String opciones[] = new String[4];
	
	public static void main(String... args)
	{
	
		int opcion= 0;		
		
		cargarOpciones();
		
		Menu menuPrincipal= new Menu(opciones);
		
		
		do
		{	
			//mostramos las acciones
			menuPrincipal.mostrarOpciones();
			
			//cargamos una opcion valida y devolvemos su valor numerico o devolvemos un 0 si algo ha ido mal
			opcion = menuPrincipal.controlarOpcion();
		
			//En caso de no ser un cero, todo ha ido bien, damos paso a la lanzadera de opciones
			if(opcion != 0)
				LanzadorOpciones.ejecutarOpcion(opcion);	
			
			
		//el propio objeto evalua si la opcion es salir o no
	    //No es necesario hacerlo así, recordad que estamos cumpliendo los requisitos que nos ha planteado el problema
		}while(!menuPrincipal.salir(opcion));		
		
	}
	
	
	private static void cargarOpciones()
	{
		//Damos valor a las opciones del menú
		opciones[0] = "1.- Opcion 1";
		opciones[1] = "2.- Opcion 2";
		opciones[2] = "3.- Opcion 3";
		opciones[3] = "4.- Salir";
	}
}
