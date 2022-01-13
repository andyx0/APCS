import java.util.Scanner;

public class P4_10 {

	public static void main(String[] args) {
		double principal, rate, interest;
    	
    	Scanner in = new Scanner(System.in);
    	System.out.print("Initial balance: $");
		principal = in.nextDouble();
		System.out.print("Annual interest rate in percent: ");
		rate = in.nextDouble()/100;
		interest = principal * rate/12;
		System.out.printf("After first month: $%.2f", (principal + interest));
		System.out.printf("\nAfter second month: $%.2f", ((principal + interest) * rate/12 + principal + interest));
		System.out.printf("\nAfter third month: $%.2f", (((principal + interest) * rate/12 + principal + interest) * rate/12 + ((principal + interest) * rate/12+principal + interest)));
	}
}
