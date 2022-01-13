import java.util.*;

public class P7_7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int[][] seatingChart = {
				{10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
				{10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
				{10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
				{10, 10, 20, 20, 20, 20, 20, 20, 10, 10},
				{10, 10, 20, 20, 20, 20, 20, 20, 10, 10},
				{10, 10, 20, 20, 20, 20, 20, 20, 10, 10},
				{20, 20, 30, 30, 40, 40, 30, 30, 20, 20},
				{20, 30, 30, 40, 50, 50, 40, 30, 30, 20},
				{30, 40, 50, 50, 50, 50, 50, 50, 40, 30}
		};
		int num1,num2;
		System.out.print("Pick a seat or price: ");
		num1 = in.nextInt();
		if(in.hasNextInt()) {
			num2 = in.nextInt();
			if(seatingChart[num1][num2] == 0) {
				System.out.println("That seat is takem!");
			} else {
				System.out.println("Your seat has been chosen!");
				seatingChart[num1][num2] = 0;
			}
		} else {
			for(int i = 0; i < seatingChart.length; i++) {
				for(int x = 0; x < seatingChart[i].length; x++) {
					if(seatingChart[i][x] == num1) {
						System.out.println("[" + i + "][" + x + "]");
					}
				}
			}
		}
		for(int z = 1; z < 90; z++) {
			System.out.print("Pick a seat or price: ");
			in.nextLine();
			num1 = in.nextInt();
			if(in.hasNextInt()) {
				num2 = in.nextInt();
				if(seatingChart[num1][num2] == 0) {
					System.out.println("That seat is taken!");
				} else {
					System.out.println("Your seat has been chosen!");
					seatingChart[num1][num2] = 0;
				}
			} else {
				for(int i = 0; i < seatingChart.length; i++) {
					for(int x = 0; x < seatingChart[i].length; x++) {
						if(seatingChart[i][x] == num1) {
							System.out.println("[" + i + "][" + x + "]");
						}
					}
				}
			}
		}
	}
}
