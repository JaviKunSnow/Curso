package curso.java.tienda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import curso.java.tienda.model.Usuario;
import curso.java.tienda.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usrRepo;
	
	public List<Usuario> findAll() {
		return usrRepo.findAll();
	}
	
	public Usuario getById(int id) {
		return usrRepo.getById(id);
	}
	
	public Usuario save(Usuario usuario) {
		return usrRepo.save(usuario);
	}
	
	public Usuario getByNombre(String nombre) {
		return usrRepo.getByNombre(nombre);
	}
	
}
