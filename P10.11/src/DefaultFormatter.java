public class DefaultFormatter implements NumberFormatter {

	public DefaultFormatter() {

	}

	@Override
	public String format(int n) {
		return Integer.toString(n);
	}
}