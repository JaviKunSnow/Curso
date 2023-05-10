package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.VO.ProductVO;

@Repository
public interface ProductRepository extends JpaRepository<ProductVO, Long> {

}
