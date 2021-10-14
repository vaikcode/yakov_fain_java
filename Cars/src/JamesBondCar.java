/**
 * @author vaikcode
 *
 */


public class JamesBondCar extends Car{
	
	public void start() {
		System.out.println("Start the busted engine!");
	}
	
	public void stop() {
		System.out.println("Stop the busted engine!");		
	}

	public int drive(int howLong) {
		
		distance = howLong * 180;

		System.out.println("Come on super drive!");		
		
		return distance;
	}	
}
