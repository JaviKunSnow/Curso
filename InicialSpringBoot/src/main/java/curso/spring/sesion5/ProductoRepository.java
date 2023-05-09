package curso.spring.sesion5;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {

	Producto findById(int id);
	Producto findByNombre(String nombre);
	
//	boolean existsByNombre(String nombre);
//	
//    //JPQL (inspirado en SQL y HQL)
//    @Query("select p from Producto p where p.nombre like %?1% and ... ?2")
//    List<Producto> buscarFiltro(String cadena, String cadena2);
//    
//    @Query(value="select * from Producto where nombre like '%?1%'", nativeQuery=true)
//    List<Producto> buscarFiltroNativa(String cadena);
}
