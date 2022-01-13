import java.util.Scanner;

public class a {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = in.next();
		
		for(int i = 0; i < str.length(); i++) {
			if(Character.isUpperCase(str.charAt(i)))
				System.out.print(str.charAt(i));
		}
	}
}
