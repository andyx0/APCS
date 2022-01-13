import java.util.Scanner;

public class Arr2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int[] array = new int[10];
		
		System.out.print("Enter 10 values: ");
		for(int i = 0; i < array.length; i++) {
			array[i] = in.nextInt();
		}
		
		for(int x: array) {
			System.out.print(x + " ");
		}
	}
}
