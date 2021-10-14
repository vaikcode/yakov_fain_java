/**
 * @author vaikcode
 *
 */

public class ConditionalOperator {

	public static void main(String[] args) {

		int price = 150;

		/* Conditional operator: int discount = price > 50? 10:5;
		 * Equals:
		 *     if (price > 50) {
		 *		   discount = 10
		 *     } else {
		 *		   discount = 5
		 *     }
		 */

		int discount = price > 50? 10:5;
		System.out.println("Discount = " + discount);												

	}
}
