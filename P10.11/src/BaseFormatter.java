public class BaseFormatter implements NumberFormatter {

	private int base;

	public BaseFormatter(int n) {
		base = n;
	}

	@Override
	public String format(int n) {
		return Integer.toString(Integer.parseInt(Integer.toString(n), 10), base);
	}
}