package punto_de_venta.api.services.generic;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import punto_de_venta.api.daos.generic.DirectionDao;
import punto_de_venta.api.entities.generic.Direction;
import punto_de_venta.api.interfaces.generic.services.IDirectionService;

@Service
public class DirectionService implements IDirectionService<Direction> {

	@Autowired
	DirectionDao directionDao;

	@Override
	public List<Direction> getAll() {
		List<Direction> directions = this.directionDao.findAll();
		return directions;
	}

	@Override
	public Direction getById(Long id) {
		Direction direction = this.directionDao.getById(id);
		return direction;
	}

	@Override
	public Direction createOrUpdate(Direction entity) {
		Direction direction = this.directionDao.save(entity);
		return direction;
	}

	@Override
	public Direction deleteById(Long id) {
		Direction direction = this.getById(id);
		this.directionDao.deleteById(id);
		return direction;
	}

}
