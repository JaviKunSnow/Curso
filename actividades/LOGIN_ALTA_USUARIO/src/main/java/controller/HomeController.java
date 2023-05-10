package controller;

import view.HomeView;
import view.LoginView;
import view.RegisterView;

public class HomeController {

	static HomeView homeView = new HomeView();
	static LoginView loginView = new LoginView();
	static RegisterView registerView = new RegisterView();
	UserController userController = new UserController();
	
	public void llamadaInicial() {
		
		homeView.menuInicial();
		
	}
	
	public void EnviarVista(int num) {
		
		if(num == 1) {
			registerView.registrarse();
		} else if(num == 2) {
			loginView.logearte();
		} else if(num == 3) {
			userController.devolverUsuarios();
		}
		
	}
	
}
