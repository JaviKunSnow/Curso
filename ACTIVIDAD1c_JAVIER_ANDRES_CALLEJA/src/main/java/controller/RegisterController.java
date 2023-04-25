package controller;

import org.apache.tomcat.util.codec.binary.Base64;
import org.jasypt.util.password.PasswordEncryptor;
import org.jasypt.util.password.StrongPasswordEncryptor;

import config.PropiedadesLog;
import dao.UsuarioDAO;
import model.Usuario;
import view.HomeView;
import view.LoginView;
import view.RegisterView;

public class RegisterController {

	UsuarioDAO usuarioDAO = new UsuarioDAO();
	//RegisterView registerView = new RegisterView();
	LoginView loginView = new LoginView();
	HomeView homeView = new HomeView();
	PropiedadesLog propiedades = new PropiedadesLog();
	
	
	public void Registrarme(String email, String password) {
		
		StrongPasswordEncryptor encryptor = new StrongPasswordEncryptor();
		String passwordCifrada = encryptor.encryptPassword(password);
		
		Usuario usuario = new Usuario(email, passwordCifrada);
		
		if(usuarioDAO.insert(usuario)) {
			System.out.println("Registro correcto, de vuelta al menu");
			propiedades.registerAccess(email);
		} else {
			System.out.println("Registro incorrecto, pruebe otra vez");
		}
		homeView.menuInicial();
		
	}
	
}
