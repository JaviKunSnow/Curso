package view;

import java.util.HashMap;
import java.util.Map.Entry;

import model.Usuario;

public class UserView {

	public void mostrarUsuarios(HashMap <Integer, Usuario> usuarios) {
		
		System.out.println("USUARIOS");
		System.out.println("--------------");
		for(Entry<Integer, Usuario> entry : usuarios.entrySet()) {
			System.out.print(entry.getValue().getEmail() + " ");
			System.out.print(entry.getValue().getPass());
			System.out.println("");
		}
		System.out.println("---------------");
	}
	
}
