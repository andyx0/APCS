import java.util.Scanner;

public class P4_7 {

	public static void main(String[] args) {
		String phoneNum, numBegin, numMiddle, numEnd;
    	
    	Scanner in = new Scanner(System.in);
		System.out.print("Enter a ten digit phone number: ");
		phoneNum = in.next();
		numBegin = "(" + phoneNum.substring(0,3) + ") ";
		numMiddle = phoneNum.substring(3,7);
		numEnd = "-" + phoneNum.substring(7,10);
		System.out.print(numBegin + numMiddle + numEnd);
	}
}
