package mundotic;

import java.util.Scanner;

public class Menu {

	// COMO ATRIBUTO EL ARRAY DE OPCIONES, PODRÍA HABER SIDO UNA ESTRUCTURA
	// DINAMICA, PERO ESTAMOS EN EL PRINCIPIO, ASÍ QUE ARRAY
	String opciones[];
	

	// CONSTRUCTOR POR PARAMETRO que carga las opciones del menu
	Menu(String[] opciones) {		
		this.opciones = opciones.clone();		
	}

	

	
//*****************PARTE PUBLICA DE LA CLASE*******************************************************************************************************

	// MOSTRAR OPCIONES. Muestra el contenido del array
	public void mostrarOpciones() {
		for (String element : opciones) {
			System.out.println(element);
		}

	}

	// CONTROLAR OPCION. Este metodo utiliza metodos de la parte privada de la clase
	public int controlarOpcion() {

		String dato = obtenerOpcion();

		return comprobarOpcionValida(dato);

	}

	// SALIR. Este metodo comprobará que se ha pulsado la opción de salir.
	public boolean salir(int opcion) {

		if (opcion == opciones.length)
			return true;
		else
			return false;

	}

//*****************FIN PARTE PUBLICA DE LA CLASE********************************************************************************************************
	
//*****************PARTE PRIVADA DE LA CLASE************************************************************************************************************

	//Este metodo nos pide la opcion  
	@SuppressWarnings("resource")
	private String obtenerOpcion() {
		
		System.out.println("Introduzca una opcion valida");

		//Devolvemos el dato de forma anónima
		return new Scanner(System.in).nextLine();
		
	}

	//Este metodo nos comprueba si es valida o no
	private int comprobarOpcionValida(String dato) {

		// Comprobaríamos que el dato es un entero y lo convertiriamos
		int opcion = 0;

		try {
			opcion = Integer.parseInt(dato);

			if (opcion < 0 || opcion > opciones.length) {
				opcion = 0;
				System.out.println("La opción elegida no está en el rango permitido");
			}
		} catch (Exception e) {
			System.out.println("Error en el dato introducido, no es un número");
		}

		return opcion;
	}
	
	
	

	// *****************FIN PARTE PRIVADA DE LA CLASE**************************

}
