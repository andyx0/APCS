import java.util.Scanner;

public class c {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = in.next();
		int numVowels = 0;
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') {
				numVowels++;  
			}
		}
		System.out.print("There are " + numVowels + " vowels.");
	}
}
