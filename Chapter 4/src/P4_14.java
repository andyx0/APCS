import java.util.Scanner;

public class P4_14 {

	public static void main(String[] args) {
		int resistance;
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the thermistor resistance: ");
		resistance = in.nextInt();
		double T = (3969 * 85 / (85 * Math.log(resistance/1075) + 3969) - 273);
		System.out.printf("The liquid temperature is %.2f degrees celsius",T);
	}
}
