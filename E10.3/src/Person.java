import java.util.*;

public class Person extends Data implements Measurable {
	
	private String name;
	private int height;
	
	public Person(String n, int h) {
		name = n;
		height = h;
	}
	
	public int compareTo(Person other) {
		return this.name.compareTo(other.name);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Person[] ppl = new Person[10];
		String first = "";
		String last = "";
		for(int i = 0; i < 10; i++) {
			System.out.print("Enter a name and a height: ");
			ppl[i] = (new Person(in.next(),in.nextInt()));
			
			if(ppl[i].name.compareTo(first) < 0 || first.equals("")) {
				first = ppl[i].name;
			}
			if(ppl[i].name.compareTo(last) > 0 || last.equals("")) {
				last = ppl[i].name;
			}
			
		}
		System.out.println(first);
		System.out.println(last);
		System.out.println("Average height: " + average(ppl));
		System.out.println("Name of the tallest person: " + ((Person)max(ppl)).name);
	}

	@Override
	public double getMeasure() {
		return height;
	}
}