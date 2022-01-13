import java.util.Scanner;

public class b {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = in.next();
		
		for(int i = 1; i < str.length(); i+=2) {
			System.out.print(str.charAt(i));
		}
	}
}
