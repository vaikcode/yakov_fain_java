/**
 * @author vaikcode
 *
 */

public class IfElse {

	public static void main(String[] args) {

		int price = 150;
		String state = "Texas";
		
		// Logical OR
		// One bar | - If the first expression is true, the second expression won't even be checked
		if (state.equals("Texas")|state.equals("California")) {
			System.out.println("1. One of two states is Texas");
		}
		
		// Two bars || - JVM evaluate both expressions
		if (state.equals("Texas")||state.equals("California")) {
			System.out.println("2. One of two states is Texas or California");			
		}
		
		// Logical AND - ampersand
		state = "New York";
		if (state.equals("New York") && price > 110) {
			System.out.println("3. The state is New York and price > 110");
		}
		
		// Logical NOT
		if (!state.equals("Florida")) {
			System.out.println("4. The state is not Florida");
		}

		if (price < 50) {
			System.out.println("5. The price is below 50");
		}

		if (!(price < 50)) {
			System.out.println("6. The price is not below 50");
		}
	}
}
