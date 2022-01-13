import java.util.Scanner;

public class b {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter integers: ");
		int num, numEven = 0, numOdd = 0;
		
		while(in.hasNextInt()) {
			num = in.nextInt();
			if(num % 2 == 0)
				numEven++;
			else
				numOdd++;
		}

		System.out.print("The number of even inputs is " + numEven + " and the number of odd inputs is " + numOdd);
	}
}
