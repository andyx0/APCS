public class AccountingFormatter implements NumberFormatter {

	public AccountingFormatter() {

	}

	@Override
	public String format(int n) {
		String str = Integer.toString(n);
		if(str.charAt(0) == '-') {
			str = str.replace('-', '(') + ')';
		}
		return str;
	}
}