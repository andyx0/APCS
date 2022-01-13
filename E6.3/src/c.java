import java.util.Scanner;

public class c {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter integers: ");
		int num, sum = 0;
		
		while(in.hasNextInt()) {
			num = in.nextInt();
			sum += num;
			System.out.print(sum + " ");
		}
	}
}
