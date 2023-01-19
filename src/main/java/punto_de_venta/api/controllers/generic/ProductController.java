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
import punto_de_venta.api.entities.generic.Product;
import punto_de_venta.api.interfaces.generic.controllers.IProductController;
import punto_de_venta.api.publics.generic.Constants;
import punto_de_venta.api.services.generic.ProductService;

@RestController
@RequestMapping(path = "/api/v1/products")
@CrossOrigin(origins = { "*" })
public class ProductController implements IProductController<Product> {


	@Autowired
	ProductService productService;

	@Override
	@RequestMapping(method = RequestMethod.GET, value = "/getAll", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<Response<List<Product>>> getAll() {
		return ResponseEntity.ok(new Response<>(String.valueOf(HttpStatus.OK), this.productService.getAll(),
				Constants.GET_DATA_SUCCESSFULLY));
	}

	@Override
	@RequestMapping(method = RequestMethod.GET, value = "/getById/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<Response<Product>> getById(@PathVariable Long id) {
		return ResponseEntity.ok(new Response<>(String.valueOf(HttpStatus.OK), this.productService.getById(id),
				Constants.GET_DATA_SUCCESSFULLY));
	}

	@Override
	@RequestMapping(method = RequestMethod.POST, value = "/createOrUpdate", consumes = MediaType.APPLICATION_JSON_VALUE ,produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<Response<Product>> createOrUpdate(@RequestBody Product entity) {
		return ResponseEntity.ok(new Response<>(String.valueOf(HttpStatus.OK), this.productService.createOrUpdate(entity),
				Constants.CREATE_DATA_SUCCESSFULLY));
	}

	@Override
	@RequestMapping(method = RequestMethod.DELETE, value = "/deleteById/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<Response<Product>> deleteById(@PathVariable Long id) {
		return ResponseEntity.ok(new Response<>(String.valueOf(HttpStatus.OK), this.productService.deleteById(id),
				Constants.DELETE_DATA_SUCCESSFULLY));
	}

}
