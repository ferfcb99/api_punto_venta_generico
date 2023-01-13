package punto_de_venta.api.daos.generic;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import punto_de_venta.api.entities.generic.Product;

@Repository
public interface ProductDao extends JpaRepository<Product, Long>{
	
	@Query("SELECT product FROM Product product WHERE product.id = :id")
	public Product getById(@PathVariable Long id);

}
