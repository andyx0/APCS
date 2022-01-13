public class Daily extends Appointment {
	
	public Daily(String des, int y, int m, int d) {
		super(des, y, m, d);
	}
	
	@Override
	public boolean occursOn(int y, int m, int d)
	{
		return true;
	}
}