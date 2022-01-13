import java.util.*;

public class AppointmentTester {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Appointment[] arr = {new Daily("School",2019,2,24), new Monthly("Competition",2019,2,24)};
		
		System.out.print("Enter a date: ");
		int day = in.nextInt();
		int month = in.nextInt();
		int year = in.nextInt();
		in.close();
		
		System.out.print("Appointments today: ");
		for(Appointment i: arr) {
			if(i.occursOn(year, month, day)) {
				System.out.print(i + ", ");
			}
		}
	}
}