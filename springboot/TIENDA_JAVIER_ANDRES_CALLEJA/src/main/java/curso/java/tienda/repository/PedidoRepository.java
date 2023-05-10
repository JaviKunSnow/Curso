package curso.java.tienda.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import curso.java.tienda.model.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer>{

	List<Pedido> findAll();
	Pedido getById(int id);
	Pedido save(int id);
	long count();
	
	@Query(value="SELECT * FROM pedido ORDER BY id DESC LIMIT 10", nativeQuery = true)
	List<Pedido> getByLast();
	
}
