package punto_de_venta.api.programability.generic;

import java.util.UUID;

public class GenericMethods {

	public String getUUID() {
		UUID uniqueCode = UUID.randomUUID();
		String uniqueCodeString = String.valueOf(uniqueCode);
		return uniqueCodeString;
	}
	
	public static void main(String[] args) {
		GenericMethods genericMethods = new GenericMethods();
		System.out.println(genericMethods.getUUID());
	}
	
}
