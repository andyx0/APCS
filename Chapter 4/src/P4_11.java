import java.util.Scanner;

public class P4_11 {

	public static void main(String[] args) {
		int rentals, referrals;
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of movie rentals: ");
		rentals = in.nextInt();
		System.out.print("Enter the number of referrals: ");
		referrals = in.nextInt();
		System.out.print("The discount is equal to: " + Math.min(rentals + referrals,75) + " percent");
	}
}
