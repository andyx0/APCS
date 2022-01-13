public class ArrayMethods {

	private int[] values;
	public ArrayMethods(int[] initialValues) {
		values = initialValues;
	}
	//a.
	public void swapFirstAndLast() {
		int temp = values[0];
		values[0] = values[values.length-1];
		values[values.length-1] = temp;
	}
	//b.
	public void shiftRight() {
		int temp = values[values.length-1];
		for(int i = values.length-2; i >= 0; i--) {
			values[i+1] = values[i];
		}
		values[0] = temp;
	}
	//c.
	public void replaceEven() {
		for(int i = 0; i < values.length; i++) {
			if(values[i] % 2 == 0) {
				values[i] = 0;
			}
		}
	}
	//d.
	public void replaceWithNeighbor() {
		for(int i = 1; i < values.length - 1; i++) {
			if(values[i-1] > values[i+1]) {
				values[i] = values[i-1];
			} else {
				values[i] = values[i+1];
			}
		}
	}
	//e.
	public int[] removeMiddle() {
		int[] array;
		if(values.length % 2 == 0) {
			array = new int[values.length-2];
			for(int i = 0; i < values.length; i++) {
				if(i > values.length/2) {
					array[i-2] = values[i];
				} else {
					array[i] = values[i];
				}
			}
		} else {
			array = new int[values.length-1];
			for(int i = 0; i < values.length; i++) {
				if(i > values.length/2) {
					array[i-1] = values[i];
				} else {
					array[i] = values[i];
				}
			}
		}
		values = array;
		return values;
	}
	//f.
	public void evenToFront() {
		int temp;
		for(int i = 0; i < values.length; i++) {
			if(values[i] % 2 == 0) {
				for(int y = 0; y < i; y++) {
					if(values[y] % 2 == 1) {
						temp = values[i];
						values[i] = values[y];
						values[y] = temp;
					}
				}
			}
		}
	}
	//g.
	public int secondLargest() {
		int largest = values[0];
		int secondLargest = values[0]-1;
		for(int i = 1; i < values.length; i++) {
			if(values[i] > largest) {
				secondLargest = largest;
				largest = values[i];
			} else if(values[i] < largest && values[i] > secondLargest) {
				secondLargest = values[i];
			}
		}
		return secondLargest;
	}
	//h.
	public boolean isIncreasing() {
		for(int i = 1; i < values.length; i++) {
			if(values[i] < values[i-1]) {
				return false;
			}
		}
		return true;
	}
	//i.
	public boolean hasAdjacentDuplicates() {
		for(int i = 1; i < values.length; i++) {
			if(values[i] == values[i-1]) {
				return true;
			}
		}
		return false;
	}
	//j.
	public boolean hasDuplicates() {
		for(int i = 0; i < values.length; i++) {
			for(int y = 0; y < i; y++) {
				if(values[i] == values[y]) {
					return true;
				}
			}
		}
		return false;
	}
}
