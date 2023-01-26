package punto_de_venta.api.services.generic;


import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import punto_de_venta.api.daos.generic.CategoryDao;
import punto_de_venta.api.entities.generic.Category;
import punto_de_venta.api.exceptions.generic.CategoryException;
import punto_de_venta.api.interfaces.generic.services.ICategoryService;

@Service
public class CategoryService implements ICategoryService<Category> {
	
	Logger logger = LogManager.getLogger(CategoryService.class);

	@Autowired
	CategoryDao categoryDao;

	@Override
	public List<Category> getAll() throws CategoryException{
		List<Category> categories;
		try {
			categories = this.categoryDao.findAll();
			logger.info("Sin error al obtener categorias");
		}catch(Exception e) {
			logger.error("Error");
			return null;
		}
			
			return categories;
	}

	@Override
	public Category getById(Long id) {
		Category category = this.categoryDao.getById(id);
		return category;
	}

	@Override
	public Category createOrUpdate(Category entity) {
		Category category = this.categoryDao.save(entity);
		return category;
	}

	@Override
	public Category deleteById(Long id) {
		Category category = this.getById(id);
		this.categoryDao.deleteById(id);
		return category;
	}

}
