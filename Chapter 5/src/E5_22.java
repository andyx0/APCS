import java.util.Scanner;

public class E5_22 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter two floating-point numbers: ");
		double num1 = in.nextDouble();
		double num2 = in.nextDouble();
		
		if(Math.round(num1*100)/100 == Math.round(num2*100)/100)
			System.out.print("They are the same up to two decimal places.");
		else
			System.out.print("They are different.");
	}
}
