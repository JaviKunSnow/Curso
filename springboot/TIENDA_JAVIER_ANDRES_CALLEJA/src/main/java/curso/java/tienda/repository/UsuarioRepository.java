package curso.java.tienda.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import curso.java.tienda.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

	
	
}
