import java.util.Scanner;

public class E5_14 {
	
	int hour;
	int minute;
	String time;

	public E5_14(int hour, int minute) {
		this.hour = hour;
		this.minute = minute;
		this.time = hour + ":" + minute;
		if (minute == 0)
			this.time = this.time + "0";
	}


	public int compareTo(E5_14 other) {
		int result = this.time.compareTo(other.time);
		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("To compare two times in military format (24 hr), first enter " + "the hour of the first time: ");
		int hour1 = in.nextInt();
		System.out.print("Enter the minutes of the first time: ");
		int minute1 = in.nextInt();

		E5_14 time1 = new E5_14(hour1, minute1);

		System.out.print("Now enter the hour of the second time: ");
		int hour2 = in.nextInt();
		System.out.print("Enter the minutes of the second time: ");
		int minute2 = in.nextInt();

		E5_14 time2 = new E5_14(hour2, minute2);

		int result = time1.compareTo(time2);

		if (result == -1)
			System.out.println(time1.time + " comes first.");
		else if (result == 0)
			System.out.println("Both times are the same.");
		else
			System.out.println(time2.time + " comes first.");
	}
}
