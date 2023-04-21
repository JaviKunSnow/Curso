package view;

import java.util.Scanner;

public class LoginView {
	
	static Scanner teclado = new Scanner(System.in);
	
	public void logearte() {
		
		String email;
		String password1;
		
		do {
			
			System.out.println("LOGIN");
			System.out.println("------------------");
			System.out.println("Email:");
			email = teclado.next();
			
			System.out.println("Contraseña: ");
			password1 = teclado.next();
			
			
		} while(!email.contains("@") && email.isEmpty() && password1.isEmpty());
		
		
	}
	
}
