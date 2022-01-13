import java.util.Scanner;

public class E5_2 {

	public static void main(String[] args) {
		double num;
		
		Scanner idk = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		num = idk.nextDouble();
		if(num == 0)
			System.out.print("Zero");
		else {
			if(num > 0)
				System.out.println("Positive");
			else
				System.out.println("Negative");
			if(Math.abs(num) < 1)
				System.out.print("Small");
			else if(Math.abs(num) > 1000000)
				System.out.print("Large");
		}
	}
}
