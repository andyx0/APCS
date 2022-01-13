import java.util.Scanner;

public class E5_17 {

	public static String getLetterGrade(double grade) {
		
		String letterGrade = null;
		int letter = (int) Math.round(grade);
		if(letter == 4)
			letterGrade = "A";
		else if(letter == 3)
			letterGrade = "B";
		else if(letter == 2)
			letterGrade = "C";
		else if(letter == 1)
			letterGrade = "D";
		else if(letter == 0)
			letterGrade = "F";
		
		if(grade >= letter + 0.15)
			letterGrade += "+";
		else if(grade < letter - 0.15)
			letterGrade += "-";
		
		return letterGrade;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a numeric grade: ");
		double grade = in.nextDouble();

		String letterGrade = getLetterGrade(grade);
		System.out.print("The letter grade is " + letterGrade);
	}
}
