package punto_de_venta.api.daos.generic;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import punto_de_venta.api.entities.generic.Direction;

@Repository
public interface DirectionDao extends JpaRepository<Direction, Long>{
	
	@Query("SELECT direction FROM Direction direction WHERE direction.id = :id")
	public Direction getById(@PathVariable Long id);

}
