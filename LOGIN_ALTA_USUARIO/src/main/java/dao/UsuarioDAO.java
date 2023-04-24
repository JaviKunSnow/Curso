package dao;

import java.util.HashMap;
import java.util.Map.Entry;

import org.jasypt.util.password.StrongPasswordEncryptor;

import model.Usuario;

public class UsuarioDAO {

	static HashMap<Integer, Usuario> Usuarios = new HashMap<Integer, Usuario>();
	
	public boolean insert(Usuario usuario) {
		
		if(Usuarios.size() == 0) {
			Usuarios.put(1, usuario);
		} else {
			for(Entry<Integer, Usuario> entry : Usuarios.entrySet()) {
				if(entry.getValue().getEmail().equals(usuario.getEmail())) {
					return false;
				}
			}
			
			Usuarios.put(Usuarios.size() + 1, usuario);
		}
		
		return true;
		
	}
	
	public boolean findByEmailPassword(String email, String password) {
		StrongPasswordEncryptor encryptor = new StrongPasswordEncryptor();
		
		for(Entry<Integer, Usuario> entry : Usuarios.entrySet()) {
			if(entry.getValue().getEmail().equals(email)) {
				if(encryptor.checkPassword(password, entry.getValue().getPass())) {
					return true;
				}
			}
		}
		
		return false;
		
	}
	
	public HashMap<Integer, Usuario> get() {
		
		return Usuarios;
	}
	
	
}
