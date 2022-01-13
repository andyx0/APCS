public class Appointment {
	
	private String description;
	private int year, month, day;

	public Appointment(String des, int y, int m, int d)
	{
		description = des;
		year = y;
		month = m;
		day = d;
	}
	
	public int getDay() {
		return day;
	}

	public boolean occursOn(int y, int m, int d)
	{
		return (year == y && month == m && day == d);
	}
	
	public String toString() {
		return description;
	}
}