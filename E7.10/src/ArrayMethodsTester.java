public class ArrayMethodsTester {
	
	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5,6,7,8,10};
		ArrayMethods arr = new ArrayMethods(a);
		arr.swapFirstAndLast();
		for(int i: a) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		int[] b = {1,2,3,4,5,6,7,8,10};
		ArrayMethods sr = new ArrayMethods(b);
		sr.shiftRight();
		for(int i: b) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		int[] c = {1,2,3,4,5,6,7,8,10};
		ArrayMethods re = new ArrayMethods(c);
		re.replaceEven();
		for(int i: c) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		int[] d = {1,2,3,4,5,6,7,8,10};
		ArrayMethods rwn = new ArrayMethods(d);
		rwn.replaceWithNeighbor();
		for(int i: d) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		int[] e = {1,2,3,4,5,6,7,8,9,10};
		ArrayMethods rm = new ArrayMethods(e);
		for(int i: rm.removeMiddle()) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		int[] f = {1,2,3,4,5,6,7,8,10};
		ArrayMethods e2f = new ArrayMethods(f);
		e2f.evenToFront();
		for(int i: f) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		System.out.println(e2f.secondLargest());
		System.out.println(e2f.isIncreasing());
		System.out.println(e2f.hasAdjacentDuplicates());
		System.out.println(e2f.hasDuplicates());
	}
}
