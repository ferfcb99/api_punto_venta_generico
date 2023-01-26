package punto_de_venta.api.exceptions.generic;

public class InternalException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public InternalException(String message) {
		super(message);
	}
	
	
	public InternalException() { 
		super();
	}


}
