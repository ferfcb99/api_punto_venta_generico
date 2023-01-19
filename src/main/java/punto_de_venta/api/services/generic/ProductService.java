package punto_de_venta.api.services.generic;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import punto_de_venta.api.daos.generic.ProductDao;
import punto_de_venta.api.entities.generic.Product;
import punto_de_venta.api.interfaces.generic.services.IProductService;

@Service
public class ProductService implements IProductService<Product> {

	@Autowired
	ProductDao productDao;

	@Override
	public List<Product> getAll() {
		List<Product> products = this.productDao.findAll();
		return products;
	}

	@Override
	public Product getById(Long id) {
		Product product = this.productDao.getById(id);
		return product;
	}

	@Override
	public Product createOrUpdate(Product entity) {
		Product product = this.productDao.save(entity);
		return product;
	}

	@Override
	public Product deleteById(Long id) {
		Product product = this.getById(id);
		this.productDao.deleteById(id);
		return product;
	}

}
