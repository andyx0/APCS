import java.util.Scanner;

public class e {

	public static void main(String[] args) {
		int num, sum = 0;
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number: ");
		num = in.nextInt();
		
		while (num > 0) {
			if(num % 2 == 1) {
				sum += num%10;
			}
			num/=10;
		}
		
		System.out.print("The sum of the odd digits is " + sum);
	}
}
