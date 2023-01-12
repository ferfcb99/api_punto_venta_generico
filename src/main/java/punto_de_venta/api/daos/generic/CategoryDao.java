package punto_de_venta.api.daos.generic;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import punto_de_venta.api.entities.generic.Category;

@Repository
public interface CategoryDao extends JpaRepository<Category, Long>{
	
	@Query("SELECT category FROM Category category WHERE id = :id")
	public Category getById(@PathVariable Long id);

}
