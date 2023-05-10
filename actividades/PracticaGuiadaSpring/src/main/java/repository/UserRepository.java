package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.VO.UsuarioVO;

@Repository
public interface UserRepository extends JpaRepository<UsuarioVO, Long>{
	
	UsuarioVO findByEmail(String email);
	
	// agregar otros métodos de consulta si es necesario
	
}
