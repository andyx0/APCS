import java.util.Scanner;

public class P5_12 {

	public static void main(String[] args) {
		String attempt,pw = "1234";
		Scanner in = new Scanner(System.in);
		
		for(int tries = 0;tries < 3;tries++) {
			System.out.print("Enter your PIN: ");
			attempt = in.next();
			if(attempt.equals(pw)) {
				System.out.print("Your PIN is correct");
				System.exit(0);
			} else {
				System.out.println("Your PIN is incorrect");
			}
		}
		System.out.print("Your bank card is blocked");
	}
}
