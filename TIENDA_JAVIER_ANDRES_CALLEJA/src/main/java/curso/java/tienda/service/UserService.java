package curso.java.tienda.service;

import java.util.List;

import curso.java.tienda.dao.UsuarioDAO;
import curso.java.tienda.model.Usuario;

public class UserService {

	private UsuarioDAO usuarioDAO;
	
	public UserService() {
		usuarioDAO = new UsuarioDAO();
	}
	
	public boolean insertUser(String clave, String email, String nombre, String apellidos) {
		return usuarioDAO.insert(clave, email, nombre, apellidos);
	}
	
	public List<Usuario> getAll() {
		return usuarioDAO.getAll();
	}
	
	public Usuario get(int id) {
		return usuarioDAO.get(id);
	}
	
	public void update(Usuario usuario) {
		usuarioDAO.update(usuario);
	}
	
	public void delete(int id) {
		usuarioDAO.delete(id);
	}
	
	public Usuario login(String nombre, String clave) {
		return usuarioDAO.validarUsuario(nombre, clave);
	}
}
