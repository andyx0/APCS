import java.util.Scanner;

public class a {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter integers: ");
		int num = in.nextInt(), largestNum = num, smallestNum = num;
		
		while(in.hasNextInt()) {
			num = in.nextInt();
			if(num > largestNum)
				largestNum = num;
			else if(num < smallestNum)
				smallestNum = num;
		}

		System.out.print("The smallest number is " + smallestNum + " and the largest number is " + largestNum);
	}
}
