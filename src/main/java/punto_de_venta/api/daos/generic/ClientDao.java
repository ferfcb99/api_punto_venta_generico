package punto_de_venta.api.daos.generic;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import punto_de_venta.api.entities.generic.Client;

@Repository
public interface ClientDao extends JpaRepository<Client, Long>{

	@Query("SELECT client FROM Client client WHERE client.id = :id")
	public Client getById(@PathVariable Long id);
	
}
