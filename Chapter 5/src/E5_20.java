import java.util.Scanner;

public class E5_20 {

	public static void main(String[] args) {
		double largestNum = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter three numbers: ");
		double num1 = in.nextDouble();
		double num2 = in.nextDouble();
		double num3 = in.nextDouble();
		
		if(num1 > num2 && num1 > num3)
			largestNum = num1;
		else if(num2 > num1 && num2 > num3)
			largestNum = num2;
		else if(num3 > num2 && num3 > num2)
			largestNum = num3;
		else
			System.exit(0);
		System.out.print("The largest number is " + largestNum + ".");
	}
}
