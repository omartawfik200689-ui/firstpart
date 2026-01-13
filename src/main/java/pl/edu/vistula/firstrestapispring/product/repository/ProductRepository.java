package pl.edu.vistula.firstrestapispring.product.repository;

import pl.edu.vistula.firstrestapispring.product.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
