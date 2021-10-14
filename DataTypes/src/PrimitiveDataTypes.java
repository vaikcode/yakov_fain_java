/**
 * @author vaikcode
 *
 */

public class PrimitiveDataTypes {

	// Variable declaration	
	byte myByte = 6; // Occupies one byte in memory
	short myShort = 28; // Occupies two bytes in memory
	int myInt = 7791; // Occupies four bytes in memory
	long myLong = 7791l; // Occupies eight bytes in memory
	
	float myFloat = 7791.99f; // Occupies four bytes in memory
	double myDouble = 77917791.99; // Occupies eight bytes in memory
	
	char myChar = 'V'; // Occupies two bytes in memory
	
	boolean isMyTrue = true;

	final double PI = 3.14; // Final variable (constant)
	
	public static void main(String[] args) {

		PrimitiveDataTypes primitiveDataTypes = new PrimitiveDataTypes();

		System.out.println("myByte = " + primitiveDataTypes.myByte);
		System.out.println("myShort = " + primitiveDataTypes.myShort);
		System.out.println("myInt = " + primitiveDataTypes.myInt);
		System.out.println("myLong = " + primitiveDataTypes.myLong);
		System.out.println();
		System.out.println("myFloat = " + primitiveDataTypes.myFloat);
		System.out.println("myDouble = " + primitiveDataTypes.myDouble);
		System.out.println();
		System.out.println("myChar = " + primitiveDataTypes.myChar);
		System.out.println();
		System.out.println("isMyTrue = " + primitiveDataTypes.isMyTrue);
		System.out.println();
		System.out.println("PI = " + primitiveDataTypes.PI);
	}
}
