/**
 * @author vaikcode
 *
 */

public class Car {

	int distance = 0;
	
	public void start() {
		System.out.println("Start the engine!");
	}
	
	public void stop() {
		System.out.println("Stop the engine!");		
	}

	public int drive(int howLong) {
		
		distance = howLong * 60;

		System.out.println("Come on drive!");		
		
		return distance;
	}	
}
