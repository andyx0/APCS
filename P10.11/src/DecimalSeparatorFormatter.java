public class DecimalSeparatorFormatter implements NumberFormatter {

	public DecimalSeparatorFormatter() {

	}

	@Override
	public String format(int n) {
		String str = Integer.toString(n);
		String result = "";
		int counter = 0;
		for (int i = str.length() - 1; i >= 0 ; i--){
			result = str.charAt(i) + result;
			if(Character.isDigit(str.charAt(i))) {
				counter++;
			}
			if (counter % 3 == 0){
				result = "," + result;
			}
		}
		return result;
	}
}