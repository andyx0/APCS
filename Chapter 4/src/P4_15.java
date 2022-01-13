import java.util.Scanner;

public class P4_15 {

	public static void main(String[] args) {
		int pf;
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the thermistor resistance: ");
		pf = in.nextInt();
		
		double srcVoltage = Math.sqrt(Math.pow(120 + 2*10*260/120,2)+Math.pow(2*10*260/(pf*120),2)*(1-pf*pf));
		System.out.printf("The source voltage is %.2f Vrms", srcVoltage);
	}
}
