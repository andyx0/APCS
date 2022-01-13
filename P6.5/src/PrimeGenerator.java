public class PrimeGenerator {
	
	private int lastPrime = 0;

	public PrimeGenerator() {
		
	}
	
	public int nextPrime() {
		boolean prime = true;
		for(int n = 2; true; n++) {
			prime = true;
			for(int i = 2; i <= Math.sqrt(n); i++) {
				if(n % i == 0){
					prime = false;
				}
			}
			if(prime && n > lastPrime) {
				lastPrime = n;
				return n;
			}
		}
	}

	public static void main(String[] args) {
		PrimeGenerator generator = new PrimeGenerator();
		System.out.println(generator.nextPrime());
		System.out.println(generator.nextPrime());
		System.out.println(generator.nextPrime());
		System.out.println(generator.nextPrime());
		System.out.println(generator.nextPrime());
		for(int i = 1; i <= 9999; i++)
			generator.nextPrime();
		System.out.println(generator.nextPrime());
	}
}