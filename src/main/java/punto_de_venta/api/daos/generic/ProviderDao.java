package punto_de_venta.api.daos.generic;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import punto_de_venta.api.entities.generic.Provider;

@Repository
public interface ProviderDao extends JpaRepository<Provider, Long>{

	@Query("SELECT provider FROM Provider provider WHERE provider.id = :id")
	public Provider getById(@PathVariable Long id);
	
}
