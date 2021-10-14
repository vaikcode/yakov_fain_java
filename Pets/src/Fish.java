/**
 * @author vaikcode
 *
 */

public class Fish extends Pet{

	int currentDepth = 0;

	/*
	 * Example for keyword THIS
	 *
	 * Fish (int currentDepth) {
	 * 
	 * 	   this.currentDepth = currentDepth;
	 * }
	 * 
	 */
	
	Fish (int startingPosition) {
		
		currentDepth = startingPosition;
	}
	
	public int dive (int howDeep) {
		
		System.out.println("Current depth is " + currentDepth + " feet");
		
		currentDepth = currentDepth + howDeep;
		
		if (currentDepth > 100) {
			System.out.println("Trying to dive for " + howDeep + " feet...");
			System.out.println("Oh! I am a little fish and can't dive below 100 feet");
			
			currentDepth = currentDepth - howDeep;
		} else {
			System.out.println("Diving for " + howDeep + " feet...");
			System.out.println("OK! I'm at " + currentDepth + " feet below sea level");
			System.out.println();
		}
		return currentDepth;
	}
	
	public String say (String aWord) {
		
		return "Don't you know that fish do not talk?";
	}
}
