public class SentenceDemo
{
	public static void main(String[] args)
	{
		String s = "Mississippi!";

		int n = indexOf(s,"sip");
		System.out.println(n);
		System.out.println("Expected: 6");      

		n = indexOf(s,"tip");
		System.out.println(n);
		System.out.println("Expected: -1");
	}

	public static int indexOf(String text, String str) {
		if(text.length() == 0 && str.length() == 0) {
			return 0;
		} else if(text.length() == 0) {
			return -1;
		} else if(str.length() == 0) {
			return 0;
		} else if (text.length() < str.length()) {
			return -1;
		} else if(text.substring(0,str.length()).equals(str)) {
			return 0;
		} else {
			int index = indexOf(text.substring(1), str);
			if(index == -1) {
				return -1;
			}
			return 1 + index;
		}
	}
}