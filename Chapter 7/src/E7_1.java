import java.util.Scanner;

public class E7_1 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int[] array = new int[10];

		System.out.print("Enter 10 integers: ");
		for(int i = 0; i < array.length; i++) {
			array[i] = in.nextInt();
		}

		System.out.print("Even index elements: ");
		for(int i = 0; i < array.length; i+=2) {
			System.out.print(array[i] + " ");
		}
		
		System.out.print("\nEven elements: ");
		for(int i: array) {
			if(i % 2 == 0) {
				System.out.print(array[i] + " ");
			}
		}

		System.out.print("\nElements in reverse: ");
		for(int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}

		System.out.print("\nFirst and last element: ");
		System.out.print(array[0] + " " + array[array.length-1]);
	}
}
