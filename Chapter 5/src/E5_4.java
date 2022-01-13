import java.util.Scanner;

public class E5_4 {

	public static void main(String[] args) {
		double num1,num2,num3;

		Scanner idk = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		num1 = idk.nextDouble();
		System.out.print("Enter a second integer: ");
		num2 = idk.nextDouble();
		System.out.print("Enter a third integer: ");
		num3 = idk.nextDouble();
		if(num1 == num2 && num2 == num3)
			System.out.print("All the same");
		else if(num1 != num2 && num2 != num3 && num1 != num3)
			System.out.print("All different");
		else
			System.out.print("Neither");
	}
}
