package sesion2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class menu {

	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		llamadaMenu();

	}
	
	public static void llamadaMenu() {
		
		System.out.println("1. Opcion 1");
		System.out.println("2. Opcion 2");
		System.out.println("3. Opcion 3");
		System.out.println("-------------");
		System.out.println("Dime una opcion:");
		tryMenu();
		
	}
	
	public static void tryMenu() {
		try {
			valorMenu(teclado.nextInt());
		} catch(InputMismatchException e) {
			System.out.println("El valor introducido no es un numero.");
		}
	}
	
	public static void valorMenu(int valor) {
		
		switch(valor) {
			case 1:
				mensaje(1);
				break;
			case 2:
				mensaje(2);
				break;
			case 3:
				mensaje(3);
				break;
			default:
				System.out.println("No has elegido ninguna opcion.");
				break;
		}
		
		//llamadaMenu();
		
	}
	
	public static void mensaje(int valor) {
		System.out.println("has elegido la opcion " + valor + ".");
		
	}

}
