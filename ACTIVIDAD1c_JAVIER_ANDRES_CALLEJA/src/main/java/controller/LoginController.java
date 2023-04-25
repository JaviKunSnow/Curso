package controller;

import dao.UsuarioDAO;
import view.HomeView;
import config.PropiedadesLog;

public class LoginController {

	UsuarioDAO usuarioDAO = new UsuarioDAO();
	HomeView homeView = new HomeView();
	PropiedadesLog propiedades = new PropiedadesLog();
	
	public void logearte(String email, String password) {
		
		if(usuarioDAO.findByEmail(email, password)) {
			homeView.logeado();
			propiedades.loginAccess(email);
		} else {
			System.out.println("Login incorrecto.");
			homeView.menuInicial();
		}
		
		
	}
	
}
