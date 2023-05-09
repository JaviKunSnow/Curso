package curso.java.tienda.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import curso.java.tienda.model.Detalle;

public interface DetalleRepository extends JpaRepository<Detalle, Integer>{

}
