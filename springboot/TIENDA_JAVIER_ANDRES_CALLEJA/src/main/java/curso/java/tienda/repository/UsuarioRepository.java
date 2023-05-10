package curso.java.tienda.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import curso.java.tienda.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

	List<Usuario> findAll();
	Usuario getById(int id);
	Usuario save(Usuario usuario);
	Usuario getByNombre(String nombre);
	
}
