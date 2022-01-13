import java.util.*;

public class MagicSquare {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int[][] arr = new int[4][4];
		boolean isMagicSquare = true;

		System.out.print("Enter integers: ");
		for(int i = 0; i < arr.length; i++) {
			for (int x = 0; x < arr[i].length; x++) {
				if(in.hasNextInt()) {
					arr[i][x] = in.nextInt();
				} else {
					isMagicSquare = false;
				}
			}
		}
		
		if(isMagicSquare) {
			int sum = 0;

			for (int col = 0; col < arr.length; col++) {
				sum += arr[0][col];
			}

			for (int row = 1; row < arr.length; row++) {
				int newSum = 0;

				for (int col = 0; col < arr[row].length; col++) {
					newSum += arr[row][col];
				}

				if (sum != newSum) {
					isMagicSquare = false;
				}
			}
		}
		
		if(isMagicSquare) {
			System.out.print("Your 16 integers form a magic square!");
		} else {
			System.out.print("Your integers do not form a magic square.");
		}
	}
}
