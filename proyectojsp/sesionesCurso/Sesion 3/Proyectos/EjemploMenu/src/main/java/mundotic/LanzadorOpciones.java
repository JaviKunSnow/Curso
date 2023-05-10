package mundotic;

public class LanzadorOpciones {

	public static void ejecutarOpcion(int opcion) {

		// ESTA CLASE ES LA QUE HAY QUE MODIFICAR Y AÑADIR OPCIONES CASE EN FUNCIÓN DE
		// LAS OPCIONES QUE TENGAMOS
		switch (opcion) {
		case 1:
			System.out.println("Aqui vamos a introducir un submenu ");

			String submenuOpcione[] = { "1.- opcion 1.1", "2.- opcion 1.2", "3.- salir" };
			int opcionSub = 0;

			Menu subMenu = new Menu(submenuOpcione);
			

			do {
				// mostramos las acciones
				subMenu.mostrarOpciones();

				// cargamos una opcion valida y devolvemos su valor numerico o devolvemos un 0
				// si algo ha ido mal
				opcion = subMenu.controlarOpcion();

				// En caso de no ser un cero, todo ha ido bien, damos paso a la lanzadera de
				// opciones
				if (opcion != 0)
					System.out.println("Aquí colocaríamos la lanzadera del primer submenu");

				// el propio objeto evalua si la opcion es salir o no
				// No es necesario hacerlo así, recordad que estamos cumpliendo los requisitos
				// que nos ha planteado el problema
				
			} while (!subMenu.salir(opcion));

			break;
		case 2:
			System.out.println("Aqui realizariamos las acciones de la opcion 2");
			break;
		case 3:
			System.out.println("Aqui realizariamos las acciones de la opcion 3");
			break;

		default:
			System.out.println("Se ha pulsado al opcion de salir");
		}

	}

}
