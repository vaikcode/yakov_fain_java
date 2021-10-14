/**
 * @author vaikcode
 *
 */

public class ReportCard {

	public char convertGrades (int testResult) {
		
		char grade;
		
		if (testResult >= 90) {
			grade = 'A';
		} else if (testResult < 90 && testResult >= 80) {
			grade = 'B';
		} else if (testResult < 80 && testResult >= 70) {
			grade = 'C';
		} else {
			grade = 'D';	
		}
		
		return grade;
	}
		
	public static void main(String[] args) {

		ReportCard rc = new ReportCard();
		char yourGrade = rc.convertGrades(88);
		
		System.out.println("Your first grade: " + yourGrade);
		yourGrade = rc.convertGrades(79);
		System.out.println("Your second grade: " + yourGrade);
		System.out.println();
		

		/* Operator Switch use:
		 * 	   char
		 *     int
		 *     byte
		 *     short
		 *     enum
		 *     String (Java 1.7)
		 */
		switch (yourGrade) {
		
			case 'A':
				System.out.println("Your grade: " + yourGrade);
				System.out.println("Excellent job!");
				break;
				
			case 'B':
				System.out.println("Your grade: " + yourGrade);
				System.out.println("Good job!");
				break;

			case 'C':
				System.out.println("Your grade: " + yourGrade);
				System.out.println("Poor job!");
				break;
				
			case 'D':
				System.out.println("Your grade: " + yourGrade);
				System.out.println("Very bad job!");
				break;	
		}
	}
}
