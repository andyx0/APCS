public class DataSet {
	double[] a = new double[100];
	private double sum;
	private double sumSquare;
	private int n;

	public DataSet() {
		sum = 0;
		sumSquare = 0;
		n = 0;
	}

	public void add(double x) {
		a[n] = x;
		sum = sum + x;
		n++;
	}

	public double getAverage() {
		return sum/n;
	}

	public double getStandardDeviation() {
		for(int i = 0; i < n; i++) {
			sumSquare += Math.pow(a[i] - getAverage(),2);
		}
		return (double) Math.round(Math.sqrt(sumSquare/(n-1))*100)/100;
	}

	public int getCount() {
		return n;
	}
}
