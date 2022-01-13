import java.util.Scanner;
 
public class P4_6 {
    
    public static void main(String[] args) {
    	int numBooks;
    	double totalBookPrice, tax, shippingCharge, orderPrice;
    	
    	Scanner in = new Scanner(System.in);
		System.out.print("Enter the total book price: $");
		totalBookPrice = in.nextDouble();
		System.out.print("Enter the number of books: ");
		numBooks = in.nextInt();
		tax = 0.075 * totalBookPrice;
		shippingCharge = numBooks * 2;
		orderPrice = totalBookPrice + tax + shippingCharge;
    	System.out.print("Order Price: $" + orderPrice);
    }
}
