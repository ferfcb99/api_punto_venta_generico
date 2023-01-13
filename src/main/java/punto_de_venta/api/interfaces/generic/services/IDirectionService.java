package punto_de_venta.api.interfaces.generic.services;

import java.util.List;

public interface IDirectionService<T> {
    
	public List<T> getAll();
	
	public T getById(Long id);
	
	public T createOrUpdate(T entity);
	
	public T deleteById(Long id);
	
}
