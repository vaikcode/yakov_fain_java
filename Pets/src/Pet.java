/**
 * @author vaikcode
 *
 */

public class Pet {
	int age;
	float weight;
	float height;
	String color;
	
	public void sleep () {
		System.out.println("Good hight! See you tomorrow!");
	}
	
	public void eat () {
		System.out.println("I'm soo hungry... Let me have a shack like nachos!");
	}
	
	public String say (String aWord) {
		String petResponse = "OK!! OK!! " + aWord;
		return petResponse;
	}
}
