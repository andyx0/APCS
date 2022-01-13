import java.util.Scanner;

public class P5_20 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the temperature in Fahrenheit: ");
		double tempK = (in.nextDouble() - 32) * 5/9 + 273;
		
		double R = 33192 * Math.pow(Math.E,3310*(1/tempK-1/313));
		double R1 = 156300/(R+156300);
		if(R1<1/2)
			System.out.print("The alarm will sound.");
		else
			System.out.print("The alarm will not sound.");
	}
}
