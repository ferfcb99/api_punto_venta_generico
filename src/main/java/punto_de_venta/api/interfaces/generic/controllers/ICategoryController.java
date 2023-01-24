package punto_de_venta.api.interfaces.generic.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;

import punto_de_venta.api.dto.Response;
import punto_de_venta.api.exceptions.generic.CategoryException;

public interface ICategoryController<T> {

    public ResponseEntity<Response<List<T>>> getAll() throws CategoryException;

    public ResponseEntity<Response<T>> getById(Long id);

    public ResponseEntity<Response<T>> createOrUpdate(T entity);

    public ResponseEntity<Response<T>> deleteById(Long id);
    
}
