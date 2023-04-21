package view;

import java.util.Scanner;

import controller.RegisterController;

public class RegisterView {

	static Scanner teclado = new Scanner(System.in);
	RegisterController registerController = new RegisterController();
	
	public void registrarse() {
		
		String email;
		String password1;
		String password2;
		
		do {
			
			System.out.println("REGISTRO");
			System.out.println("------------------");
			System.out.println("Email:");
			email = teclado.next();
			
			System.out.println("Contraseña: ");
			password1 = teclado.next();
			
			System.out.println("Repetir contraseña: ");
			password2 = teclado.next();
			
			
		} while(!email.contains("@") && email.isEmpty() && !password1.equals(password2));
		
		registerController.Registrarme(email, password1);
	}
	
}
