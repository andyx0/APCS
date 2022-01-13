public class E7_6 {
	
	public static void reverse(int[] array) {
		int temp;
		for(int i = 0; i < array.length/2; i++) {
			temp = array[i];
			array[i] = array[array.length-(i+1)];
			array[array.length-(i+1)] = temp;
		}
	}
	
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		reverse(array);
		for(int x: array) {
			System.out.print(x + " ");
		}
	}
}
