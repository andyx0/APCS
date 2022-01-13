import java.util.*;

public class Arr4 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int[] count = new int[51];
		
		System.out.print("Enter integers: ");
		while(in.hasNextInt()) {
			count[in.nextInt()]++;
		}
		
		for(int i = 0; i < count.length; i++) {
			System.out.println(i + ": " + count[i]);
		}
	}
}
