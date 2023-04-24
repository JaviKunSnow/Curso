package view;

import java.util.Scanner;

import controller.HomeController;

public class HomeView {

	static Scanner teclado = new Scanner(System.in);
	static HomeController homeController = new HomeController();
	
	public void menuInicial() {
		
		int num = 0;
		
		do {
			
			System.out.println("------------------");
			System.out.println("1. Registrarse");
			System.out.println("2. Login");
			System.out.println("3. Ver usuarios");
			System.out.println("4. Salir");
			System.out.println("------------------");
			System.out.println("Elige una opcion:");
			num = teclado.nextInt();
			
		} while(num >= 5);
		
		homeController.EnviarVista(num);
		
	}
	
	public void logeado() {
		System.out.println("login correcto.");
	}
	
}
