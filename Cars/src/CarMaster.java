/**
 * @author vaikcode
 *
 */

public class CarMaster {

	public static void main(String[] args) {

		// Declare usual car
		Car usualCar = new Car();
		
		usualCar.start();
		System.out.println("Current distance " + usualCar.distance + " miles");		
		System.out.println("Current distance " + usualCar.drive(100) + " miles");
		usualCar.stop();
		System.out.println();
		
		// Declare James Bond car
		JamesBondCar superCar = new JamesBondCar();
		superCar.start();
		System.out.println("Current distance " + superCar.distance + " miles");		
		System.out.println("Current distance " + superCar.drive(100) + " miles");
		superCar.stop();
	}

}
