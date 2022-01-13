import java.util.Scanner;

public class P5_2 {

	public static void main(String[] args) {
		double incomeTax;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter your income: ");
		double income = in.nextDouble();
		
		if(income >= 50000) {
			incomeTax = 50000*0.01;
			
			if(income >= 75000) {
				incomeTax += 25000*0.02;
				
				if(income >= 100000) {
					incomeTax += 25000*0.03;
					
					if(income >= 250000) {
						incomeTax += 150000*0.04;
						
						if(income >= 500000) {
							incomeTax += 250000*0.05;
							incomeTax += (income - 500000)*0.06;
						}
						else
							incomeTax += (income - 250000)*0.05;
					}
					else
						incomeTax += (income - 100000)*0.04;
				}
				else
					incomeTax += (income - 75000)*0.03;
			}
			else
				incomeTax += (income - 50000)*0.02;
		}
		else
			incomeTax = income*0.01;
		
		System.out.print("Your income tax is $" + incomeTax);
	}
}
