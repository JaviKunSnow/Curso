package controller;

import dao.UsuarioDAO;
import view.HomeView;

public class LoginController {

	UsuarioDAO usuarioDAO = new UsuarioDAO();
	HomeView homeView = new HomeView();
	
	public void logearte(String email, String password) {
		
		if(usuarioDAO.findByEmailPassword(email, password)) {
			homeView.logeado();
		} else {
			System.out.println("Login incorrecto.");
			homeView.menuInicial();
		}
		
		
	}
	
}
