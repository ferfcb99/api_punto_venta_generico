package punto_de_venta.api.exceptions.generic;

public class CategoryException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public CategoryException(String message) {
		super(message);
	}
	
	
	public CategoryException() { 
		super();
	}

}
