package punto_de_venta.api.controllers.generic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import punto_de_venta.api.dto.Response;
import punto_de_venta.api.entities.generic.Direction;
import punto_de_venta.api.interfaces.generic.controllers.IDirectionController;
import punto_de_venta.api.publics.generic.Constants;
import punto_de_venta.api.services.generic.DirectionService;

@RestController
@RequestMapping(path = "/api/v1/directions")
@CrossOrigin(origins = { "*" })
public class DirectionController implements IDirectionController<Direction> {


	@Autowired
	DirectionService directionService;

	@Override
	@RequestMapping(method = RequestMethod.GET, value = "/getAll", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<Response<List<Direction>>> getAll() {
		return ResponseEntity.ok(new Response<>(String.valueOf(HttpStatus.OK), this.directionService.getAll(),
				Constants.GET_DATA_SUCCESSFULLY));
	}

	@Override
	@RequestMapping(method = RequestMethod.GET, value = "/getById/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<Response<Direction>> getById(@PathVariable Long id) {
		return ResponseEntity.ok(new Response<>(String.valueOf(HttpStatus.OK), this.directionService.getById(id),
				Constants.GET_DATA_SUCCESSFULLY));
	}

	@Override
	@RequestMapping(method = RequestMethod.POST, value = "/createOrUpdate", consumes = MediaType.APPLICATION_JSON_VALUE ,produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<Response<Direction>> createOrUpdate(@RequestBody Direction entity) {
		return ResponseEntity.ok(new Response<>(String.valueOf(HttpStatus.OK), this.directionService.createOrUpdate(entity),
				Constants.CREATE_DATA_SUCCESSFULLY));
	}

	@Override
	@RequestMapping(method = RequestMethod.DELETE, value = "/deleteById/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<Response<Direction>> deleteById(@PathVariable Long id) {
		return ResponseEntity.ok(new Response<>(String.valueOf(HttpStatus.OK), this.directionService.deleteById(id),
				Constants.DELETE_DATA_SUCCESSFULLY));
	}

}
