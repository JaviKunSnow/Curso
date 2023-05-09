package curso.java.tienda.service;

import org.springframework.beans.factory.annotation.Autowired;

import curso.java.tienda.repository.UsuarioRepository;

public class UsuarioService {

	@Autowired
	private UsuarioRepository urepo;
	
}
