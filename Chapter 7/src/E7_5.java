import java.util.Scanner;

public class E7_5 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int[] arr = new int[1000];
		int sum = 0;
		
		System.out.print("Enter integers: ");
		for(int i = 0; in.hasNextInt(); i++) {
			arr[i] = in.nextInt();
		}
		
		for(int x = 0; x < arr.length; x++) {
			if(x % 2 == 0) {
				sum += arr[x];
			} else {
				sum -= arr[x];
			}
		}
		
		System.out.print(sum);
	}
}
