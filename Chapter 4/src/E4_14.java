import java.util.Scanner;

public class E4_14 {

	public static void main(String[] args) {
		String numberWithoutComma;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number between 1000 and 999999: ");
		numberWithoutComma = in.next();
		String numBegin = numberWithoutComma.substring(0,numberWithoutComma.length()-3);
	    String numEnd = numberWithoutComma.substring(numberWithoutComma.length()-3);
	    System.out.print(numBegin + "," + numEnd);
	}
}
