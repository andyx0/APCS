import java.util.Scanner;

public class E5_3 {

	public static void main(String[] args) {
		int num,i = 1;
		
		Scanner idk = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		num = idk.nextInt();
		if(num < 0)
			num *= -1;
		while(num >= 10) {
			num/=10;
			i++;
		}

		System.out.print("There are " + i + " digits");
	}
}
