import java.util.Scanner;

public class E5_16 {

	public static double getNumericGrade(String grade) {
		
		double numGrade = 0;
		String letter = grade.substring(0,1);
		if(letter.equalsIgnoreCase("A"))
			numGrade = 4;
		else if(letter.equalsIgnoreCase("B"))
			numGrade = 3;
		else if(letter.equalsIgnoreCase("C"))
			numGrade = 2;
		else if(letter.equalsIgnoreCase("D"))
			numGrade = 1;
		
		if(numGrade < 4.0) {
		String suffix = grade.substring(1);
		if(suffix.equals("+"))
			numGrade += 0.3;
		else if(suffix.equals("-"))
			numGrade -= 0.3;
		}
		return numGrade;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a letter grade: ");
		String grade = in.next();

		double numGrade = getNumericGrade(grade);
		System.out.print("The numeric value is " + numGrade);
	}
}
