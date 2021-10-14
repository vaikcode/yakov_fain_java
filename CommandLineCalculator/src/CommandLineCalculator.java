/**
 * @author vaikcode
 *
 */

import java.util.Scanner;


public class CommandLineCalculator {

	public static void main(String[] args) {

		float numberOne;
		float numberTwo;
		float resultCalc;

	    Scanner scanner = new Scanner(System.in);

		System.out.println("Command-line calculator");
		System.out.println();
		
	    System.out.print("Enter first number:  ");
	    numberOne = scanner.nextFloat();
	    System.out.print("Enter second number: ");
	    numberTwo = scanner.nextFloat();
		System.out.println();

		//numberOne = 300;
		//numberTwo = 17;
		
		resultCalc = numberOne + numberTwo;
		System.out.println("Add result:       " + numberOne + "+" + numberTwo + "=" + resultCalc);
		
		resultCalc = numberOne - numberTwo;
		System.out.println("Substract result: " + numberOne + "-" + numberTwo + "=" + resultCalc);
		
		resultCalc = numberOne * numberTwo;
		System.out.println("Multiply result:  " + numberOne + "*" + numberTwo + "=" + resultCalc);

		resultCalc = numberOne / numberTwo;
		System.out.println("Divide result:    " + numberOne + "/" + numberTwo + "=" + resultCalc);
		
	}
}
