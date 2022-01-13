import java.util.Scanner;

public class E5_1 {

	public static void main(String[] args) {
		int num;
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		num = in.nextInt();
		if(num < 0)
			System.out.print("Negative");
		else if(num > 0)
			System.out.print("Positive");
		else
			System.out.print("Zero");
	}
}
