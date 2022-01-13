import java.util.Scanner;

public class d {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter integers: ");
		int num1, num2, lastPrinted = 0;
		num1 = in.nextInt();
		
		
		while(in.hasNextInt()) {
			num2 = in.nextInt();
			if(num2 == num1 && num2 != lastPrinted) {
				System.out.print(num2 + " ");
				lastPrinted = num2;
			}
			num1 = num2;
		}
	}
}
