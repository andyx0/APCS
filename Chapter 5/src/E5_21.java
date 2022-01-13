import java.util.Scanner;

public class E5_21 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter three strings: ");
		String string1 = in.next();
		String string2 = in.next();
		String string3 = in.next();
		
		if(string1.compareToIgnoreCase(string2) < 0 && string1.compareToIgnoreCase(string3) < 0) {
			System.out.println(string1);
			if(string2.compareToIgnoreCase(string3) < 0) {
				System.out.println(string2);
				System.out.print(string3);
			} else if(string3.compareToIgnoreCase(string2) < 0) {
				System.out.println(string3);
				System.out.print(string2);
			}
		} else if(string2.compareToIgnoreCase(string1) < 0 && string2.compareToIgnoreCase(string3) < 0) {
			System.out.println(string2);
			if(string1.compareToIgnoreCase(string3) < 0) {
				System.out.println(string1);
				System.out.print(string3);
			} else if(string3.compareToIgnoreCase(string1) < 0) {
				System.out.println(string3);
				System.out.print(string1);
			}
		} else if(string3.compareToIgnoreCase(string1) < 0 && string3.compareToIgnoreCase(string2) < 0) {
			System.out.println(string3);
			if(string1.compareToIgnoreCase(string2) < 0) {
				System.out.println(string1);
				System.out.print(string2);
			} else if(string2.compareToIgnoreCase(string1) < 0) {
				System.out.println(string2);
				System.out.print(string1);
			}
		}
	}
}
