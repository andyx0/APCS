import java.util.Scanner;

public class E4_13 {

	public static void main(String[] args) {
		String numberWithComma;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number between 1,000 and 999,999: ");
		numberWithComma = in.next();
		System.out.print(numberWithComma.replaceAll(",",""));
	}
}
