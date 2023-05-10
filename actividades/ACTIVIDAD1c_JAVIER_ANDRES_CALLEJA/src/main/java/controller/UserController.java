package controller;

import java.util.HashMap;

import dao.UsuarioDAO;
import model.Usuario;
import view.HomeView;
import view.UserView;

public class UserController {

	UsuarioDAO usuarioDAO = new UsuarioDAO();
	UserView userView = new UserView();
	HomeView homeView = new HomeView();
	
	public void devolverUsuarios() {
		
		HashMap<Integer, Usuario> usuarios = usuarioDAO.get();
		
		userView.mostrarUsuarios(usuarios);
		
	}
	
	public void VolverHome() {
		homeView.menuInicial();
	}
	
}
