package punto_de_venta.api.interfaces.generic.services;

import java.util.List;

import punto_de_venta.api.exceptions.generic.CategoryException;

public interface ICategoryService<T> {
	
	public List<T> getAll() throws CategoryException;
	
	public T getById(Long id);
	
	public T createOrUpdate(T entity);
	
	public T deleteById(Long id);
	
}


